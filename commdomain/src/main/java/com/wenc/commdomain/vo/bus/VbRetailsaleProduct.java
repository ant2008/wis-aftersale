package com.wenc.commdomain.vo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_retailsale_product")
public class VbRetailsaleProduct {
    private long idx;
    private String tenantId;
    private String itemId;
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
    private Byte ifInsurance;
    private String ifOtc;
    private Byte ifExpensive;
    private Byte ifToxin;
    private String purStatus;
    private String saleStatus;
    private Short warningDay;
    private String bandCode;
    private Byte state;
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
    private Timestamp lastmodify;
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
    private BigDecimal itemQty;
    private String depotId;
    private BigDecimal avgPurprice;

    @Id
    @Basic
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
    @Column(name = "item_id", nullable = true, length = 13)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
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
    @Column(name = "item_pack", nullable = true, length = 3)
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
    @Column(name = "abc", nullable = true, length = 1)
    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    @Basic
    @Column(name = "prd_attrib", nullable = true, length = 3)
    public String getPrdAttrib() {
        return prdAttrib;
    }

    public void setPrdAttrib(String prdAttrib) {
        this.prdAttrib = prdAttrib;
    }

    @Basic
    @Column(name = "manage_type", nullable = true, length = 3)
    public String getManageType() {
        return manageType;
    }

    public void setManageType(String manageType) {
        this.manageType = manageType;
    }

    @Basic
    @Column(name = "class_code", nullable = true, length = 8)
    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Basic
    @Column(name = "if_insurance", nullable = true)
    public Byte getIfInsurance() {
        return ifInsurance;
    }

    public void setIfInsurance(Byte ifInsurance) {
        this.ifInsurance = ifInsurance;
    }

    @Basic
    @Column(name = "if_otc", nullable = true, length = 1)
    public String getIfOtc() {
        return ifOtc;
    }

    public void setIfOtc(String ifOtc) {
        this.ifOtc = ifOtc;
    }

    @Basic
    @Column(name = "if_expensive", nullable = true)
    public Byte getIfExpensive() {
        return ifExpensive;
    }

    public void setIfExpensive(Byte ifExpensive) {
        this.ifExpensive = ifExpensive;
    }

    @Basic
    @Column(name = "if_toxin", nullable = true)
    public Byte getIfToxin() {
        return ifToxin;
    }

    public void setIfToxin(Byte ifToxin) {
        this.ifToxin = ifToxin;
    }

    @Basic
    @Column(name = "pur_status", nullable = true, length = 3)
    public String getPurStatus() {
        return purStatus;
    }

    public void setPurStatus(String purStatus) {
        this.purStatus = purStatus;
    }

    @Basic
    @Column(name = "sale_status", nullable = true, length = 3)
    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    @Basic
    @Column(name = "warning_day", nullable = true)
    public Short getWarningDay() {
        return warningDay;
    }

    public void setWarningDay(Short warningDay) {
        this.warningDay = warningDay;
    }

    @Basic
    @Column(name = "band_code", nullable = true, length = 5)
    public String getBandCode() {
        return bandCode;
    }

    public void setBandCode(String bandCode) {
        this.bandCode = bandCode;
    }

