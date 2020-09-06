package com.wenc.sys.service;

import com.wenc.commdomain.vo.bsys.RoleVO;

import java.util.List;

/**
 * 角色服务
 *
 * @author li.w
 */
public interface RoleService {

    /**
     * 获取所有激活角色
     *
     * @return
     */
    List<RoleVO> listRoles();



}
