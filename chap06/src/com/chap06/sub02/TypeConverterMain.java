package com.chap06.sub02;

public class TypeConverterMain {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();

        downcast(p);
        downcast(s);
    }

    static void downcast(Person p){
        if (p instanceof Student) {
            Student s = (Student) p;
            System.out.println("다운캐스팅 성공");
        } else {
            System.out.println("다운캐스팅 불가");
        }
    }
}
