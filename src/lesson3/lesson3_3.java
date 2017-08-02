package lesson3;

import java.util.Scanner;

/**
 * Created by admin on 21.07.2017.
 */
public class lesson3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m;
        double result;
        System.out.print("введіть m=");
        m = input.nextDouble();
        result = -0.16 + (4.06 - m);
        System.out.print("result=" + result);
    }
}
