package com.wenc.commdomain.dto.stb;

public class InviteVerifyDto {

    private String inviteTelno;

    private String inviteCode;

    private String inviteUser;

    private String inviteType;


    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInviteTelno() {
        return inviteTelno;
    }

    public void setInviteTelno(String inviteTelno) {
        this.inviteTelno = inviteTelno;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getInviteUser() {
        return inviteUser;
    }

    public void setInviteUser(String inviteUser) {
        this.inviteUser = inviteUser;
    }

    public String getInviteType() {
        return inviteType;
    }

    public void setInviteType(String inviteType) {
        this.inviteType = inviteType;
    }
}
