package chapter07;

public class Chapter07_20 {

    public static void main(String[] args) {
        Parent1 p = new Child1();
        Child1 c = new Child1();

        System.out.println("p.x = " + p.x); // 100
        // 재정의 우선 순위
        p.method(); // Child Method

        System.out.println("c.x = " + c.x); // 200
        c.method(); // Child Method
    }

}

class Parent1 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child1 extends Parent1 {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}