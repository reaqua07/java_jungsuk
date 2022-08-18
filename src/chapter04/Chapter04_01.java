package chapter04;

public class Chapter04_01 {

    public static void main(String[] args) {

        // 1. 10 보다 크고 20 보다 작을 때
        int x = 15;
        if(10 < x && x < 20) {
            System.out.println("true");
        }

        // 2. 공백이나 탭이 아닐 때
        char ch = 'A';
        if(!(ch == ' ' || ch == '\t')) {
            System.out.println("true");
        }

        // 3. 'x' 또는 'X'
        char ch2 = 'x';
        if(ch2 == 'x' || ch2 == 'X') {
            System.out.println("true");
        }

        // 4. 0~9
        char ch3 = '2';
        if('0' <= ch3 && ch3 <= '9') {
            System.out.println("true");
        }

        // 5. 대문자 또는 소문자
        char ch4 = 'A';
        if(('a' <= ch4 && ch4 <= 'z' ) || ('A' <= ch4 && ch4 <= 'Z')) {
            System.out.println("true");
        }

        // 6. 400 0 || 4 0 && 100 !
        int year = 1600;
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("true");
        }

        // 7. powerOn false -> true
        // !powerOn

        // 8. yes
        String str = "yes";
        if("yes".equals(str)){
            System.out.println("true");
        }
    }
}
