/*Day 21 coding Statement : Write a program to identify if the number is Palindrome or not

Description

Get a number as input from the user and check whether that number is a Palindrome or not.

Input

121

Output

Palindrome

Input

34

Output

Not a Palindrome
*/

import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPalindrome(number)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}
