package chapter05;

public class Chapter05_07 {

    public static void main(String[] args) {

        // run 전에 args 넣고 돌려야 함
        // edit
        if (args.length != 1) {
            System.out.println("USAGE: Chapter05_07 3120");
            System.exit(0);
        }

        // 문자열 -> 숫자
        // 숫자 아니면 예외 발생
        int money = Integer.parseInt(args[0]);

        System.out.println("money = " + money);

        int[] coinUnit = {500, 100, 50, 10};
        int[] coin = {5, 5, 5, 5};

        for (int i = 0; i < coinUnit.length; i++) {
            int coinNum = 0;

            // 1. money를 동전 단위로 나눠서 필요한 동전 개수 coinNum
            int unit = coinUnit[i];
            coinNum = money / unit;

            // 2. 배열 coin 에서 coinNum 동전 있는 만큼 빼기
            if (coin[i] >= coinNum) {
                coin[i] -= coinNum;
            } else {
                coinNum = coin[i];
                coin[i] = 0;
            }

            // 3. money - coinNum * 동전 단위
            money -= (unit * coinNum);

            System.out.println(coinUnit[i] + "원 : " + coinNum);
        }
        if (money > 0) {
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0);
        }

        System.out.println(" = 남은 동전의 개수 = ");

        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원 : " + coin[i]);
        }

    }
}
