package chapter04;

public class Chapter04_09 {

    public static void main(String[] args) {

        // 1 2 3 4 5
        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            // 문자 -> 숫자
            sum += str.charAt(i) - '0';
        }
        System.out.println("sum = " + sum);

    }
}
