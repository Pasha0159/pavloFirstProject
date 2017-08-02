package lesson3;

import java.util.Scanner;

/**
 * Created by admin on 29.07.2017.
 */
public class lesson3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n;
        double x = 6;
        double result;
        System.out.print(" n=");
        System.out.print(" x=");
        n = input.nextDouble();
        result = -(n-x)-x;
        System.out.print("result=" + result);
    }
}
