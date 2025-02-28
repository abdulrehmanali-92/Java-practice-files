import java.util.Scanner;

public class Lecture3 {
    public static void main(String[] args) {

        int age;
        boolean isStudent;
        String name;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Are you a student? (true/false): ");
        isStudent = input.nextBoolean();

        // GROUP 1
        if (name.isEmpty()) {
            System.out.println("\nYou didn't enter your name");
        } else {
            System.out.println("\nHello " + name + "!");
        }

        // GROUP 2
        if (age >= 60) {
            System.out.println("You are a scenior citizen");
        } else if (age >= 18) {
            System.out.println("You are an adult citizen");
        } else if (age > 0) {
            System.out.println("You are junior");
        } else {
            System.out.println("Wrong age input!");
        }

        // GROUP 3
        if (isStudent) {
            System.out.println("This is good that you are a student keep working hard!");
        } else {
            System.out.println("This is bad that you are not a student, because education is the basic need for life");
        }

        input.close();
    }
}
