package chapter07;

public class Chapter07_26 {

    public static void main(String[] args) {
        // 외부 클래스에서 바로 호출 가능 - 스태틱
        Outer1.Inner inner = new Outer1.Inner();
        System.out.println(inner.iv);
    }
}

class Outer1 {
    static class Inner {
        int iv = 200;
    }
}
