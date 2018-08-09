import static java.lang.System.out;
import java.util.Scanner;
public class SandwichShop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;


    out.println("Checking sales goals.");

//VEGGIE SANDWICHES
    out.println("The sales goal for veggie sandwiches is 50.");
    out.println("How many veggie sandwiches were sold today?");

    int veggies = keyboard.nextInt();
    keyboard.skip("\n");

    if(veggies < goalForVeggies)
    {
        out.println("Fell short");
    }
    if(veggies >= goalForVeggies)
    {
        out.println("Made goal for veggies.");
    }
    boolean veggieGoal = veggies >= 50;
    out.println(" ");

//BURGERS
    out.println("The sales goal for burgers is 250.");
    out.println("How many burgers were sold today?");
    int burgers = keyboard.nextInt();
    keyboard.skip("\n");

    if(burgers < goalForBurgers)
    {
        out.println("Fell short");
    }
    if(burgers >= goalForBurgers)
    {
        out.println("Made goal for burgers.");
    }
    boolean burgerGoal = burgers >= 250;
    out.println(" ");

//SUBS
    out.println("The sales goal for subs is 180.");
    out.println("How many subs were sold today?");
    int subs = keyboard.nextInt();
    keyboard.skip("\n");

    if(subs < goalForSubs)
    {
        out.println("Fell short");
    }
    if(subs >= goalForSubs) {
        out.println("Made goal for subs.");
    }
    boolean subGoal = subs >= 180;
    out.println(" ");

//SOUP
    out.println("The sales goal for soup is 70.");
    out.println("How many soups were sold today?");
    int soup = keyboard.nextInt();
    keyboard.skip("\n");

    if(soup < goalForSoup)
    {
        out.println("Fell short");
    }
    if(soup >= goalForSoup)
    {
        out.println("Made goal for soup.");
    }
    boolean soupGoal = soup >= 70;
    out.println(" ");

//TOTAL GOAL
    boolean totalGoal;
        totalGoal = (veggieGoal && burgerGoal && subGoal && soupGoal);
    if(totalGoal)
    {
        out.println("Made goal for everything!");
    }
    }
}
