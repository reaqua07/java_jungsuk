package chapter03;

public class Chapter03_07 {

    public static void main(String[] args) {

        int fahrenheit = 100;
//        float f = 5/9f;
        float celcius = (5/9f * (fahrenheit - 32));

        // C = 5/9 * (fahrenheit - 32)
        // 소수점 셋째자리 반올림
        // 37.77778
        System.out.println("fahrenheit : " + fahrenheit);
        System.out.println("celcius : " + celcius);
    }
}
