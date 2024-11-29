package com.chap07;

public interface MyInterface1 {
    // 모든 인터페이스 변수는 public static final 이어야 하므로,
    // 아래 변수 MAX는 public static final int MAX = 10;으로 컴파일됨.
    int MAX = 10;
    // 인터페이스 메소드는 기본적으로 public abstract이어야 함
    void sayHello();
}
