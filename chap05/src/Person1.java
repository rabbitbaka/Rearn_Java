public class Person1 {
    private String name;
    private int age;

    public Person1(){}

    public static Person1 getInstance(){
        return new Person1();
    }

    public Person1 setName(String name){
        this.name = name;
        return this;
    }

    public Integer setAge(int age){
        this.age = age;
        return this.age;
    }

    public void Hello(){
        System.out.println("안녕, 나는 " + name + "이고 " + age + "살이야. ");
    }

    public static void main(String[] args) {
        Person1 person = getInstance();
        System.out.println(person.setAge(21)); // 21
        person.setName("민규").Hello(); // 안녕, 나는 민규이고 21살이야.
        person.Hello(); // 안녕, 나는 민규이고 21살이야.
    }
}
