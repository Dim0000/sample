package bg;

import java.util.Scanner;

public class FibogoldTest extends FiboTest{

	public static void main(String[] args) {

		// 比較したい数列の場所を入力する
		Scanner scan = new Scanner(System.in);
		System.out.println("整数を入力");
		int num = scan.nextInt();
		scan.close();

		FibogoldTest fibogoldTest = new FibogoldTest();	
		// 配列Fiboを宣言し、数列を取得
		int[] Fibo ;
        Fibo = fibogoldTest.getFibonacciSequence(num);

		// 黄金比を求める
		double gold = (1 + Math.sqrt(5)) / 2;

		// フィボナッチ数列の比と黄金比との差を出す
		System.out.println("黄金比との差:" + (gold - (Fibo[num - 1] / Fibo[num - 2])));
	}

}
