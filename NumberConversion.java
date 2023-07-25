/**
 * Program tests two ways to convert a hexidecimal to decimal
 * and convert a binary to decimal (only for int case)
 * @author: Justine Stroup
 * @version :7/24/2023
 */

 import java.util.Scanner;

 public class NumberConversion {
    public static void main(String[] args) {
        // CONVERT HEX TO DECIMAL EASY WAY
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Ask user for hext digit and get input
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        // Check that only 1 character was entered, if not end program
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character.");
            System.exit(1);
        } else {
            // Convert hex to decimal
            int value = Integer.parseInt(hexString, 16);
            System.out.println(hexString + " is decimal " + value);
        }
        // CONVERT HEX TO DECIMAL HARD WAY
        // Ask user for hex digit and get input
        System.out.print("Enter another hex digit: ");
        String hexString2 = input.nextLine();

        // Check only 1 character was entered, if not end program
        if (hexString2.length() != 1) {
            System.out.println("You must enter exactly one character.");
            System.exit(1);
        }
        
        // Get the char from the hexString and convert to upperCase
        char ch = Character.toUpperCase(hexString2.charAt(0));

        // Check if letter or numeric digit was entered
        if (ch >= 'A' && ch <= 'F') {
            int value2 = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + value2);
        } else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit " + ch + " is " + ch);
        } else {
            System.out.println(ch + " is an invalid input.");
        }

        // CONVERT BINARY TO DECIMAL, EASY WAY
        // Ask user for binary and get input. Then convert binary to decimal
        System.out.println("Enter a set of binary digits: ");
        String userDigits = input.nextLine();
        System.out.println("Binary " + userDigits + " to decimal is " + Integer.parseInt(userDigits, 2));

        // CONVERT BINARY TO DECIMAL, HARD WAY
        // Test Binary Conversion
        int bin_digit = 0, binary = 0;
        int x = 0;
        int add_decimal = 0;
        int remainder = 0;
        int decimal = 0;

        // Ask user for hex digit and get input
        System.out.println("Enter another set of binary digits: ");
        String digits = input.nextLine();

        bin_digit = Integer.parseInt(digits);
        binary = bin_digit;

        while (bin_digit != 0) {
            remainder = (bin_digit % 10);
            bin_digit = bin_digit / 10; // Move number one position to the right
            switch (remainder) {
                case 0:
                    add_decimal = 0;
                    break;
                case 1:
                    add_decimal = (int) Math.pow(2, x);
                    decimal += add_decimal;
                    break;
            }
            System.out.println("Remainder " + remainder + " decimal " + add_decimal);
            if (bin_digit == 0) {
                System.out.println("=====================");
                System.out.println(" binary " + binary);
            } else {
                System.out.println("binary " + bin_digit);
                x++;
            }
        }
    }
 }