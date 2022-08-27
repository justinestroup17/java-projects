/* This program will ask the user for a change amount between 1 and 99 cents,
 * calculate the number of quarters, dimes, nickels, and pennies, and finally
 * display the quantity of each coin to the user.
 */
import java.util.Scanner;

public class CoinCount
{
    public static void main(String[] args)
    {
        int totalChange, quarters, dimes, nickels, pennies;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount between 1 and 99 cents: ");
        totalChange = input.nextInt();
        System.out.println("You have " + totalChange + " cents. That is: ");

        // Calculate number of quarters, dimes, nickels, and pennies.
        quarters = totalChange / 25;
        totalChange %= 25;

        dimes = totalChange / 10;
        totalChange %= 10;

        nickels = totalChange / 5;
        totalChange %= 5;

        pennies = totalChange; // Remaining change is # of pennies

        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }

}