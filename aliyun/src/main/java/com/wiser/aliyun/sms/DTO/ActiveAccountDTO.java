package com.wiser.aliyun.sms.DTO;

import lombok.Getter;
import lombok.Setter;


public class ActiveAccountDTO {

    private String userId;

    private String userName;

    private String userPwd;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
