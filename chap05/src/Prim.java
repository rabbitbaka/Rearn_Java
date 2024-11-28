import com.sun.security.jgss.GSSUtil;

class Ball {
    double radius;

    public Ball(double r){
        radius = r;
    }
    public void setRadius(double r){
        radius = r;
    }
}
public class Prim {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // 기본 값 복사
        b = 20; // b값 변경

        System.out.println("a의 값: " + a); // 10
        System.out.println("b의 값: " + b); // 20

        Ball myBall = new Ball(4.0);
        Ball yourBall = myBall; // 참조 타입 값(주소) 복사
        Ball otherBall = yourBall; // 참조 타입 값(주소) 복사2
        yourBall.setRadius(5.0); // yourBall로 객체값 변경
        otherBall.setRadius(6.0); // otherBall로 객체값 변경

        System.out.println("myBall의 반지름: " + myBall.radius); // 6.0
        System.out.println("yourBall의 반지름: " + yourBall.radius); // 6.0
        System.out.println("otherBall의 반지름: " + otherBall.radius); // 6.0
    }
}