    @Basic
    @Column(name = "state", nullable = true)
    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Basic
    @Column(name = "min_unit", nullable = true, length = 3)
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
    @Column(name = "item_unit", nullable = true, length = 3)
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
    @Column(name = "chk_unit", nullable = true, length = 3)
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
    @Column(name = "rebate_type", nullable = true, length = 3)
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
    @Column(name = "lastmodify", nullable = false)
    public Timestamp getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Timestamp lastmodify) {
        this.lastmodify = lastmodify;
    }

    @Basic
    @Column(name = "code_plant", nullable = false, length = 6)
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

    @Basic
    @Column(name = "item_qty", nullable = false, precision = 3)
    public BigDecimal getItemQty() {
        return itemQty;
    }

    public void setItemQty(BigDecimal itemQty) {
        this.itemQty = itemQty;
    }

    @Basic
    @Column(name = "depot_id", nullable = true, length = 15)
    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    @Basic
    @Column(name = "avg_purprice", nullable = true, precision = 6)
    public BigDecimal getAvgPurprice() {
        return avgPurprice;
    }

    public void setAvgPurprice(BigDecimal avgPurprice) {
        this.avgPurprice = avgPurprice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbRetailsaleProduct that = (VbRetailsaleProduct) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(barCode, that.barCode) &&
                Objects.equals(itemSubno, that.itemSubno) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemSubname, that.itemSubname) &&
                Objects.equals(fileNo, that.fileNo) &&
                Objects.equals(itemSpec, that.itemSpec) &&
                Objects.equals(itemPack, that.itemPack) &&
                Objects.equals(itemPacknum, that.itemPacknum) &&
                Objects.equals(prdOrigin, that.prdOrigin) &&
                Objects.equals(prdFactory, that.prdFactory) &&
                Objects.equals(departCode, that.departCode) &&
                Objects.equals(vendorId, that.vendorId) &&
                Objects.equals(abc, that.abc) &&
                Objects.equals(prdAttrib, that.prdAttrib) &&
                Objects.equals(manageType, that.manageType) &&
                Objects.equals(classCode, that.classCode) &&
                Objects.equals(ifInsurance, that.ifInsurance) &&
                Objects.equals(ifOtc, that.ifOtc) &&
                Objects.equals(ifExpensive, that.ifExpensive) &&
                Objects.equals(ifToxin, that.ifToxin) &&
                Objects.equals(purStatus, that.purStatus) &&
                Objects.equals(saleStatus, that.saleStatus) &&
                Objects.equals(warningDay, that.warningDay) &&
                Objects.equals(bandCode, that.bandCode) &&
                Objects.equals(state, that.state) &&
                Objects.equals(minUnit, that.minUnit) &&
                Objects.equals(minPrice, that.minPrice) &&
                Objects.equals(itemUnit, that.itemUnit) &&
                Objects.equals(salePrice, that.salePrice) &&
                Objects.equals(saleTomin, that.saleTomin) &&
                Objects.equals(chkUnit, that.chkUnit) &&
                Objects.equals(chkPrice, that.chkPrice) &&
                Objects.equals(chkTosale, that.chkTosale) &&
                Objects.equals(wholePrice, that.wholePrice) &&
                Objects.equals(memPrice, that.memPrice) &&
                Objects.equals(purPrice, that.purPrice) &&
                Objects.equals(realPrice, that.realPrice) &&
                Objects.equals(rebateType, that.rebateType) &&
                Objects.equals(rebate, that.rebate) &&
                Objects.equals(saleTax, that.saleTax) &&
                Objects.equals(weighType, that.weighType) &&
                Objects.equals(codeType, that.codeType) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modiNo, that.modiNo) &&
                Objects.equals(lastmodify, that.lastmodify) &&
                Objects.equals(codePlant, that.codePlant) &&
                Objects.equals(tradeMark, that.tradeMark) &&
                Objects.equals(chemName, that.chemName) &&
                Objects.equals(chemElement, that.chemElement) &&
                Objects.equals(ecCode, that.ecCode) &&
                Objects.equals(outDepot, that.outDepot) &&
                Objects.equals(costType, that.costType) &&
                Objects.equals(electronicCode, that.electronicCode) &&
                Objects.equals(robotUnit, that.robotUnit) &&
                Objects.equals(synRobot, that.synRobot) &&
                Objects.equals(synMqsta, that.synMqsta) &&
                Objects.equals(ifImage, that.ifImage) &&
                Objects.equals(masterImages, that.masterImages) &&
                Objects.equals(detailImages, that.detailImages) &&
                Objects.equals(classCode1, that.classCode1) &&
                Objects.equals(classCode2, that.classCode2) &&
                Objects.equals(specClass, that.specClass) &&
                Objects.equals(authzTenantId, that.authzTenantId) &&
                Objects.equals(itemQty, that.itemQty) &&
                Objects.equals(depotId, that.depotId) &&
                Objects.equals(avgPurprice, that.avgPurprice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, itemId, barCode, itemSubno, itemName, itemSubname, fileNo, itemSpec,
                itemPack, itemPacknum, prdOrigin, prdFactory, departCode, vendorId, abc, prdAttrib, manageType,
                classCode, ifInsurance, ifOtc, ifExpensive, ifToxin, purStatus, saleStatus, warningDay, bandCode,
                state, minUnit, minPrice, itemUnit, salePrice, saleTomin, chkUnit, chkPrice, chkTosale, wholePrice,
                memPrice, purPrice, realPrice, rebateType, rebate, saleTax, weighType, codeType, createUser, createTime, modiNo, lastmodify, codePlant, tradeMark, chemName, chemElement, ecCode, outDepot, costType, electronicCode, robotUnit, synRobot, synMqsta, ifImage, masterImages, detailImages, classCode1, classCode2, specClass, authzTenantId, itemQty, depotId, avgPurprice);
    }
}
