package chapter07;

import java.util.Arrays;

public class Chapter07_19 {

    public static void main(String args[]) {
        Buyer b = new Buyer();

        b.buy(new Tv1());
        b.buy(new Computer());
        b.buy(new Tv1());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    // 구입 제품을 저장
    Product1[] cart = new Product1[3];
    // index
    int i = 0;

    void buy(Product1 p) {
        // 가진 돈이랑 가격 비교
        // < 메서드 종료
        if(money < p.price) {
            System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
        } else {
            // >= 가진 돈 - 가격
            money -= p.price;
            // add
            add(p);
        }

    }

    void add(Product1 p) {
        // i >= 장바구니 크기
        if (i >= cart.length) {
            // 2배 큰 새로운 장바구니 생성
            Product1[] twiceCart = new Product1[cart.length * 2];
            // 기존 장바구니 복사
            twiceCart = Arrays.copyOf(cart, twiceCart.length);
            // 새로운 장바구니로 업글
            cart = twiceCart;
        }
        // 장바구니에 저장 i 1++
        cart[i++] = p;
    }

    void summary() {
        String productList = "";
        int total = 0;
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                break;
            }
            // 장바구니 목록
            productList += cart[i] + ",";
            // 가격 더하기
            total += cart[i].price;
        }
        // 남은 금액 money
        System.out.println("구입한 물건 : " + productList);
        System.out.println("사용한 금액 : " + total);
        System.out.println("남은 금액 : " + money);
    }
}

class Product1 {
    int price;

    Product1(int price) {
        this.price = price;
    }
}

class Tv1 extends Product1 {
    Tv1() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product1 {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product1 {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}
