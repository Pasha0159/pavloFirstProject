package lesson3;

import java.util.Scanner;

/**
 * Created by admin on 20.07.2017.
 */
public class lesson3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        double result;
        System.out.print("введіть x=");
        x = input.nextDouble();
        result = (6 - x) + 1. / 7;
        System.out.print("result=" + result);
    }
}
