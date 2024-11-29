package com.chap07;

public class MyClass implements MyInterface1, MyInterface2 {
    @Override
    public void sayHello() {
        System.out.println("안녕하세요, 최대값은: " + MAX);
    }

    @Override
    public void sayHello(String name) {
        System.out.println("안녕하세요, 제 이름은: " + name);
    }
}
