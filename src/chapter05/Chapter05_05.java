package chapter05;

public class Chapter05_05 {

    public static void main(String[] args) {

        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];


        // 임의로 뽑아서 위치 변경
        for (int i = 0; i < ballArr.length; i++) {
            // 임의로 뽑은 인덱스
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;

            // 원래 요소
            tmp = ballArr[i];
            // 1 <- 3
            ballArr[i] = ballArr[j];
            // 3 <- 1
            ballArr[j] = tmp;
        }

        // ball3에 3개 넣기
        for (int i = 0; i < 3; i++) {
            ball3[i] = ballArr[i];
        }

        for (int i = 0; i < ball3.length; i++) {
            System.out.println(ball3[i]);
        }
    }
}
