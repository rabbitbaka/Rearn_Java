package com.chap07;

public class abstractMain {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.draw(); // circle메서드 호출

        Shape shape = new Circle(15);
        shape.draw(); // shape들렸다가 circle메서드 호출
    }
}
