package com.wenc.front.controller.glt;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.wenc.commdomain.pojo.glt.GlClass;
import com.wenc.commdomain.pojo.glt.GlSyspara;
import com.wenc.commonservice.glt.service.GlClassService;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.exception.ControllException;
import com.wenc.core.model.BaseRetModel;
import com.wenc.core.model.SearchConModel;
import com.wenc.core.util.SearchConBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 全局分类管理
 *
 */
@RequestMapping("GlClass")
@RestController
public class GlClassController extends AbstractBaseSingleController<GlClass,GlClass> {

    @Autowired
    private GlClassService glClassService;


    public GlClassController() {
        super();
    }


    @Override
    public void InitCreate(GlClass aModel) throws Exception {
        aModel.setState(0);
        aModel.setCreateUser(getLoginUserId());
    }


    @Override
    public void beforeCreate(HttpSession session, HttpServletRequest request, GlClass aModel) throws Exception {

        String newClassCode = "";

        try
        {

            newClassCode = glClassService.getMaxClassCode(aModel.getParentCode());

            if(StrUtil.isBlank(newClassCode))
            {
                throw new ControllException("生成新的分类编码错误!");
            }

            aModel.setClassCode(newClassCode);
            aModel.setState(1);

        }catch (Exception ex)
        {
            throw new ControllException(ex.getMessage());
        }
    }



    @Override
    public void buildQuickCons(List<SearchConModel> searchConModels, String aWhere) {
        String tmpWhere = "";

        SearchConModel searchConModel = null;

        try{

            if(aWhere == null || aWhere.trim().equals(""))
            {
                tmpWhere = "%%";
            }else {
                tmpWhere = "%"+aWhere+"%";
            }

            //按商品名、助记符、或者编码、条码查询
            searchConModel = SearchConBuilder.newInstance()
                    .colName("classCode").operaSign("=").colValue(aWhere).relationShip("or").leftBracket("(").buildSearchCon();

            searchConModels.add(searchConModel);

            searchConModel=SearchConBuilder.newInstance()
                    .colName("parentCode").operaSign("=").colValue(tmpWhere).relationShip("or").buildSearchCon();

            searchConModels.add(searchConModel);

            searchConModel = SearchConBuilder.newInstance()
                    .colName("classDescr").operaSign("like").colValue(tmpWhere).rightBracket(")").relationShip("and").buildSearchCon();
            searchConModels.add(searchConModel);

            searchConModel = SearchConBuilder.newInstance()
                    .colName("state").operaSign("=").colValue(1).buildSearchCon();
            searchConModels.add(searchConModel);


        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }




}
