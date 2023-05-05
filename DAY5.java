/*Day 5 coding Statement:  Write a program to identify if the number is even or odd

Description

Get a number as input from the user and check whether the given number is odd or even

Input

10

Output

Even

Input

5

Output

Odd
  */
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Check  number is odd or even");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(num%2==0)
    {
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
  }
}
