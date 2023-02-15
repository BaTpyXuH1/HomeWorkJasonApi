package com.example.homeworkjasonapi.logic;

public class Circle {

    public int rad;// радиус


    public Circle(int rad) {
        this.rad = rad;
    }

    public double square() {
        double square = Math.PI * (rad * rad);
        return square;
    }

    public double length() {
        double length = Math.PI * (rad * 2);
        return length;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "rad=" + rad +
                '}';
    }
}
