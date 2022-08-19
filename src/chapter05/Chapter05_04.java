package chapter05;

public class Chapter05_04 {

    public static void main(String[] args) {

        // 2차원 배열
       int[][] arr = {
               {5, 5, 5, 5, 5},
               {10, 10, 10, 10, 10},
               {20, 20, 20, 20, 20},
               {30, 30, 30, 30, 30}
       };

       int total = 0;
       float average = 0;
       int count = 0;

       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               total += arr[i][j];
               count += 1;
           }
       }

       average = (float) total / count;

       System.out.println("total = " + total); // 325
       System.out.println("average = " + average); // 16.25
    }
}
