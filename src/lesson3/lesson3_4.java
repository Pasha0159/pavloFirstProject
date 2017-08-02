package lesson3;

import java.util.Scanner;

/**
 * Created by admin on 26.07.2017.
 */
public class lesson3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double result;
        System.out.print("введіть a=");
        a = input.nextDouble();
        result = (16 - a) - 20 * 7 / 12;
        System.out.print("result=" + result);
    }
}
