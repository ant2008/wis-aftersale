package com.wiser.aliyun.sms.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerifyCodeDTO {

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
