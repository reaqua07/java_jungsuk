package chapter05;

public class Chapter05_11 {

    public static void main(String[] args) {

        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };

        int[][] result = new int[score.length + 1][ score[0].length + 1];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {

                // 공통 부분
                result[i][j] = score[i][j];

                // 한 배열의 합은 배열 끝에
                result[i][score[0].length] += result[i][j];

                // 배열 첫번째 요소 합은 새로운 배열에
                result[score.length][j] += result[i][j];

                // 마지막 새로 생긴 배열 합
                result[score.length][score[0].length] += result[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }

    }
}
