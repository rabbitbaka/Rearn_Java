public class Demo {
    int field;

    public void showDiff(){
        int field = 7;

        this.field = field; // Copy

        System.out.println("클래스 필드: " + this.field);
        System.out.println("메서드 지역변수: " + field);
    }

    public void changeField(int field){
        this.field = field;
    }

    public static void main(String[] args) {
        Demo demoInstance = new Demo();
        demoInstance.showDiff();
        demoInstance.changeField(50);
        System.out.println("변경된 클래스 필드: " + demoInstance.field);
    }
}
