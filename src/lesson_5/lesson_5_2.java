package lesson_5;

/*
Дано три дійсних числа.
Вибрати ті із них, які належать інтервалу (1,8)і зменшити в 10 разів.
Вивести отриманий результат
 */

import java.util.Scanner;

public class lesson_5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1, x2, x3;
        System.out.print("Будьласка введіть x1=");
        x1 = input.nextInt();
        System.out.print("Будьласка введіть x2=");
        x2 = input.nextInt();
        System.out.print("Будьласка введіть x3=");
        x3 = input.nextInt();

        if ((x1 > 1) && (x1 < 8)) {
            x1 /= 10;
        } else if ((x2 > 1) && (x2 < 8)) {
            x2 /= 10;
        } else if ((x3 > 1) && (x3 < 8)) {
            x3 /= 10;
        }
        System.out.println("x1 =" +x1);
        System.out.println("x2 =" +x2);
        System.out.println("x3 =" +x3);
    }
}
