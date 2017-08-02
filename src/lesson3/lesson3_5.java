package lesson3;

import java.util.Scanner;

/**
 * Created by admin on 27.07.2017.
 */
public class lesson3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p;
        double result;
        System.out.print("введіть p=");
        p = input.nextDouble();
        result = p + (1.4 - p);
        System.out.print("result=" + result);
    }
}
