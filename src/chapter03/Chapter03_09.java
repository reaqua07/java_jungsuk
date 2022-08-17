package chapter03;

public class Chapter03_09 {

    public static void main(String[] args) {

        char ch = 'z';
        // 영문이거나 숫자일때만 참
        boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');

        System.out.println(b);
    }
}
