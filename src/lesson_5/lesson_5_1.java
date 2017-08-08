package lesson_5;

import java.util.Scanner;

public class lesson_5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1, x2;

        System.out.print("Please enter x1 = ");
        x1 = input.nextInt();
        System.out.print("Please enter x2 = ");
        x2 = input.nextInt();

        if(x1<=x2){
            System.out.println("Умова 1");
            x1=0;
        }else{
            System.out.println("Умова 2");
            x1*=x1;
            x2*=x2;
        }
        System.out.println("X1 = "+x1);
        System.out.println("X2 = "+x2);

    }
}
