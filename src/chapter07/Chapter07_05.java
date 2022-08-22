package chapter07;

public class Chapter07_05 {

    public static void main(String[] args) {
        Tv t = new Tv();
    }
}

class Product {
    int price;
    int bonusPoint;

    Product(){} // 기본 생성자 정의해줌

    Product(int price) { // 기본 생성자 이외의 생성자가 정의되면 컴파일러는 기본 생성자를 자동으로 안 만들어줌
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {

    Tv(){} // 하위 생성자의 기본 생성자는 super() 즉 상위 클래스의 기본 생성자를 호출함


    public String toString() {
        return "Tv";
    }
}

