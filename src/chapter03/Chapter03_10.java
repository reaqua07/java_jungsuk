package chapter03;

public class Chapter03_10 {

    public static void main(String[] args) {

        char ch = 'A';
        // 대 -> 소
        // 소 = 대 +32
        char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch + 32) : ch;

        System.out.println("ch : " + ch);
        System.out.println("ch to lowerCase : " + lowerCase);
    }
}
