package com.example.homeworkjasonapi.message;

import com.example.homeworkjasonapi.logic.IMessage;


public  class OutputMessage implements IMessage {
    public String solution;

    public OutputMessage(String solution) {
        this.solution = solution;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}