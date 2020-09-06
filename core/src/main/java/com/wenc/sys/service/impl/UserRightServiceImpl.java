package com.wenc.sys.service.impl;

import com.wenc.sys.dao.SsFuncHRepository;
import com.wenc.sys.dao.VFuncRightRepository;
import com.wenc.sys.dao.VRoleFuncdRepository;
import com.wenc.sys.service.UserRightService;
import com.wenc.commdomain.exception.NullUserRightException;
import com.wenc.commdomain.pojo.core.SsFuncH;
import com.wenc.commdomain.pojo.core.VFuncRight;
import com.wenc.commdomain.pojo.core.VRoleFuncd;
import com.wenc.core.model.MenuModel;
import com.wenc.core.model.VueRouterMetaModel;
import com.wenc.core.model.VueRouterModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserRightServiceImpl implements UserRightService {


    private Logger LOG = LoggerFactory.getLogger(UserRightServiceImpl.class);


    @Autowired
    private VFuncRightRepository vFuncRightRepository;

    @Autowired
    private VRoleFuncdRepository vRoleFuncdRepository;

    @Autowired
    private SsFuncHRepository ssFuncHRepository;

    @Override
    public boolean getRoleFuncd(String aUserid, String aFuncno, String aLevel) {
        List<VRoleFuncd> retList = null;

        retList = vRoleFuncdRepository.getVRoleFuncdsByUserIdAndFuncNoAndRoleRight(aUserid, aFuncno, aLevel);

        if (retList == null || retList.size() <= 0) {
            return false;
        }

        return true;

    }

    /**
     * 获取tenant下的角色明细。
     *
     * @param aUserid
     * @param aFuncno
     * @param aLevel
     * @param aTenantId
     * @return
     */
    @Override
    public boolean getRoleFuncd(String aUserid, String aFuncno, String aLevel, String aTenantId) {
        List<VRoleFuncd> retList = null;

        retList = vRoleFuncdRepository.getVRoleFuncdsByUserIdAndFuncNoAndRoleRightAndAndTenantId(
                aUserid,
                aFuncno,
                aLevel,
                aTenantId);

        if (retList == null || retList.size() <= 0) {
            return false;
        }

        return true;
    }

    /**
     * 按用户ID构建树形菜单
     * todo:待测试
     *
     * @param aUserId
     * @return
     */
    @Override
    public List<MenuModel> buildMenuTree(String aUserId) {
        List<VFuncRight> fList = null;

        List<VFuncRight> nodeList = null;
        List<VFuncRight> nodeList2 = null;
        List<VFuncRight> nodeList3 = null;

        List<MenuModel> mList = null;
        List<MenuModel> nList = null;


        List<SsFuncH> pList = null;


        MenuModel menuModel = null;
        MenuModel rootModel = null;
        MenuModel leafModel = null;


        MenuModel menuModel2 = null;
        MenuModel leafModel2 = null;


        try {
            //第一层权限
            pList = ssFuncHRepository.getSsFuncHByParentNo("0");

            //获取用户权限
            fList = vFuncRightRepository.getVFuncRightsByUserId(aUserId);


            //
            mList = new ArrayList<MenuModel>(); //菜单类型


            //首个节点
            //root;
            rootModel = new MenuModel();

            rootModel.setRoot(true);
            rootModel.setText("菜单");
            rootModel.setLeaf(false);
            rootModel.setExpanded(true);
            rootModel.setId("0");
            rootModel.setParentId("-1");


            //first menu
            if (pList != null) {

                //init first child menu.
                nList = new ArrayList<MenuModel>();

                //循环第一层菜单
                for (int i = 0; i < pList.size(); i++) {
                    SsFuncH item = pList.get(i);

                    menuModel = new MenuModel();
                    menuModel.setText(item.getDescr().trim());
                    menuModel.setId(item.getFuncNo().trim());
                    menuModel.setParentId("0");
                    menuModel.setQtip(item.getDescr().trim());
                    menuModel.setQtitle(item.getDescr().trim());
                    menuModel.setRoot(false);
                    menuModel.setHref("");
                    menuModel.setExpanded(true); //


                    //先设置叶子
                    menuModel.setLeaf(true);


                    nodeList2 = null;

                    //Object if exits second menu.
                    if (getVFuncRightFromList(item.getFuncNo().trim(), fList) != null) {


                        menuModel.setLeaf(false);
                        menuModel.setChildren(new ArrayList<MenuModel>());


                        nodeList2 = getVFuncRightList(item.getFuncNo().trim(), fList);

                        for (int j = 0; j < nodeList2.size(); j++) {

                            VFuncRight itemLeaf = nodeList2.get(j);

                            if (itemLeaf == null) {
                                continue;
                            }


                            //组成树状节点。
                            leafModel = new MenuModel();
                            leafModel.setId(itemLeaf.getFuncNo().trim());
                            leafModel.setHref("");
                            leafModel.setIconCls(itemLeaf.getMenuImg());

                            leafModel.setParentId(item.getFuncNo().trim());//parent node equals pre node.

                            leafModel.setLeaf(true);
                            leafModel.setQtip(itemLeaf.getDescr().trim());
                            leafModel.setQtitle(itemLeaf.getDescr().trim());
                            leafModel.setRoot(false);
                            leafModel.setText(itemLeaf.getDescr().trim());
                            leafModel.setExpanded(true);
                            leafModel.setHrefTarget(itemLeaf.getMenuUrl()); //Just mvc framework need to record controller name.

                            leafModel.setChildren(null);


                            //如果还有第三层则继续，否则组装叶子。
                            nodeList3 = getVFuncRightList(itemLeaf.getFuncNo(), fList);
                            if (nodeList3 != null && nodeList3.size() > 0) {

                                leafModel.setExpanded(false);
                                leafModel.setIconCls(null);
                                leafModel.setLeaf(false);
                                leafModel.setHrefTarget(null); //不设置连接。
                                leafModel.setChildren(new ArrayList<MenuModel>());


                                for (int k = 0; k < nodeList3.size(); k++) {
                                    VFuncRight itemLeaf3 = nodeList3.get(k);

                                    if (itemLeaf3 == null) {
                                        continue;
                                    }

                                    //组成树状节点。
                                    leafModel2 = new MenuModel();
                                    leafModel2.setId(itemLeaf3.getFuncNo().trim());
                                    leafModel2.setHref("");
                                    leafModel2.setIconCls(itemLeaf3.getMenuImg());

                                    leafModel2.setParentId(itemLeaf.getFuncNo().trim());//parent node equals pre node.

                                    leafModel2.setLeaf(true);
                                    leafModel2.setQtip(itemLeaf3.getDescr().trim());
                                    leafModel2.setQtitle(itemLeaf3.getDescr().trim());
                                    leafModel2.setRoot(false);
                                    leafModel2.setText(itemLeaf3.getDescr().trim());
                                    leafModel2.setExpanded(false);
                                    leafModel2.setHrefTarget(itemLeaf3.getMenuUrl()); //Just mvc framework need to record controller name.

                                    leafModel2.setChildren(null);

                                    leafModel.getChildren().add(leafModel2);//put the node to parent code.

                                }
                            }


                            menuModel.getChildren().add(leafModel);//put the node to parent code.


                            //
                            menuModel.setExpanded(false);


                        }

                    }

                    //add first level node to parent node.
                    nList.add(menuModel);

                }

                //if first node has not child node. then delete first node.
                MenuModel removeMenu = null;
                for (int t = nList.size() - 1; t >= 0; t--) {
                    removeMenu = nList.get(t);
                    if (removeMenu.getChildren() == null ||
                            removeMenu.getChildren().size() <= 0) {
                        nList.remove(t);
                    }

                }


                rootModel.setChildren(nList); //


            }


            mList.add(rootModel);


        } catch (Exception ex) {

            ex.printStackTrace();
        }

        //modify:不要首个节点
        return nList;

    }

    /**
     * 从List中获取funcno权限对象。
     *
     * @param aFuncNo
     * @param aList
     * @return
     */
    @Override
    public VFuncRight getVFuncRightFromList(String aFuncNo, List<VFuncRight> aList) {

        try {

            if (aFuncNo == null || aList == null) {
                return null;
            }

            if (aList.stream().filter(o -> o.getParentNo().trim().equals(aFuncNo)).count() > 0) {

                return aList.stream().filter(o -> o.getParentNo().trim().equals(aFuncNo)).findFirst().get();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    /**
     * 根据用户ID和功能号获取权限对象。
     *
     * @param aUserId
     * @param aFuncNo
     * @return
     */
    @Override
    public VFuncRight getFuncRight(String aUserId, String aFuncNo) {

        VFuncRight vFuncRight = null;

        try {

            vFuncRight = vFuncRightRepository.getUseVFuncRightsByUserIdAndFuncNo(aUserId, aFuncNo);


        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return vFuncRight;
    }

    /**
     * 建立前台使用的router数据结构。
     *
     * @param aUserId
     * @return
     */
    @Override
    public List<VueRouterModel> buildRouter(String aUserId) {
        List<VFuncRight> fList = null;
        List<SsFuncH> pList = null;


        List<VFuncRight> nodeList2 = null;
        List<VFuncRight> nodeList3 = null;


        List<VueRouterModel> vueRouterModels = null;
        List<VueRouterModel> firstRouterList = null;
        List<VueRouterModel> childRouterList = null;

        VueRouterModel vueRouterModel = null;
        VueRouterMetaModel vueRouterMetaModel = null;


        VueRouterModel vueRouter1Model = null;
        VueRouterMetaModel vueRouter1MetaModel = null;


        try {
            //第一层权限
            pList = ssFuncHRepository.getSsFuncHByParentNo("0");

            //获取用户权限
            fList = vFuncRightRepository.getVFuncRightsByUserId(aUserId);


            //router list
            vueRouterModels = new ArrayList<>();


            //首个节点
            //root;

            //first menu
            if (pList != null) {

                //init first child menu.
                firstRouterList = new ArrayList<>();

                //循环第一层菜单
                for (int i = 0; i < pList.size(); i++) {
                    SsFuncH item = pList.get(i);


                    vueRouter1Model = new VueRouterModel();


                    vueRouter1Model.setPath("/" + item.getMenuUrl());
                    vueRouter1Model.setName(item.getFuncNo());
                    vueRouter1Model.setComponent(item.getMenuPath());
                    vueRouter1Model.setChildren(null); //先设置无子菜单

                    vueRouter1MetaModel = new VueRouterMetaModel();

                    vueRouter1MetaModel.setTitle(item.getDescr());
                    vueRouter1MetaModel.setIcon(item.getMenuImg());

                    if (item.getState() == 0) {
                        vueRouter1MetaModel.setHideInBread(true);
                        vueRouter1MetaModel.setHideInMenu(true);
                    }


                    vueRouter1Model.setMeta(vueRouter1MetaModel);


                    //第二层router.

                    nodeList2 = null;

                    //Object if exits second menu.
                    if (getVFuncRightFromList(item.getFuncNo().trim(), fList) != null) {


                        //第二层子router
                        childRouterList = new ArrayList<>();


                        nodeList2 = getVFuncRightList(item.getFuncNo().trim(), fList);

                        for (int j = 0; j < nodeList2.size(); j++) {

                            VFuncRight itemLeaf = nodeList2.get(j);

                            if (itemLeaf == null) {
                                continue;
                            }


                            //组成树状节点。

                            vueRouterModel = new VueRouterModel();

                            vueRouterModel.setPath("/" + itemLeaf.getMenuUrl());
                            vueRouterModel.setName(itemLeaf.getFuncNo());
                            vueRouterModel.setComponent(itemLeaf.getMenuPath());
                            vueRouterModel.setChildren(null); //先设置无子菜单

                            vueRouterMetaModel = new VueRouterMetaModel();

                            vueRouterMetaModel.setTitle(itemLeaf.getDescr());
                            vueRouterMetaModel.setIcon(itemLeaf.getMenuImg());

                            if (item.getState() == 0) {
                                vueRouterMetaModel.setHideInBread(true);
                                vueRouterMetaModel.setHideInMenu(true);
                            }


                            vueRouterModel.setMeta(vueRouterMetaModel);


                            //组装成list.
                            childRouterList.add(vueRouterModel);


                        }
                    }

                    //设置子节点。
                    vueRouter1Model.setChildren(childRouterList);

                    vueRouterModels.add(vueRouter1Model);
                }

                //add first level node to parent node.
                //nList.add(menuModel);

            }

            //if first node has not child node. then delete first node.
            VueRouterModel removeMenu = null;
            for (int t = vueRouterModels.size() - 1; t >= 0; t--) {
                removeMenu = vueRouterModels.get(t);
                if (removeMenu.getChildren() == null ||
                        removeMenu.getChildren().size() <= 0) {
                    vueRouterModels.remove(t);
                }

            }


        } catch (Exception ex) {

            ex.printStackTrace();
        }


        return vueRouterModels;
    }

    /**
     * 根据用户获取ID
     *
     * @param aUserId
     * @return
     */
    @Override
    public List<VueRouterModel> getRouter(String aUserId) {
        List<VFuncRight> fList = null;
        List<SsFuncH> pList = null;


        List<VFuncRight> nodeList2 = null;
        List<VFuncRight> nodeList3 = null;


        List<VueRouterModel> vueRouterModels = null;
        List<VueRouterModel> firstRouterList = null;
        List<VueRouterModel> childRouterList = null;

        VueRouterModel vueRouterModel = null;
        VueRouterMetaModel vueRouterMetaModel = null;


        VueRouterModel vueRouter1Model = null;
        VueRouterMetaModel vueRouter1MetaModel = null;


        SsFuncH funcHNode = null;


        try {
            //第一层权限
            pList = ssFuncHRepository.getSsFuncHByParentNo("0");

            //获取用户权限
            fList = vFuncRightRepository.getVFuncRightsByUserId(aUserId);



            //循环第一层，如果不存在第二层的子类，则删除。
            for (int i = pList.size() - 1; i >= 0; i--) {

                funcHNode = pList.get(i);

                final String tmpFuncNo = funcHNode.getFuncNo();

                if(fList.stream().filter(o->o.getParentNo().trim().equals(tmpFuncNo.trim())).count() <=0 )
                {
                      pList.remove(funcHNode);
                }

            }



            //router list
            vueRouterModels = new ArrayList<>();


            //首个节点
            //root;

            //first menu
            if (pList != null) {

                //init first child menu.
                firstRouterList = new ArrayList<>();

                //循环第一层菜单
                for (int i = 0; i < pList.size(); i++) {
                    SsFuncH item = pList.get(i);


                    vueRouter1Model = new VueRouterModel();


                    //此处修改,不再需要设置MenuUrl直接使用funcno.

                    vueRouter1Model.setPath("/" + item.getFuncNo());
                    vueRouter1Model.setName(item.getFuncNo());
                    vueRouter1Model.setComponent(item.getMenuPath());
                    vueRouter1Model.setChildren(null); //先设置无子菜单

                    vueRouter1MetaModel = new VueRouterMetaModel();

                    vueRouter1MetaModel.setTitle(item.getDescr());
                    vueRouter1MetaModel.setIcon(item.getMenuImg());

                    if (item.getState() == 0) {
                        vueRouter1MetaModel.setHideInBread(true);
                        vueRouter1MetaModel.setHideInMenu(true);
                    }


                    vueRouter1Model.setMeta(vueRouter1MetaModel);

                    vueRouterModels.add(vueRouter1Model);
                }


                //第二层router.

                for (int j = 0; j < fList.size(); j++) {

                    VFuncRight itemLeaf = fList.get(j);

                    if (itemLeaf == null) {
                        continue;
                    }


                    //组成树状节点。

                    vueRouterModel = new VueRouterModel();

                    vueRouterModel.setPath("/" + itemLeaf.getFuncNo());
                    vueRouterModel.setName(itemLeaf.getFuncNo());
                    vueRouterModel.setComponent(itemLeaf.getMenuPath());
                    //先设置无子菜单
                    vueRouterModel.setChildren(null);

                    vueRouterMetaModel = new VueRouterMetaModel();

                    vueRouterMetaModel.setTitle(itemLeaf.getDescr());
                    vueRouterMetaModel.setIcon(itemLeaf.getMenuImg());

                    if (itemLeaf.getUserStatus() == 0) {
                        vueRouterMetaModel.setHideInBread(true);
                        vueRouterMetaModel.setHideInMenu(true);
                    }


                    vueRouterModel.setMeta(vueRouterMetaModel);


                    vueRouterModels.add(vueRouterModel);
                }


                //if first node has not child node. then delete first node.
//                VueRouterModel removeMenu = null;
//                for (int t = vueRouterModels.size() - 1; t >= 0; t--) {
//                    removeMenu = vueRouterModels.get(t);
//                    if (removeMenu.getChildren() == null ||
//                            removeMenu.getChildren().size() <= 0) {
//                        vueRouterModels.remove(t);
//                    }
//
//                }
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        }


        return vueRouterModels;
    }

    /**
     * 按用户获取可使用菜单权限
     *
     * @param aUserId
     * @return
     */
    @Override
    public List<VFuncRight> getUserFunc(String aUserId) {

        return vFuncRightRepository.getVFuncRightsByUserId(aUserId);
    }

    /**
     * 获取用户权限获取头部权限。
     *
     * @param aUserId 用户ID
     * @param aFuncno 功能号
     * @return
     */
    @Override
    public VFuncRight getFuncByUseridAndFuncno(String aUserId, String aFuncno) {

        VFuncRight vFuncRight = null;

        try {

            vFuncRight = vFuncRightRepository.getUseVFuncRightsByUserIdAndFuncNo(aUserId, aFuncno);

            if (vFuncRight == null) {
                throw new NullUserRightException("用户权限为空!");
            }


        } catch (NullUserRightException cex) {
            cex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return vFuncRight;
    }

    /**
     * 检查是否具备某项功能操作。
     *
     * @param aUserId
     * @param aFuncNo
     * @return
     */
    @Override
    public boolean checkUserRightByUserIdAndFuncno(String aUserId, String aFuncNo, String aCmd) {

        VFuncRight vFuncRight = null;

        try {

            vFuncRight = getFuncRight(aUserId, aFuncNo);

            if (vFuncRight == null) {
                LOG.debug("vFuncRight为null!");
                return false;
            }

            if (aUserId == null || aUserId.trim().equals("")) {
                LOG.debug("aUserId Is Null");
                return false;
            }

            if (aFuncNo == null || aFuncNo.trim().equals("")) {
                LOG.debug("aFuncNo Is Null");
                return false;
            }

            if (aCmd == null || aCmd.trim().equals("")) {
                LOG.debug("aCmd is Null!");
                return false;
            }

            //判断增加权限
            //TODO:未完成，待续
            if (aCmd != null && aCmd.trim().toUpperCase().equals("ADD")) {
                if (vFuncRight.getAddr().intValue() == 1) {
                    return true;
                } else {
                    return false;
                }
            }


        } catch (Exception ex) {
            LOG.error(ex.getMessage());
        }

        return false;
    }


    /**
     * 获取菜单权限List;
     *
     * @param aFuncno
     * @param aList
     * @return
     */
    public List<VFuncRight> getVFuncRightList(String aFuncno, List<VFuncRight> aList) {
        List<VFuncRight> retList = null;
        VFuncRight func = null;

        Iterator<VFuncRight> it = aList.iterator();
        if (it == null) {
            return null;
        }

        retList = new ArrayList<VFuncRight>();
        while (it.hasNext()) {
            func = (VFuncRight) it.next();

            if (func == null) {
                continue;
            }
            if (func.getParentNo() == null) {
                continue;
            }

            //logger.debug("func:"+func.getId()+"=="+aFuncno.trim());

            if (func.getParentNo().trim().toLowerCase().equals(aFuncno.trim().toLowerCase())) {
                retList.add(func);
            }
        }

        return retList;
    }


}
