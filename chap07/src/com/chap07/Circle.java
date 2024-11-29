package com.chap07;

public class Circle extends Shape{
    private double radius;

    public Circle(double r){
        this.radius=r;
    }

    @Override
    public void draw() {
        System.out.println("원을 그림. 반지름: " + radius);
    }
}