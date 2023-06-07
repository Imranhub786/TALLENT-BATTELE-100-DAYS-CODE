/*Day 34 coding Statement : Write a Program to Remove brackets from an algebraic expression

Description

Get an algebraic expression as input from the user and then remove all the brackets in that.

Input

7x+(2*y)

Output

7x+2*y
  */
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String of the Expression:");
    String str=sc.nextLine();
    String s1=str.replaceAll("[(){}]","");
    System.out.println("Removing all Brackets:"+s1);
  }
}
