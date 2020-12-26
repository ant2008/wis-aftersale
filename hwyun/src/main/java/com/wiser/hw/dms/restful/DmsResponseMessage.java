package com.wiser.hw.dms.restful;

public class DmsResponseMessage {

    private String handler;

    private DmsResponseMessageBody message;

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public DmsResponseMessageBody getMessage() {
        return message;
    }

    public void setMessage(DmsResponseMessageBody message) {
        this.message = message;
    }
}
