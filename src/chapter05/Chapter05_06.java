package chapter05;

public class Chapter05_06 {

    public static void main(String[] args) {

        // 큰 금액 먼저
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;

        System.out.println("money = " + money);

        for (int i = 0; i < coinUnit.length; i++) {
            int coin = coinUnit[i];
            int coins = money / coin;
            System.out.println(coin + "원 : " + coins);
            money -= (coin * coins);
        }
    }
}
