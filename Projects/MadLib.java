import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {

        // MAD LIBs GAME

        // Today, I visited a strange park.
        // In a pond, I saw a dancing fish.
        // The fish was huge and singing!
        // People were confused and clapping.
        // I felt amazed!

        Scanner input = new Scanner(System.in);

        String noun1;
        String verb1;
        String adjective1;
        String adjective2;
        String pronoun1;

        System.out.print("Today, I visited a _____ park.( Hint: adjective ): ");
        adjective1 = input.nextLine();

        System.out.print("In a park, I saw a ______. ( Hint: noun ): ");
        noun1 = input.nextLine();

        System.out.print("The " + noun1 + " was _____!. ( Hint: verb ): ");
        verb1 = input.nextLine();

        System.out.print("_____ were wonder, ( Hint: pronoun ): ");
        pronoun1 = input.nextLine();

        System.out.print("and i felt _____!. ( Hint: adjective ): ");
        adjective2 = input.nextLine();

        System.out.println("\n");
        System.out.println("With your answers the is story is : ");
        System.out.println("\n");

        System.out.println("Today, I visited a " + adjective1 + " park.");
        System.out.println("In a park, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + verb1 + "!.");
        System.out.println(pronoun1 + " were wonder,");
        System.out.print("and i felt " + adjective2 + "!.");
        input.close();

    }
}
