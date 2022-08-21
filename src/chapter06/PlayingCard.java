package chapter06;

public class PlayingCard {

    int kind; // 인스턴스 변수

    int num; // 인스턴스 변수

    static int width; // 클래스 변수

    static int height; // 클래스 변수

    PlayingCard(int k, int n) { // 지역 변수
        kind = k;
        num = n;
    }

    public static void main (String args[]) {
        PlayingCard card = new PlayingCard(1, 1);
    }
}
