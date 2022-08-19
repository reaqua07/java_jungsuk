package chapter05;

import java.util.Scanner;

public class Chapter05_13 {

    public static void main(String[] args) {

        String[] words = { "television", "computer", "mouse", "phone" };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            // string -> char []
            char[] question = words[i].toCharArray();

            // question 문자 위치 임의로 바꾼다
            for (int j = 0; j < question.length; j++) {
                int randomNum = (int)(Math.random() * question.length);
                System.out.println(">>>>>>>>>"+randomNum);
                char tmp;
                // 원형
                tmp = question[j];
                question[j] = question[randomNum];
                question[randomNum] = tmp;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요. > ",
                    i + 1, new String(question));

            String answer = scanner.nextLine();

            if (words[i].equals(answer.trim()))
                System.out.printf("맞았습니다. %n%n ");
            else
                System.out.printf("틀렸습니다. %n%n ");
        }

    }
}
