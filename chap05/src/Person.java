public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("TrueName")){
            this.name = name;
        }
        else {
            System.out.println("진짜 이름이 아닙니다.");
        }
    }
}
