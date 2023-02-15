package com.example.homeworkjasonapi.message;

import com.example.homeworkjasonapi.logic.Circle;
import com.example.homeworkjasonapi.logic.IMessage;


public  class InputMessage implements IMessage {
    private Circle circle;
    private boolean isSquare;
    public InputMessage(int rad,boolean isSquare){
        this.circle = new Circle(rad);
        this.isSquare = isSquare;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public boolean isSquare() {
        return isSquare;
    }

    public void setSquare(boolean square) {
        isSquare = square;
    }

    @Override
    public String toString() {
        return "InputMessage{" +
                "circle=" + circle +
                ", isSquare=" + isSquare +
                '}';
    }
}
