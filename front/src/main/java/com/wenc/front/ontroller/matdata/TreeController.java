package com.wenc.front.controller.matdata;

import com.wenc.commonservice.glt.service.GlClassService;
import com.wenc.core.BaseConstant;
import com.wenc.core.model.BaseRetModel;
import com.wenc.core.model.OpListDictModel;
import com.wenc.core.model.el.ElCascaderDTO;
import com.wenc.core.model.el.ElTreeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 树形结构使用controller
 */
@RequestMapping("Tree")
@RestController
public class TreeController {

    @Autowired
    private GlClassService glClassService;


    /**
     * 获取全局分类树状结构
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "GetGlClassTree",method = RequestMethod.GET)
    public BaseRetModel<ElTreeDTO> getAllGlClass(HttpSession session,
                                                 HttpServletRequest request,
                                                 HttpServletResponse response)
    {
        BaseRetModel<ElTreeDTO> retModel = new BaseRetModel<>();

        List<ElTreeDTO> elTreeDTOList = null;

        try
        {
            elTreeDTOList = glClassService.getClassTree();

            retModel.setDataList(elTreeDTOList);

        }catch (Exception ex)
        {
            return retModel.err(BaseConstant.ERROR,ex.getMessage());
        }

        return retModel.ok(BaseConstant.SUCESS,BaseConstant.SUCCESS_MSG);

    }


    /**
     * 获取全局级联分类结构
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "GetGlClassCascaderTree",method = RequestMethod.GET)
    public BaseRetModel<ElCascaderDTO> getGlClassCascaderTree(HttpSession session,
                                                              HttpServletRequest request,
                                                              HttpServletResponse response)
    {
        BaseRetModel<ElCascaderDTO> retModel = new BaseRetModel<>();

        List<ElCascaderDTO> elCascaderDTOS = null;

        try
        {
            elCascaderDTOS = glClassService.getCascaderTree();

            retModel.setDataList(elCascaderDTOS);

        }catch (Exception ex)
        {
            return retModel.err(BaseConstant.ERROR,ex.getMessage());
        }

        return retModel.ok(BaseConstant.SUCESS,BaseConstant.SUCCESS_MSG);

    }



}
