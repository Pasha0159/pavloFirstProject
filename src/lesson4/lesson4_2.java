package lesson4;

import java.util.Scanner;

/*
Дано дійсні числа x,y. Якщо числа від’ємні взяти модуль від них.
Вивести x, якщо він більший за y, і два числа,якщо це не так
 */
public class lesson4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.print("Введіть х = ");
        x = input.nextInt();
        System.out.print("Введіть y = ");
        y = input.nextInt();

        if (x < 0) {
            x = Math.abs(x);
        }
        if (y < 0) {
            y = Math.abs(y);
        }

        if (x > y) {
            System.out.println("X = " + x);
        }else{
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        }

    }
}
