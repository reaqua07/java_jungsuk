package chapter07;

public class Chapter07_27 {

    public static void main(String args[]) {

        Outer2 outer = new Outer2();
        Outer2.Inner2 inner = outer.new Inner2();
        inner.method1();

    }

}

class Outer2 {
    int value = 10;

    class Inner2 {
        int value = 20;
        void method1() {
            int value = 30;

            System.out.println(value); // 30
            System.out.println(this.value); // 20
            System.out.println(Outer2.this.value); // 10
        }
    }
}
