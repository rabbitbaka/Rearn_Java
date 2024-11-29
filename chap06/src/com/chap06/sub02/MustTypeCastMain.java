package com.chap06.sub02;

public class MustTypeCastMain {
    public static void main(String[] args) {
        Person person = new Person("사람");
        Student student = new Student("학생", 101);

        if(person instanceof Person){
            System.out.println("person은 Person 클래스의 인스턴스임.");
        }
        if(student instanceof Person){
            System.out.println("student는 Person 클래스의 인스턴스임 (상속 관계)");
        }

        if (person instanceof Student){
            Student castedStudent = (Student) person;
            castedStudent.introduce();
        } else{
            System.out.println("person은 Student로 변환 불가.");
        }

        person.introduce();
        Person p = student;
        p.introduce();

        if(p instanceof Student){
            Student s = (Student) p;
            s.introduce();
        }
    }
}
