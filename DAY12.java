/*Day 12 coding Statement:Write a program to find Sum of digits of a number

Description

Get a number from user and then find the sum of the digits in the given number.

E.g. let the number = 341

Sum of digits is 3+4+1= 8

Input

4521

Output

12
*/
import java.util.Scanner;
class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
