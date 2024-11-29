package com.chap07;

public class InterfaceMain {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        myClass.sayHello();
        myClass.sayHello("홍길동");

        MyInterface1 class1 = new MyClass();
        class1.sayHello();

        MyInterface2 class2 = new MyClass(); //위에랑 같은거임
        class2.sayHello("홍길동");
    }
}
