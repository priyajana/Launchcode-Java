import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the price of the item
        System.out.print("Enter the price of the item: ");
        double price = scanner.nextDouble();

        // Prompt the user to enter the quantity of the item
        System.out.print("Enter the quantity of the item: ");
        double quantity = scanner.nextDouble();

        // Calculate the total cost
        double total = price * quantity;
        System.out.println("The total cost is: $" + total);

    }
}