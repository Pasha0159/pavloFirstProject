package lesson3;

import java.util.Scanner;

/**
 * Created by admin on 02.08.2017.
 */
public class lesson3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double k;
        double m = 14;
        double p = 8;
        double result;
        System.out.print("введіть k=");
        k = input.nextDouble();
        result = p + (-m + k - p);
        System.out.print("result=" + result);
        System.out.println("New Test Line");
    }
}

