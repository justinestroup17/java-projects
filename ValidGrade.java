import java.util.Scanner;

public class ValidGrade {
    public static void main(String[] args)
    {
        int score;
        Scanner input = new Scanner(System.in);

        // Ask user to input their score
        System.out.print("Enter your score (0 - 100): ");
        score = input.nextInt();

        // Determine if input is valid
        if (score < 0 || score > 100)
        {
            System.out.println("Error: Score must be between 0 and 100 inclusive. Exiting program");
            System.exit(1);

        }
        else
        {
            switch(score / 10)
            {
                case 10:
                case 9:
                    System.out.println("The grade is A");
                    break;
                case 8:
                    System.out.println("The grade is B");
                    break;
                case 7:
                    System.out.println("The grade is C");
                    break;
                case 6:
                    System.out.println("The grade is D");
                    break;
                default:
                    System.out.println("The grade is F");
                    break;
            }
        }
    }
}
