package chapter05;

public class Chapter05_09 {

    public static void main(String[] args) {

        char[][] star = {
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        };

        char[][] result = new char[star[0].length][star.length];

        // 원형
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();



        // 배열을 90도 회전해서 출력 5*4
        // 각 배열의 첫줄이 첫 배열
        // 그 다음 배열이 두번째 배열
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                // 0 3 4 -1
                // 1 2 4 -1 -1
                // 2 1 4 -1 -2
                // 3 0 4 -1 -3
                result[j][star.length - 1 - i] = star[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }
}
