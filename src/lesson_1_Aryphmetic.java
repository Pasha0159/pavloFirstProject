import java.util.Scanner;

public class lesson_1_Aryphmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double y; // оголошеня змінної
        double x = 0; // оголошеня змінної та ініціалізація
        System.out.println("\n\n\n");
        System.out.println("Вираз : (2 * x - 9) * 0.9 - 0.6 (8 * x - 5) - (- 2.1 - 3 * x) ");
        System.out.print("\tВведіть х=");
        x = input.nextDouble();
        y = (2*x-9)*0.9-0.6*(8*x-5)-(-2.1-3*x);
        System.out.println("\ty = "+y);
        System.out.println("\n\n\n");
        // 1 2 5  - int
        // 1.5 2.8 5.9 - float / double

    }

}
