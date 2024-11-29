package com.chap06.sub02;

public class Student extends Person {
    int id;

    public Student() {
    }

    Student(String name, int id){
        super(name);
        this.id = id;
    }

    @Override
    void introduce(){
        System.out.println("학번: " + id);
    }
}

