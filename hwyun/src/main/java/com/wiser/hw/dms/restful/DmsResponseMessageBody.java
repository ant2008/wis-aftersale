package com.wiser.hw.dms.restful;

import java.util.List;
import java.util.Map;

public class DmsResponseMessageBody {

    private String body;

    private Map<String,String> attributes;

    private List<String> tags;


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
