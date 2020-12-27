package edu.boot.protobuf.pojo;

import java.util.HashMap;
import java.util.Map;

public class MessagePojo {
    private int messageID;
    private String messageContent;
    private Map<String, String> metadata;

    public MessagePojo(int messageID, String messageContent, Map<String, String> metadata) {
        this.messageID = messageID;
        this.messageContent = messageContent;
        this.metadata = metadata;
    }

    public MessagePojo(int messageID, String messageContent) {
        this.messageID = messageID;
        this.messageContent = messageContent;
        metadata = new HashMap<>();
    }

    public MessagePojo(int messageID) {
        this.messageID = messageID;
        metadata = new HashMap<>();
    }

    public MessagePojo() {
    }

    public void addMetaDataProp(String key, String val) {
        if(metadata == null) {
            metadata = new HashMap<>();
        }
        metadata.put(key, val);
    }

    public int getMessageID() {
        return messageID;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("messageID", messageID)
                .append("messageContent", messageContent)
                .append("metadata", metadata)
                .toString();
    }
}
