package chapter04;

public class Chapter04_02 {

    public static void main(String[] args) {

        int numSum = 0;

        for(int i = 1; i < 21; i++) {
            if(i % 2 != 0 && i % 3 != 0) {
                numSum += i;
            }
        }

        System.out.println(numSum);

    }
}
