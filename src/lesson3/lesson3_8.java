package lesson3;

import java.util.Scanner;

/**
 * Created by admin on 27.07.2017.
 */
public class lesson3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        double result;
        System.out.print("введіть x=");
        x = input.nextDouble();
        result = -8.3-(-x-8.3);
        System.out.print("result=" + result);
    }
}
