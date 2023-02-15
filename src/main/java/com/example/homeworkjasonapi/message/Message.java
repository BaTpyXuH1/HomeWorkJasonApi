package com.example.homeworkjasonapi.message;

import com.example.homeworkjasonapi.logic.IMessage;


import java.util.Date;

public  class Message implements IMessage {
    private String message;  // строка сообщения
    private Date time;       // время сообщения

    public Message(String message) {
        this.message = message;
        this.time = new Date(); // записываем время создания сообщения
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", time=" + time +
                '}';
    }
}