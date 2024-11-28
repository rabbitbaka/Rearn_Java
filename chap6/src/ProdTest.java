class Prod {
    int id;
    String name;

    Prod(int i, String n) {
        id = i;
        name = n;
    }

    void info() {
        System.out.println(id + " : " + name);
    }
}
class ExtProd extends Prod {
    int qty;
    ExtProd(int i, String n, int q) {
        super(i,n);
        qty = q;
    }
    @Override
    void info() {
        System.out.println(id + " : " + name + "의 갯수는 " + qty);
    }
}
public class ProdTest {
    public static void main(String[] args) {
        Prod p = new Prod(1,"Pen");
        ExtProd ep = new ExtProd(2, "Notebook", 10);

        p.info(); // 1 : Pen
        ep.info(); // 2 : Notebook의 갯수는 10
    }
}
