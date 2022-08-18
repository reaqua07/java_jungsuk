package chapter04;

public class Chapter04_06 {

    public static void main(String[] args) {

        // x + y = 6
        // 1 5
        // 2 4
        // 3 3
        // 4 2
        // 5 1

        for(int i = 1; i < 7; i++) {
            for(int j = 1; j < 7; j++) {
                if(i + j == 6) {
                    System.out.println(i + " + " + j + " = " + (i + j));
                }
            }
        }


    }
}
