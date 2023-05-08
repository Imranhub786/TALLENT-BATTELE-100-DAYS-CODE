/*Day 9 coding Statement : Write a program to find Number of digits in an integer

Description

Take an integer as the input from the user and then calculate the number of digits in the given input and print it as the output.

Input

3241

Output

4 I

nput

6

Output

1
  */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int count = 0;
        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
    }
}
