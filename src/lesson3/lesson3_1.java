package lesson3;

import java.util.Scanner;

// Команда для форматування коду  - ctrl+alt+l

public class lesson3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m;
        double result;
        System.out.print("Ведіть m =");
        m = input.nextDouble();
        result = 0.4 - (m - 22);
        System.out.print("result=" + result);
    }
}
