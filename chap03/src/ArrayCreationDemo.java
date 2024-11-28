public class ArrayCreationDemo {
    public static void main(String[] args) {
        int[] scoreMethod1 = {100, 90, 50, 95, 85};

        int[] scoreMethod2 = new int[] {100, 90, 50, 95, 85};

        int[] scoreMethod3;
        scoreMethod3= new int[] {100, 90, 50, 95, 85};

        System.out.println("방법 1로 생성한 배열: ");
        for (int score : scoreMethod1){
            System.out.print(score+" ");
        }
        System.out.println();

        System.out.println("방법 2로 생성한 배열: ");
        for (int score : scoreMethod2){
            System.out.print(score+" ");
        }
        System.out.println();

        System.out.println("방법 3로 생성한 배열: ");
        for (int score : scoreMethod3){
            System.out.print(score+" ");
        }
        System.out.println();
    }
}
