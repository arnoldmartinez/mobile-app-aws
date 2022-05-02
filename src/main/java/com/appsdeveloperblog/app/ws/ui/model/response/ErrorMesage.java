package com.appsdeveloperblog.app.ws.ui.model.response;

import java.util.Date;

public class ErrorMesage {

    public ErrorMesage() {}

    public ErrorMesage(Date timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    private Date timestamp;
    private String message;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorMesage{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                '}';
    }
}
