package chapter04;

public class Chapter04_03 {

    public static void main(String[] args) {

        // 1 / 12 / 123 / 1234

        int preSum = 0;
        int totalSum = 0;

        for (int i = 1; i < 11; i++) {
            preSum += i;
            totalSum += preSum;
        }

        System.out.println(totalSum);

    }
}
