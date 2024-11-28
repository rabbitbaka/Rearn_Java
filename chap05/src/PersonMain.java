public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("rabat");
        Person person2 = new Person();
        System.out.println("이름: " + person.getName()); // rabat
        person.setName("rabbit");
        person2.setName("TrueName");
        System.out.println("변경된 이름: " + person.getName());
        System.out.println("변경된 이름: " + person2.getName());
    }
}
