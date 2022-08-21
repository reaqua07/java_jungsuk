package chapter06;

public class Chapter06_23 {

    public static int max(int[] data) {
        if (null == data || data.length == 0) {
            return -999999;
        }
        int result = data[0];
        for(int i = 1; i < data.length; i++) {
            if (data[i] > result) {
                result = data[i];
            }
        }
        return result;
    }


    public static void main(String[] args) {

        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 : " + max(data));
        System.out.println("최대값 : " + max(null));
        System.out.println("최대값 : " + max(new int[]{}));

    }
}
