package lesson3;

import java.util.Scanner;

/**
 * Created by admin on 29.07.2017.
 */
public class lesson3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n;
        double m = 4;
        double result;
        System.out.print("введіть n=");
        System.out.print("введіть m=");
        n = input.nextDouble();
        result = m - (n + m);
        System.out.print("result=" + result);
    }
}
