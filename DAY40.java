/*
Day 40 coding Statement : Write a Program to Replace substring in a string

Description

Get a string as input from the user and then get another string which has to be removed from the string.

Get the third input, the new substring which is placed in that substring position.

Finally print the output by replacing the substring with new string.

Input

Enter a string

talentbattle

Enter the substring to be removed :

talent

Enter the new substring :

student

Output

The new string :

studentbattle
  */
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the original string
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Get the substring to be removed
        System.out.print("Enter the substring to be removed: ");
        String substringToRemove = scanner.nextLine();

        // Get the new substring
        System.out.print("Enter the new substring: ");
        String newSubstring = scanner.nextLine();

        // Replace the substring
        String newString = originalString.replace(substringToRemove, newSubstring);

        // Print the new string
        System.out.println("The new string: " + newString);
    }
}
