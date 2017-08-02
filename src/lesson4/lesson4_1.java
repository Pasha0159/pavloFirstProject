package lesson4;

public class lesson4_1 {
    public static void main(String[] args) {
        int age = 18;
        double height = 1.78;
        final int year = 2017; // константа
        final double PI = 3.14;
        double salary = 3000;


        System.out.println("Age  = " + age);
        System.out.println("Height  = " + height);
        System.out.println("Year  = " + year);
        System.out.println("Salary  = " + salary);
        System.out.println();

        age += 5; //age = age + 5;
        height /= 2;
        //year = 2018;
        salary++; //salary +=1;  - інкримент
        salary--; // декримент


        System.out.println("Age  = " + age);
        System.out.println("Height  = " + height);
        System.out.println("Year  = " + year);
        System.out.println("Salary  = " + salary);

    }
}
