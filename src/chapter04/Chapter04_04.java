package chapter04;

public class Chapter04_04 {

    public static void main(String[] args) {


        // for 돌면서 부호만 바꿈 총합
        // 1 * 1
        // 2 * -1
        // 3 * 1
        // 4 * -1

        int sum = 0; // 100
        int result = 0; // 마지막으로 더해진 값
        int sign = 1;

        for (int i = 1; ; i++) {

            if ( sum >= 100 ) {
                break;
            } else {
                sign = i % 2 == 0 ? -1 : 1;
                result = i * sign;
                sum += result;
            }
        }
        System.out.println(sum);
        System.out.println(result);
    }
}
