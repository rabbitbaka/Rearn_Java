public class DoWhileEx {
    public static void main(String[] args) {
        int i = 1, j = 1;

        while (i < 1) {
            System.out.println("while 루프 " + i + "번째 반복 ");
            i++;
        }
        System.out.println("while 루프 종료 후 i값 : " + i + "입니다.");
        do {
            System.out.println("do while 루프 " + j + "번째 반복");
            j++;
        } while (j < 1);
        System.out.println("do while 루프 종료 후 j값은 "+ j + "입니다.");
    }
}
