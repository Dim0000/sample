package bg;

public class PrintfTest {

    public static void main(String[] args) {

        // 整数を出力する %4dを使えば4文字文右詰めして出力される
        System.out.printf("1:%d%n", 100);
        System.out.printf("2:%4d%n", 100);

        // 小数を出力する %.1fとすれば小数点一桁まで出力される
        System.out.printf("3:%f%n", 3.33);
        System.out.printf("4:%.1f%n", 3.33);

        // 文字を出力する %2cとすれば2文字文右詰めして出力される
        System.out.printf("5:%c%n", 'a');
        System.out.printf("6:%2c%n", 'a');

        // 文字列を出力する
        System.out.printf("7:%s%n", "java");

        System.out.printf("8:%03d", 1);
    }
}
