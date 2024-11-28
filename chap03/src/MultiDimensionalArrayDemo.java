public class MultiDimensionalArrayDemo {

    public static void main(String[] args) {
        // 3행 4열의 2차원 배열 선언 및 초기화
        int[][] scores = {
                {100, 90, 50, 95},  // 첫 번째 행의 점수 배열
                {70, 60, 82, 75},   // 두 번째 행의 점수 배열
                {90, 80, 70, 60}    // 세 번째 행의 점수 배열
        };

        // 첫 번째 행의 첫 번째 열에 있는 점수에 접근
        int firstRowFirstCol = scores[0][0];
        System.out.println("첫 번째 행의 첫 번째 점수: " + firstRowFirstCol);

        // 두 번째 행의 세 번째 열에 있는 점수에 접근
        int secondRowThirdCol = scores[1][2];
        System.out.println("두 번째 행의 세 번째 점수: " + secondRowThirdCol);

        // 배열의 크기 출력
        System.out.println("2차원 배열의 행의 수: " + scores.length);
        System.out.println("첫 번째 행의 열의 수: " + scores[0].length);

        // 2차원 배열의 모든 원소를 순회하며 출력
        System.out.println("2차원 배열의 모든 점수:");
        for (int i = 0; i < scores.length; i++) {       // 각 행에 대해 반복
            for (int j = 0; j < scores[i].length; j++) { // 해당 행의 각 열에 대해 반복
                System.out.print(scores[i][j] + " ");
            }
            System.out.println(); // 한 행을 출력한 후 줄바꿈
        }

        for (int[] score : scores){
            for (int i : score){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
