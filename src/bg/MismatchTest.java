package bg;

import java.util.Arrays;

public class MismatchTest {

    public static void main(String[] args) {

        int[] num1 = { 1, 2, 3, 4, 5, 6 };
        int[] num2 = { 1, 2, 3, 5, 4, 6 };
        int[] num3 = { 1, 2, 3, 4, 5, 6 };

        // num1,num2を比較する。添え字3の要素が違うので3が返される
        System.out.println(Arrays.mismatch(num1, num2));

        // num1,num2を比較する。一致しているので-1が返される
        System.out.println(Arrays.mismatch(num1, num3));
    }
}
