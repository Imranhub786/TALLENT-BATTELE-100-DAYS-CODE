/*Day 22 coding Statement : Write a program to express a number as a sum of two prime numbers

Description

Get a number as input from the user and express that number as sum of two prime numbers.

Input

4

Output

4 can be expressed as sum of 2 and 2
*/
import java.util.Scanner;

class SumOfTwoPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        boolean found = false;

        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " can be expressed as the sum of " + i + " and " + (num - i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No prime numbers found to express " + num + " as their sum.");
        }
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
