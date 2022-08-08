package bg;

import java.util.ArrayList;
import java.util.Collections;

//シャッフルされたlistと数表を出力する
public class ShowMagicSquareArray {
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    int num[][] = new int[4][4];

    public static void main(String[] args) {

        ShowMagicSquareArray sArray = new ShowMagicSquareArray();

        sArray.generateList(sArray);
        System.out.println(sArray.list);

        sArray.showMagicSquare();
    }

    // 1～16が格納された配列listを作りシャッフルする
    void generateList(ShowMagicSquareArray sArray) {
        for (int i = 1; i <= 16; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
    }

    // 4×4の配列numを数表として出力する
    void showMagicSquare() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%3d", num[i][j]);
            }
            System.out.println();
        }
    }

}