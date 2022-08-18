package chapter04;

public class Chapter04_10 {

    public static void main(String[] args) {

        // 5
        // 4
        // 3
        // 2
        // 1
        int num = 12345;
        int sum = 0;

        while (num > 0) {
            // 나머지
            sum += num % 10;
            num /= 10;
        }

        System.out.println("sum = " + sum);

    }
}
