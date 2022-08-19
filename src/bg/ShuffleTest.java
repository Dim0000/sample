package bg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {

    public static void main(String[] args) {
        
        //ArrayListであるlistを宣言する
        List<Integer> list = new ArrayList<Integer>();

        //listに1～10を順番に格納
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        //listをそのまま表示する
        System.out.println(list);

        //listをシャッフルする
        Collections.shuffle(list);

        //シャッフルしたlistを表示する
        System.out.println(list);
    }
}
