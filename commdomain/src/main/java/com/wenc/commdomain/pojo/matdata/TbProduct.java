package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_product")
public class TbProduct {
    private long idx;
    private String tenantId;
    private String itemId;
    private String extraId;
    private String barCode;
    private String itemSubno;
    private String itemName;
    private String itemSubname;
    private String fileNo;
    private String itemSpec;
    private String itemPack;
    private BigDecimal itemPacknum;
    private String prdOrigin;
    private String prdFactory;
    private String departCode;
    private String vendorId;
    private String abc;
    private String prdAttrib;
    private String manageType;
    private String classCode;
    private Integer ifInsurance;
    private String ifOtc;
    private Integer ifExpensive;
    private Integer ifToxin;
    private String purStatus;
    private String saleStatus;
    private Integer warningDay;
    private String bandCode;
    private Integer state;
    private String minUnit;
    private BigDecimal minPrice;
    private String itemUnit;
    private BigDecimal salePrice;
    private Integer saleTomin;
    private String chkUnit;
    private BigDecimal chkPrice;
    private Integer chkTosale;
    private BigDecimal wholePrice;
    private BigDecimal memPrice;
    private BigDecimal purPrice;
    private BigDecimal realPrice;
    private String rebateType;
    private BigDecimal rebate;
    private BigDecimal saleTax;
    private String weighType;
    private String codeType;
    private String createUser;
    private Timestamp createTime;
    private String modiNo;
    private String codePlant;
    private String tradeMark;
    private String chemName;
    private String chemElement;
    private String ecCode;
    private String outDepot;
    private String costType;
    private String electronicCode;
    private String robotUnit;
    private Integer synRobot;
    private Integer synMqsta;
    private String ifImage;
    private String masterImages;
    private String detailImages;
    private String classCode1;
    private String classCode2;
    private String specClass;
    private String authzTenantId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idx", nullable = false)
    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    @Basic
    @Column(name = "tenant_id", nullable = true, length = 50)
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "item_id", nullable = true, length = 20)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "extra_id", nullable = true, length = 30)
    public String getExtraId() {
        return extraId;
    }

    public void setExtraId(String extraId) {
        this.extraId = extraId;
    }

    @Basic
    @Column(name = "bar_code", nullable = true, length = 30)
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Basic
    @Column(name = "item_subno", nullable = true, length = 10)
    public String getItemSubno() {
        return itemSubno;
    }

    public void setItemSubno(String itemSubno) {
        this.itemSubno = itemSubno;
    }

    @Basic
    @Column(name = "item_name", nullable = true, length = 100)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "item_subname", nullable = true, length = 60)
    public String getItemSubname() {
        return itemSubname;
    }

    public void setItemSubname(String itemSubname) {
        this.itemSubname = itemSubname;
    }

    @Basic
    @Column(name = "file_no", nullable = true, length = 60)
    public String getFileNo() {
        return fileNo;
    }

    public void setFileNo(String fileNo) {
        this.fileNo = fileNo;
    }

    @Basic
    @Column(name = "item_spec", nullable = true, length = 80)
    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    @Basic
    @Column(name = "item_pack", nullable = true, length = 10)
    public String getItemPack() {
        return itemPack;
    }

    public void setItemPack(String itemPack) {
        this.itemPack = itemPack;
    }

    @Basic
    @Column(name = "item_packnum", nullable = true, precision = 3)
    public BigDecimal getItemPacknum() {
        return itemPacknum;
    }

    public void setItemPacknum(BigDecimal itemPacknum) {
        this.itemPacknum = itemPacknum;
    }

    @Basic
    @Column(name = "prd_origin", nullable = true, length = 20)
    public String getPrdOrigin() {
        return prdOrigin;
    }

    public void setPrdOrigin(String prdOrigin) {
        this.prdOrigin = prdOrigin;
    }

    @Basic
    @Column(name = "prd_factory", nullable = true, length = 60)
    public String getPrdFactory() {
        return prdFactory;
    }

    public void setPrdFactory(String prdFactory) {
        this.prdFactory = prdFactory;
    }

    @Basic
    @Column(name = "depart_code", nullable = true, length = 8)
    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode;
    }

    @Basic
    @Column(name = "vendor_id", nullable = true, length = 13)
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Basic
    @Column(name = "abc", nullable = true, length = 10)
    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    @Basic
    @Column(name = "prd_attrib", nullable = true, length = 10)
    public String getPrdAttrib() {
        return prdAttrib;
    }

    public void setPrdAttrib(String prdAttrib) {
        this.prdAttrib = prdAttrib;
    }

    @Basic
    @Column(name = "manage_type", nullable = true, length = 10)
    public String getManageType() {
        return manageType;
    }

    public void setManageType(String manageType) {
        this.manageType = manageType;
    }

    @Basic
    @Column(name = "class_code", nullable = true, length = 10)
    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Basic
    @Column(name = "if_insurance", nullable = true)
    public Integer getIfInsurance() {
        return ifInsurance;
    }

    public void setIfInsurance(Integer ifInsurance) {
        this.ifInsurance = ifInsurance;
    }

    @Basic
    @Column(name = "if_otc", nullable = true, length = 10)
    public String getIfOtc() {
        return ifOtc;
    }

    public void setIfOtc(String ifOtc) {
        this.ifOtc = ifOtc;
    }

    @Basic
    @Column(name = "if_expensive", nullable = true)
    public Integer getIfExpensive() {
        return ifExpensive;
    }

    public void setIfExpensive(Integer ifExpensive) {
        this.ifExpensive = ifExpensive;
    }

    @Basic
    @Column(name = "if_toxin", nullable = true)
    public Integer getIfToxin() {
        return ifToxin;
    }

    public void setIfToxin(Integer ifToxin) {
        this.ifToxin = ifToxin;
    }

    @Basic
    @Column(name = "pur_status", nullable = true, length = 10)
    public String getPurStatus() {
        return purStatus;
    }

    public void setPurStatus(String purStatus) {
        this.purStatus = purStatus;
    }

    @Basic
    @Column(name = "sale_status", nullable = true, length = 10)
    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    @Basic
    @Column(name = "warning_day", nullable = true)
    public Integer getWarningDay() {
        return warningDay;
    }

    public void setWarningDay(Integer warningDay) {
        this.warningDay = warningDay;
    }

    @Basic
    @Column(name = "band_code", nullable = true, length = 10)
    public String getBandCode() {
        return bandCode;
    }

    public void setBandCode(String bandCode) {
        this.bandCode = bandCode;
    }

    @Basic
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "min_unit", nullable = true, length = 10)
    public String getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(String minUnit) {
        this.minUnit = minUnit;
    }

    @Basic
    @Column(name = "min_price", nullable = true, precision = 6)
    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    @Basic
    @Column(name = "item_unit", nullable = true, length = 10)
    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    @Basic
    @Column(name = "sale_price", nullable = true, precision = 6)
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    @Basic
    @Column(name = "sale_tomin", nullable = true)
    public Integer getSaleTomin() {
        return saleTomin;
    }

    public void setSaleTomin(Integer saleTomin) {
        this.saleTomin = saleTomin;
    }

    @Basic
    @Column(name = "chk_unit", nullable = true, length = 10)
    public String getChkUnit() {
        return chkUnit;
    }

    public void setChkUnit(String chkUnit) {
        this.chkUnit = chkUnit;
    }

    @Basic
    @Column(name = "chk_price", nullable = true, precision = 6)
    public BigDecimal getChkPrice() {
        return chkPrice;
    }

    public void setChkPrice(BigDecimal chkPrice) {
        this.chkPrice = chkPrice;
    }

    @Basic
    @Column(name = "chk_tosale", nullable = true)
    public Integer getChkTosale() {
        return chkTosale;
    }

    public void setChkTosale(Integer chkTosale) {
        this.chkTosale = chkTosale;
    }

    @Basic
    @Column(name = "whole_price", nullable = true, precision = 6)
    public BigDecimal getWholePrice() {
        return wholePrice;
    }

    public void setWholePrice(BigDecimal wholePrice) {
        this.wholePrice = wholePrice;
    }

    @Basic
    @Column(name = "mem_price", nullable = true, precision = 6)
    public BigDecimal getMemPrice() {
        return memPrice;
    }

    public void setMemPrice(BigDecimal memPrice) {
        this.memPrice = memPrice;
    }

    @Basic
    @Column(name = "pur_price", nullable = true, precision = 6)
    public BigDecimal getPurPrice() {
        return purPrice;
    }

    public void setPurPrice(BigDecimal purPrice) {
        this.purPrice = purPrice;
    }

    @Basic
    @Column(name = "real_price", nullable = true, precision = 6)
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    @Basic
    @Column(name = "rebate_type", nullable = true, length = 10)
    public String getRebateType() {
        return rebateType;
    }

    public void setRebateType(String rebateType) {
        this.rebateType = rebateType;
    }

    @Basic
    @Column(name = "rebate", nullable = true, precision = 2)
    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    @Basic
    @Column(name = "sale_tax", nullable = true, precision = 2)
    public BigDecimal getSaleTax() {
        return saleTax;
    }

    public void setSaleTax(BigDecimal saleTax) {
        this.saleTax = saleTax;
    }

    @Basic
    @Column(name = "weigh_type", nullable = true, length = 3)
    public String getWeighType() {
        return weighType;
    }

    public void setWeighType(String weighType) {
        this.weighType = weighType;
    }

    @Basic
    @Column(name = "code_type", nullable = true, length = 3)
    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 8)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "modi_no", nullable = true, length = 12)
    public String getModiNo() {
        return modiNo;
    }

    public void setModiNo(String modiNo) {
        this.modiNo = modiNo;
    }

    @Basic
    @Column(name = "code_plant", nullable = true, length = 6)
    public String getCodePlant() {
        return codePlant;
    }

    public void setCodePlant(String codePlant) {
        this.codePlant = codePlant;
    }

    @Basic
    @Column(name = "trade_mark", nullable = true, length = 30)
    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    @Basic
    @Column(name = "chem_name", nullable = true, length = 40)
    public String getChemName() {
        return chemName;
    }

    public void setChemName(String chemName) {
        this.chemName = chemName;
    }

    @Basic
    @Column(name = "chem_element", nullable = true, length = 200)
    public String getChemElement() {
        return chemElement;
    }

    public void setChemElement(String chemElement) {
        this.chemElement = chemElement;
    }

    @Basic
    @Column(name = "ec_code", nullable = true, length = 45)
    public String getEcCode() {
        return ecCode;
    }

    public void setEcCode(String ecCode) {
        this.ecCode = ecCode;
    }

    @Basic
    @Column(name = "out_depot", nullable = true, length = 20)
    public String getOutDepot() {
        return outDepot;
    }

    public void setOutDepot(String outDepot) {
        this.outDepot = outDepot;
    }

    @Basic
    @Column(name = "cost_type", nullable = true, length = 20)
    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    @Basic
    @Column(name = "electronic_code", nullable = true, length = 100)
    public String getElectronicCode() {
        return electronicCode;
    }

    public void setElectronicCode(String electronicCode) {
        this.electronicCode = electronicCode;
    }

    @Basic
    @Column(name = "robot_unit", nullable = true, length = 20)
    public String getRobotUnit() {
        return robotUnit;
    }

    public void setRobotUnit(String robotUnit) {
        this.robotUnit = robotUnit;
    }

    @Basic
    @Column(name = "syn_robot", nullable = true)
    public Integer getSynRobot() {
        return synRobot;
    }

    public void setSynRobot(Integer synRobot) {
        this.synRobot = synRobot;
    }

    @Basic
    @Column(name = "syn_mqsta", nullable = true)
    public Integer getSynMqsta() {
        return synMqsta;
    }

    public void setSynMqsta(Integer synMqsta) {
        this.synMqsta = synMqsta;
    }

    @Basic
    @Column(name = "if_image", nullable = true, length = 10)
    public String getIfImage() {
        return ifImage;
    }

    public void setIfImage(String ifImage) {
        this.ifImage = ifImage;
    }

    @Basic
    @Column(name = "master_images", nullable = true, length = 300)
    public String getMasterImages() {
        return masterImages;
    }

    public void setMasterImages(String masterImages) {
        this.masterImages = masterImages;
    }

    @Basic
    @Column(name = "detail_images", nullable = true, length = 300)
    public String getDetailImages() {
        return detailImages;
    }

    public void setDetailImages(String detailImages) {
        this.detailImages = detailImages;
    }

    @Basic
    @Column(name = "class_code1", nullable = true, length = 20)
    public String getClassCode1() {
        return classCode1;
    }

    public void setClassCode1(String classCode1) {
        this.classCode1 = classCode1;
    }

    @Basic
    @Column(name = "class_code2", nullable = true, length = 20)
    public String getClassCode2() {
        return classCode2;
    }

    public void setClassCode2(String classCode2) {
        this.classCode2 = classCode2;
    }

    @Basic
    @Column(name = "spec_class", nullable = true, length = 20)
    public String getSpecClass() {
        return specClass;
    }

    public void setSpecClass(String specClass) {
        this.specClass = specClass;
    }

    @Basic
    @Column(name = "authz_tenant_id", nullable = true, length = 100)
    public String getAuthzTenantId() {
        return authzTenantId;
    }

    public void setAuthzTenantId(String authzTenantId) {
        this.authzTenantId = authzTenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbProduct tbProduct = (TbProduct) o;
        return idx == tbProduct.idx &&
                Objects.equals(tenantId, tbProduct.tenantId) &&
                Objects.equals(itemId, tbProduct.itemId) &&
                Objects.equals(extraId, tbProduct.extraId) &&
                Objects.equals(barCode, tbProduct.barCode) &&
                Objects.equals(itemSubno, tbProduct.itemSubno) &&
                Objects.equals(itemName, tbProduct.itemName) &&
                Objects.equals(itemSubname, tbProduct.itemSubname) &&
                Objects.equals(fileNo, tbProduct.fileNo) &&
                Objects.equals(itemSpec, tbProduct.itemSpec) &&
                Objects.equals(itemPack, tbProduct.itemPack) &&
                Objects.equals(itemPacknum, tbProduct.itemPacknum) &&
                Objects.equals(prdOrigin, tbProduct.prdOrigin) &&
                Objects.equals(prdFactory, tbProduct.prdFactory) &&
                Objects.equals(departCode, tbProduct.departCode) &&
                Objects.equals(vendorId, tbProduct.vendorId) &&
                Objects.equals(abc, tbProduct.abc) &&
                Objects.equals(prdAttrib, tbProduct.prdAttrib) &&
                Objects.equals(manageType, tbProduct.manageType) &&
                Objects.equals(classCode, tbProduct.classCode) &&
                Objects.equals(ifInsurance, tbProduct.ifInsurance) &&
                Objects.equals(ifOtc, tbProduct.ifOtc) &&
                Objects.equals(ifExpensive, tbProduct.ifExpensive) &&
                Objects.equals(ifToxin, tbProduct.ifToxin) &&
                Objects.equals(purStatus, tbProduct.purStatus) &&
                Objects.equals(saleStatus, tbProduct.saleStatus) &&
                Objects.equals(warningDay, tbProduct.warningDay) &&
                Objects.equals(bandCode, tbProduct.bandCode) &&
                Objects.equals(state, tbProduct.state) &&
                Objects.equals(minUnit, tbProduct.minUnit) &&
                Objects.equals(minPrice, tbProduct.minPrice) &&
                Objects.equals(itemUnit, tbProduct.itemUnit) &&
                Objects.equals(salePrice, tbProduct.salePrice) &&
                Objects.equals(saleTomin, tbProduct.saleTomin) &&
                Objects.equals(chkUnit, tbProduct.chkUnit) &&
                Objects.equals(chkPrice, tbProduct.chkPrice) &&
                Objects.equals(chkTosale, tbProduct.chkTosale) &&
                Objects.equals(wholePrice, tbProduct.wholePrice) &&
                Objects.equals(memPrice, tbProduct.memPrice) &&
                Objects.equals(purPrice, tbProduct.purPrice) &&
                Objects.equals(realPrice, tbProduct.realPrice) &&
                Objects.equals(rebateType, tbProduct.rebateType) &&
                Objects.equals(rebate, tbProduct.rebate) &&
                Objects.equals(saleTax, tbProduct.saleTax) &&
                Objects.equals(weighType, tbProduct.weighType) &&
                Objects.equals(codeType, tbProduct.codeType) &&
                Objects.equals(createUser, tbProduct.createUser) &&
                Objects.equals(createTime, tbProduct.createTime) &&
                Objects.equals(modiNo, tbProduct.modiNo) &&
                Objects.equals(codePlant, tbProduct.codePlant) &&
                Objects.equals(tradeMark, tbProduct.tradeMark) &&
                Objects.equals(chemName, tbProduct.chemName) &&
                Objects.equals(chemElement, tbProduct.chemElement) &&
                Objects.equals(ecCode, tbProduct.ecCode) &&
                Objects.equals(outDepot, tbProduct.outDepot) &&
                Objects.equals(costType, tbProduct.costType) &&
                Objects.equals(electronicCode, tbProduct.electronicCode) &&
                Objects.equals(robotUnit, tbProduct.robotUnit) &&
                Objects.equals(synRobot, tbProduct.synRobot) &&
                Objects.equals(synMqsta, tbProduct.synMqsta) &&
                Objects.equals(ifImage, tbProduct.ifImage) &&
                Objects.equals(masterImages, tbProduct.masterImages) &&
                Objects.equals(detailImages, tbProduct.detailImages) &&
                Objects.equals(classCode1, tbProduct.classCode1) &&
                Objects.equals(classCode2, tbProduct.classCode2) &&
                Objects.equals(specClass, tbProduct.specClass) &&
                Objects.equals(authzTenantId, tbProduct.authzTenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, itemId, extraId, barCode, itemSubno, itemName, itemSubname, fileNo,
                itemSpec, itemPack, itemPacknum, prdOrigin, prdFactory, departCode, vendorId, abc, prdAttrib,
                manageType, classCode, ifInsurance, ifOtc, ifExpensive, ifToxin, purStatus, saleStatus, warningDay,
                bandCode, state, minUnit, minPrice, itemUnit, salePrice, saleTomin, chkUnit, chkPrice, chkTosale,
                wholePrice, memPrice, purPrice, realPrice, rebateType, rebate, saleTax, weighType, codeType, createUser, createTime, modiNo, codePlant, tradeMark, chemName, chemElement, ecCode, outDepot, costType, electronicCode, robotUnit, synRobot, synMqsta, ifImage, masterImages, detailImages, classCode1, classCode2, specClass, authzTenantId);
    }
}
