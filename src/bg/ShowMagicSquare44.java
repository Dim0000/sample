package bg;

import java.util.ArrayList;
import java.util.Collections;

public class ShowMagicSquare44 extends ShowMagicSquareArray {

    ArrayList<Integer> list = new ArrayList<Integer>();
    int num[][] = new int[4][4];
    int count = 0;

    public static void main(String[] args) {

        ShowMagicSquare44 sMagicSquare44 = new ShowMagicSquare44();
        
        sMagicSquare44.checkMagicSquare(sMagicSquare44);
        
        System.out.println("シャッフル回数:"+sMagicSquare44.count);
    }

    void checkMagicSquare(ShowMagicSquare44 sMagicSquare44) {

        sMagicSquare44.generateList(sMagicSquare44);
        while (num[0][0] == 0) {

            list.clear();
            sMagicSquare44.generateList(sMagicSquare44);
            list = super.list;

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
                    count++;
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
        super.num = num;
        sMagicSquare44.showMagicSquare();
    }

    // 斜めの合計値をチェック
     int[][] diagonallyCheck(int num[][]) {
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
     boolean mahou4_sumcheck(int num1, int num2, int num3, int num4) {
        if (num1 + num2 + num3 + num4 == 34) {
            return true;
        } else {
            return false;
        }
    }
}