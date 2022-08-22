package chapter07;

public class Chapter07_07 {

    public static void main(String[] args) {
        Child c = new Child(); // 1. 인자가 없기 때문에 Child 의 기본 생성자가 호출된다.

        System.out.println("x = " + c.getX()); // 8. getX() 메서드가 상위 클래스에 속해 있기 때문에 200
    }
}

class Parent{
    int x = 100;

    Parent() {
        this(200); // 4. 인자를 받는 생성자 호출
    }

    Parent(int x) { // 5. 최상위 오브젝트 생성자 호출
        this.x = x; // 6. x 값이 200 인 인스턴스로 출력
    }

    int getX() {
        return x;
    }
}

class Child extends Parent{
    int x = 3000;

    Child() {
        this(1000); // 2. int 인자를 받는 생성자가 호출된다.
    }

    Child(int x) {  // 3. 상위 클래스의 기본 생성자 호출
        this.x = x; // 7. x 값이 1000 인 인스턴스가 만들어짐
    }
}
