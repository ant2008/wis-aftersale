package com.wiser.hw.dms.restful;

import java.util.List;

public class SendMessage {

     List<SendMessageBody> messages;

     private Boolean returnId;

    public Boolean getReturnId() {
        return returnId;
    }

    public void setReturnId(Boolean returnId) {
        this.returnId = returnId;
    }

    public List<SendMessageBody> getMessages() {
        return messages;
    }

    public void setMessages(List<SendMessageBody> messages) {
        this.messages = messages;
    }
}
