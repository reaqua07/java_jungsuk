package chapter04;

public class Chapter04_15 {

    public static void main(String[] args) {

        int number = 12321;
        int tmp = number;

        int result = 0;

        while (tmp != 0) {
            // 5 5
            // 4 54
            // 3 543
            // 2 5432
            // 1 54321
            result = tmp % 10 + result * 10;
            System.out.println(result);

            tmp /= 10;
            System.out.println(tmp);
        }

        if (number == result)
            System.out.println(number + " 는 회문수 입니다.");
        else
            System.out.println(number + " 는 회문수가 아닙니다.");
    }
}
