/*
 * This program will prompt the user to enter two strings,
 * check for matching letters, and display the matching letters
 * on the screen - otherwise it will advise no matches
 */
import java.util.*;

public class MatchingLetters
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char answer = 'y';
        do
        {
            System.out.println("Enter the first string, and then press enter:");
            String stringOne = input.nextLine();

            System.out.println("Enter the second string, and then press enter:");
            String stringTwo = input.nextLine();
    
            containsMatching(stringOne, stringTwo);

            System.out.print("\nWould you like to compare strings again? \nType 'Y' for yes or 'N' for no: ");
            answer = input.next().charAt(0);
        } while ((answer == 'Y') || (answer == 'y'));
    }
    // Compares two strings and displays the matching letters, otherwise advises no matches
    public static void containsMatching(String a, String b)
    {
        // Keep track of matching letters in an expandable list
        LinkedList<Character> sharedLetters = new LinkedList<Character>();

        // Iterate through first string
        for (int i = 0; i < a.length(); i++)
        {
            // Keep track of letter of first string to compare to second string
            char letter = a.charAt(i);

            // Iterate through second string
            for (int j = 0; j < b.length(); j++)
            {
                // Compare letter in first string to the letters in the second string
                if (letter == b.charAt(j))
                {
                    // Match found, check if letter already found. If so, skip. Else add letter to list
                    if (sharedLetters.contains(letter))
                        continue;
                    else
                        sharedLetters.add(letter);
                }
            }
        }
        // If there are shared letters between the two strings, display matching letters
        if (sharedLetters.size() > 0)
        {
            System.out.print("The two strings share the following letters: ");
            printList(sharedLetters);
        }
        else
        {
            System.out.println("There are no matching letters for the two strings.");
        }
    }
    // Print elements of list
    public static void printList(LinkedList<Character> list)
    {
        // Iterate through linked list and display each letter
        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}