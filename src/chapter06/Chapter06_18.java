package chapter06;

public class Chapter06_18 {

    class MemberCall {

        int iv = 10;

        static int cv = 20;

        int iv2 = cv;

        // static int cv2 = iv; // 클래스 변수에 인스턴스 변수의 값을 넣을 수 없음

        static void staticMethod1() {
            System.out.println(cv);
            //System.out.println(iv); // 클래스 메서드에 인스턴스 변수 사용 못함
        }

        void instanceMethod1() {
            System.out.println(cv);
            System.out.println(iv);
        }

        static void staticMethod2() {
            staticMethod1();
            //instanceMethod1(); // 클래스 메서드에서 인스턴스 메서드 사용 못함
        }

        void instanceMethod2() {
            staticMethod1();
            instanceMethod1();
        }

    }
}
