package chapter07;



public class Chapter07_01 {

    public static void main(String[] args) {

        SutdaDeck deck = new SutdaDeck();
        // 07_01
//        for (int i = 0; i < deck.cards.length; i++) {
//            System.out.println(deck.cards[i] + ",");
//        }

        // 07_02
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }

        System.out.println();
        System.out.println(deck.pick(0));

    }
}

class SutdaDeck {
    final int CARD_NUM = 20;

    // 20 장 들어갈 수 있는 카드 덱 생성됨
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    // 20장 데이터 만들어야 함
    // 1-10 / 1-10 총 20개
    // 1, 3, 8 광
    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            // 1-10 / 1-10
            int num = i % 10 + 1;
            // 138 앞에 한장만
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            // 카드덱
            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int)(Math.random() * cards.length);
            SutdaCard card = cards[i];
            cards[i] = cards[j];
            cards[j] = card;
        }
    }

    public SutdaCard pick(int index) {
        return cards[index];
    }

    public SutdaCard pick() {
        int random = (int)(Math.random() * cards.length);
        return cards[random];
    }
}

class SutdaCard {
    final int NUM; // 상수로 처리해서 변경되지 않게 바꿈
    final boolean IS_KWANG;

    SutdaCard(){
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.NUM = num;
        this.IS_KWANG = isKwang;
    }

    public String toString() {
        return NUM + (IS_KWANG ? "K" : "");
    }
}
