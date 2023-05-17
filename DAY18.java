/*Day 18 coding Statement : Write a program to Add two fractions

Description

Get the values for numerator and denominator of two fractions, then add that fractions. Consider the following format

x3/y3 = (x1/y1) + (x2/y2)

here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2)

Input

2  3

4  3

Output

2/1   

*/
import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator and denominator of the first fraction (x1 y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Enter the numerator and denominator of the second fraction (x2 y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int numerator = (x1 * y2) + (x2 * y1);
        int denominator = y1 * y2;

        int gcd = gcd(numerator, denominator); // Finding the greatest common divisor

        numerator /= gcd;
        denominator /= gcd;

        System.out.println("Result: " + numerator + "/" + denominator);

        scanner.close();
    }

    // Helper function to calculate the greatest common divisor using Euclidean algorithm
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
