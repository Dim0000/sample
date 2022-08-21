package bg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleStringTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        //listにone,two,three,four,fiveの文字列を格納
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list);

        //シャッフルしたlistを表示する
        Collections.shuffle(list);
        System.out.println(list);
    }

}
