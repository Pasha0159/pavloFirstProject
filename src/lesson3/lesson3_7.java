package lesson3;

import java.util.Scanner;

/**
 * Created by admin on 27.07.2017.
 */
public class lesson3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m;
        double result;
        System.out.print("введіть m=");
        m = input.nextDouble();
        result = 5/8 - (3/8 - m);
        System.out.print("result=" + result);
    }
}
