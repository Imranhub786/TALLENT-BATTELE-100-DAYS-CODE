/*Day 29 coding Statement : Write a Program to concatenate a string.

Description

Get two strings as input from the user and then concatenate it.

Input

Enter first string

Hello

Enter second string

Hi

Output

HelloHi
*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first String");
    String str1=sc.next();
    System.out.println("Enter the Second String");
    String str2=sc.next();
    System.out.println("Concatenate String is:"+(str1+str2));
  }
}
