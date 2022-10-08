package bg;

import java.util.Arrays;

public class MismatchTest2 {

    public static void main(String[] args) {
        int[] num1 = { 1, 2, 3, 4, 5, 6 };
        int[] num2 = { 1, 2, 3, 5, 4, 6 };
        int[] num3 = Arrays.copyOf(num1, num1.length);
        int[] num4 = Arrays.copyOf(num2, num2.length);
        int index, sum = 0;
        System.out.println(Arrays.toString(num3));
        System.out.println(Arrays.toString(num4));

        for (int i = 0; i < num1.length; i++) {
            index = Arrays.mismatch(num1, num2);
            if (index != -1) {
                System.out.println(sum + 1 + "個目:" + (index + 1));
                i = index;
                sum++;
                num1[i] = 0;
                num2[i] = 0;
            }
        }
        System.out.println("該当個数:" + sum);
    }
}