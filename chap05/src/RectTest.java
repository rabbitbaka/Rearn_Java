class Rect{
    private double w;
    private double h;

    public Rect(){
        this(1.0,1.0);
    }
    public Rect(double w){
         this(w,1.0);
    }
    public Rect(double width, double height){
        this.w = width;
        this.h = height;
    }

    public void printSize(){
        this.printSize("이름없음");
    }
    public void printSize(String name){
        System.out.println(name + "님이 요청한 결과입니다.");
        System.out.println("너비: " + w + ", 높이: " + h);
    }
}
public class RectTest {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        Rect r2 = new Rect(2.0, 3.0);

        r2.printSize();
    }
}
