package lesson3;

import java.util.Scanner;

/**
 * Created by admin on 27.07.2017.
 */
public class lesson3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double result;
        System.out.print("введіть p=");
        a = input.nextDouble();
        result = -a + (1.4 - a);
        System.out.print("result=" + result);
    }
}
