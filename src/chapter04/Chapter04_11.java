package chapter04;

public class Chapter04_11 {

    public static void main(String[] args) {

        // 1 1 2 3 5 8 13 21

        int num1 = 1;
        int num2 = 1;
        int num3 = 0; // 세번째값

        System.out.print(num1 + " , " + num2);

        for (int i = 0; i < 8; i++) {
            // 0 1+1 2
            // 1   1+2 3
            // 2     2+3 5
            // 3       3+5 8
            num3 = num1 + num2;
            System.out.print(" , " + num3);
            num1 = num2;
            num2 = num3;
        }

    }
}
