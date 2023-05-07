/*Day 8 coding Statement:  Write a program to find roots of a quadratic equation

Description

Get the values of a, b and c (coefficients of quadratic equation) as input from the user and calculate the roots and print as the output.

Input

Enter the value of a, b and c : 1 -6 9

Output

Roots are equal

Root 1= root 2 = 3.00
  */
import java.util.Scanner;

class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Root 1 = %.2f and Root 2 = %.2f", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Root 1 = Root 2 = %.2f", root);
        } else {
            System.out.println("Roots are imaginary");
        }
    }
}
