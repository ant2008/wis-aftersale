package com.wiser.aftersale.domain.vo;

public class WxMiniCodeSessionVO {

    //	用户唯一标识
    private String openId;

    //会话密钥
    private String sessionKey;

    //用户在开放平台的唯一标识符
    private String unionId;

    //错误标识
    private int errCode;

    //错误信息
    private String errMsg;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

}
