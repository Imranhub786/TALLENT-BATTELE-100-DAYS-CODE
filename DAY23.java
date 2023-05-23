/*Day 23 coding Statement : Write a program to Replace all 0’s with 1 in a given integer

Description

Get a number as input from the user and find the zeros present in that number.

Then convert the zeros into one and then print it.

Input

310020

Output

311121
*/
import java.util.Scanner;

public class ReplaceZerosWithOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int replacedNumber = replaceZerosWithOnes(number);
        System.out.println("Replaced number: " + replacedNumber);
    }

    public static int replaceZerosWithOnes(int number) {
        int result = 0;
        int multiplier = 1;

        while (number > 0) {
            int digit = number % 10;
            if (digit == 0) {
                digit = 1;
            }
            result += digit * multiplier;
            multiplier *= 10;
            number /= 10;
        }

        return result;
    }
}
