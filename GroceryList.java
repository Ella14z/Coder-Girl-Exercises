import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args)

    {
        Scanner keyboard = new Scanner (System.in);
        String item1;
        String item2;
        String item3;

        int item1Quantity;
        int item2Quantity;
        int item3Quantity;

        float item1Cost;
        float item2Cost;
        float item3Cost;

        float totalCost;

        {
        System.out.println("Please list three items on your grocery shopping list.");

            System.out.println("Item 1?");
            item1 = keyboard.nextLine();
        }
            System.out.println("Item 2?");
            item2 = keyboard.nextLine();

            System.out.println("Item 3?");
            item3 = keyboard.nextLine();

        System.out.println("Now, please enter the quantity of each item.");
        System.out.println("How many " +item1+ "?");

            item1Quantity = keyboard.nextInt();
            keyboard.skip("\n");

        System.out.println("How many " +item2+ "?");

            item2Quantity = keyboard.nextInt();
            keyboard.skip("\n");

        System.out.println("How many " +item3+ "?");

            item3Quantity = keyboard.nextInt();
            keyboard.skip("\n");

        System.out.println("Now please enter the price of each item.");
        System.out.println("How much does one " +item1+ " cost?");

            item1Cost = keyboard.nextFloat();
            keyboard.skip("\n");

        System.out.println("How much does one " +item2+ " cost?");

            item2Cost = keyboard.nextFloat();
            keyboard.skip("\n");

        System.out.println("How much does " +item3+ " cost?");

            item3Cost = keyboard.nextFloat();
            keyboard.skip("\n");

        System.out.println("Calculating your grocery bill.");

        totalCost = (item1Cost * item1Quantity) + (item2Cost * item2Quantity) + (item3Cost * item3Quantity);

        System.out.println("Your total cost is " +totalCost);












    }
}
