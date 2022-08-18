package chapter04;

public class Chapter04_08 {

    public static void main(String[] args) {

        // 2x + 4y = 10

        for (int x = 0; x < 11; x++) {
            for (int y = 0; y < 11; y++) {
                if (((2 * x) + (4 * y)) == 10) {
                    System.out.println("x = " + x + " y = " + y);
                }
            }
        }

    }
}
