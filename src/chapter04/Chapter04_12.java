package chapter04;

public class Chapter04_12 {

    public static void main(String[] args) {


        // 구구단
        for (int i = 1; i < 10; i++){ // 9단
            for (int j = 1; j < 4; j++) { // 3줄씩
                // 1 1 2*1
                // 1 2 3*1
                // 1 3 4*1
                // 2 1 2*2
                // 2 2 3*2
                // 2 3 4*2
                // 3     3

                // 4   5 1
                // 5   6
                // 6   7

                // 7
                // 8
                // 9 1 8*3
                // 9 2 9*3
                // 9 3 10*3
                int num1 = 0;
                int num2 = i % 3 == 0 ? 3 : i % 3;

                System.out.print(num1 + " * " + num2 + " = " + (num1 * num2) + "\t");
            }
            System.out.println("");
        }

    }
}
