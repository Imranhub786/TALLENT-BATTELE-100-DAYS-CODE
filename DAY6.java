/*Day 6 coding Statement:  Write a program to find the Quadrants in which coordinates lie

Get the value of x and y coordinates as input from the user and check in which quadrant the point lies and print it.

Input

10 20

Output

This point lies in first quadrant.

Input

-10 20

Output

This point lies in second quadrant.
  */
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter the X and Y co-ordinates values:");
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    if(num1>0 && num2>0)
    {
      System.out.println("This point lies in first quadrant.");
    }
    else if(num1<0 && num2>0)
    {
      System.out.println("This point lies in second quadrant.");
    }
    else if(num1<0 && num2<0)
    {
      System.out.println("This point lies in third quadrant.");
    }
    else{
      System.out.println("This point lies in fourth quadrant.");
    }
  }
}
