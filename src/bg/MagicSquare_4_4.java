package bg;

import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare_4_4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num[][] = new int[4][4];
		list = generateList(list);
		while (num[0][0] == 0) {
			num = checkMagicSquare(list, num);
		}
		showMagicSquare(num);
	}

	private static ArrayList<Integer> generateList(ArrayList<Integer> list) {
		// 1～16が格納された配列listを作る
		for (int i = 1; i <= 16; i++) {
			list.add(i);
		}
		// listをシャッフルする
		Collections.shuffle(list);
		return list;
	}

	private static void showMagicSquare(int num[][]) {
		// 4×4の配列numを数表として出力する
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%3d", num[i][j]);
			}
			System.out.println();
		}
	}

	private static int[][] checkMagicSquare(ArrayList<Integer> list, int num[][]) {
		while (true) {
			list.clear();
			list = generateList(list);
			for (int i = 0; i < 4;) {
				for (int j = 0; j < 4; j++) {
					num[i][j] = list.get(j);
				}

				// 横の行の合計値をチェック
				if (mahou4_sumcheck(num[i][0], num[i][1], num[i][2], num[i][3])) {
					for (int j = 0; j < 4; j++) {
						list.remove(0);
					}
					i++;
				} else {
					Collections.shuffle(list);
				}
			}

			// 縦の列の合計値をチェック
			if (!mahou4_sumcheck(num[0][0], num[1][0], num[2][0], num[3][0])) {
				continue;
			}
			if (!mahou4_sumcheck(num[0][1], num[1][1], num[2][1], num[3][1])) {
				continue;
			}
			if (!mahou4_sumcheck(num[0][2], num[1][2], num[2][2], num[3][2])) {
				continue;
			}
			if (!mahou4_sumcheck(num[0][3], num[1][3], num[2][3], num[3][3])) {
				continue;
			}
			num = diagonallyCheck(num);
			if (num == null) {
				continue;
			}
			break;

		}
		return num;
	}

	// 斜めの合計値をチェック
	private static int[][] diagonallyCheck(int num[][]) {
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num2[][] = new int[4][4];
		for (int i = 0; i < 4; i++) {
			list.add(i);
		}
		while (true) {
			Collections.shuffle(list);
			count++;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					num2[i][j] = num[list.get(i)][j];
				}
			}
			if (count >= 50) {
				num2[0][0] = 0;
				return num2;
			}
			if (!mahou4_sumcheck(num2[0][0], num2[1][1], num2[2][2], num2[3][3])) {
				continue;
			}
			if (!mahou4_sumcheck(num2[0][3], num2[1][2], num2[2][1], num2[3][0])) {
				continue;
			}
			break;
		}
		return num2;
	}

	// 合計値が34であるか判定する
	private static boolean mahou4_sumcheck(int num1, int num2, int num3, int num4) {
		if (num1 + num2 + num3 + num4 == 34) {
			return true;
		} else {
			return false;
		}
	}
}