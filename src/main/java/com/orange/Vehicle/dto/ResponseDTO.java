package com.orange.Vehicle.dto;

public class ResponseDTO {
    private String code;
    private String message;
    private Object content;

    // No-argument constructor
    public ResponseDTO() {}

    // All-argument constructor
    public ResponseDTO(String code, String message, Object content) {
        this.code = code;
        this.message = message;
        this.content = content;
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", content=" + content +
                '}';
    }
}
