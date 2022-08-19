package chapter05;

public class Chapter05_08 {

    public static void main(String[] args) {

        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        // 1 3개 0
        // 2 2개 1
        // 3 2개 2
        // 4 4개 3
        for (int i = 0; i < answer.length; i++) {
            // 숫자 카운팅해서 counter 에 넣는다.
            counter[answer[i] - 1]++;
        }

        for (int i = 0; i < counter.length; i++) {
            // 숫자
            System.out.print(counter[i]);
            // 별
            for (int j = 0; j < counter[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
