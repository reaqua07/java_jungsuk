package chapter07;

public class Chapter07_25 {

    public static void main(String[] args) {
        // 외부 클래스 먼저 호출해야함
        Outer outer = new Outer();
        // 외부.내부
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.iv);
    }
}

class Outer {
    class Inner {
        int iv = 100;
    }
}
