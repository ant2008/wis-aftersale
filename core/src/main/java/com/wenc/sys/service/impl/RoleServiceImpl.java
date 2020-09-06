package com.wenc.sys.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.wenc.commdomain.pojo.core.SsRole;
import com.wenc.commdomain.vo.bsys.RoleVO;
import com.wenc.sys.dao.SsRoleRepository;
import com.wenc.sys.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    protected SsRoleRepository ssRoleRepository;

    /**
     * 获取所有激活角色

     * @return
     */
    @Override
    public List<RoleVO> listRoles() {

        List<SsRole> ssRoles = null;

        List<RoleVO> roleVOS = null;
        RoleVO roleVO = null;

        ssRoles = ssRoleRepository.findAllRoles();

        if(ssRoles == null || ssRoles.size() <= 0 )
        {
            return null;
        }

        roleVOS = new ArrayList<>();

        for (int i = 0; i < ssRoles.size(); i++) {

            if(ssRoles.get(i) != null)
            {
                roleVO = new RoleVO();
                BeanUtil.copyProperties(ssRoles.get(i),roleVO);
                roleVOS.add(roleVO);
            }
        }

        return roleVOS;
    }
}
