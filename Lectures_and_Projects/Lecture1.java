public class Lecture1 {
    public static void main(String[] args) {

        // Data types

        // integers
        int age = 19;
        int quantity = 2;
        int siblings = 4;

        System.out.println("You are " + age + " years old");
        System.out.println("You ordered " + quantity + " burgers");
        System.out.println("We are " + (siblings + 1) + " siblings");

        // double
        double price = 20.55;
        double gpa = 3.89;
        double hour = 1.5;

        System.out.println("Price of rubik's cube is $" + price);
        System.out.println("You got " + gpa + " GPA");
        System.out.println("You have only " + hour + " hours left");

        // char
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("You got " + grade + " grade");
        System.out.println("Hello" + symbol);
        System.out.println(currency + "100");

        // boolean
        boolean sportsman = true, goodPerson = false, student = true;

        System.out.println("Like sports? : " + sportsman);
        System.out.println("Good person? : " + goodPerson);
        System.out.println("Studen? : " + student);

        // string
        String name = "Abdulrehmanali";

        System.out.println("Your name is " + name + 1);

        // Assignment

        name = "Abdulrehman Ali";
        age = 19;
        gpa = 3.89;
        char gender = 'M';
        boolean isStudent = true;

        System.out.println("Hello i am " + name + " and i am " + age + " years old and i got " + gpa + " GPA");
        System.out.println("Your gender is " + gender + "and are a student? " + isStudent);
    }
}