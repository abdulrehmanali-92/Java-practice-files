import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        String item;
        double price, total;
        int quantity;
        char currency = '$';

        Scanner input = new Scanner(System.in);

        System.out.print("What you want ot buy?: ");
        item = input.nextLine();

        System.out.print("Enter price of " + item + ": ");
        price = input.nextDouble();

        System.out.print("How many " + item + " you want to buy?: ");
        quantity = input.nextInt();

        total = price * quantity;

        System.out.println("\nYou buy " + quantity + " " + item + "/s");
        System.out.println("Your total bill is : " + currency + total);

        input.close();
    }
}