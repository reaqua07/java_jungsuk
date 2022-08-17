package chapter03;

public class Chapter03_08 {

    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);

        char ch = 'A';
        ch += 2;

        float f = 3 / 2f;
        long l = 3000L * 3000L * 3000L;

        float f2 = 0.1f;
        double d = 0.1f;

        boolean result = d == f2;

        // 30
        System.out.println("c = " + c);

        // C
        System.out.println("ch = " + ch);

        // 1.5
        System.out.println("f = " + f);

        // 27
        System.out.println("l = " + l);

        // true
        System.out.println("result = " + result);
    }
}
