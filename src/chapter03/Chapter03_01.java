package chapter03;

public class Chapter03_01 {

    public static void main(String[] args) {

        int x = 2;
        int y = 5;

        char c = 'A'; // 65

        // 쉬프트 연산자
        // 1 + 2 << 33
        // 3 << 33(33-32=1)
        // 11 << 1
        // 110 = 6
        System.out.println(1 + x << 33);

        // 5 >= 5 or 2 < 0 and 2 > 2
        // true or (false and false)
        // true
        System.out.println(y >= 5 || x < 0 && x > 2);

        // 5 += 10 - 2++
        // 15 - 2
        // 13
        // x 값 변경 = 3
        System.out.println(y += 10 - x++);

        // 3 += 2
        // 5
        System.out.println(x+=2);

        // !('A' <= c and c <= 'Z')
        // !(true and true)
        // !true
        // false
        System.out.println( !('A' <= c && c <='Z') );

        // 67 - 65
        // 2
        System.out.println('C'-c);

        // 53 - 48
        // 5
        System.out.println('5'-'0');

        // 'A' + 1
        // 65 + 1
        // 66
        System.out.println(c+1);

        // ++'A'
        // ++65
        // 66
        // ++은 형변환 안함
        // c 값 변경
        System.out.println(++c);

        // 'B'++
        System.out.println(c++);
        // c 값 변경

        // 'C'
        System.out.println(c);
    }
}
