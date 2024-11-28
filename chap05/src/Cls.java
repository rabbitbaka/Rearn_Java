public class Cls {
    static double radius;

    public Cls(){
        this.radius = radius;
    };

    public Cls(double r){
        this.radius = r;
    }
    double getVolume(){
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    double getArea(){
        return 4 * Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Cls ball = new Cls(2.0);
        Cls ball2 = new Cls();
        System.out.println("부피: " + ball2.getVolume());
        System.out.println("표면적: " + ball2.getArea());
    }
}
