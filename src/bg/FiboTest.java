package bg;

import java.util.Arrays;

public class FiboTest {

    public static void main(String[] args) {

        FiboTest fiboTest = new FiboTest();
        int[] Fibo;
        // 10番目まで求めたいので10を代入
        int num = 10;
        Fibo = fiboTest.getFibonacciSequence(num);

        // Fiboを出力する
        System.out.println(Arrays.toString(Fibo));
    }

    int[] getFibonacciSequence(int num) {

        int[] Fibo = new int[num];
        // 配列の1番目と2番目に0と1を格納する
        Fibo[0] = 0;
        Fibo[1] = 1;

        // 3番目以降に1つ前と2つ前の数字を足した数字を入れる
        for (int i = 2; i < num; i++) {
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }

        return Fibo;

    }

}
