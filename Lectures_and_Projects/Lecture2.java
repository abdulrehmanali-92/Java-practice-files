import java.util.Scanner;

public class Lecture2 {
    public static void main(String[] args) {

        // use system.out.print to print in same line
        // use scanner.next to read input without spaces
        // common issue - when taking input of string after input of integer or double
        // Area of rectangle

        Scanner input = new Scanner(System.in);

        System.out.print("Enter height: ");
        double h = input.nextDouble();

        System.out.print("Enter widht: ");
        double w = input.nextDouble();

        double area = w * h;

        System.out.println("Area of rectangle is : " + area + "cm²");

        input.close();
    }
}
