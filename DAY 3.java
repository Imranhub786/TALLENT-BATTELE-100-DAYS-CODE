/*Day 3 coding Statement: Write a program to find ASCII values of a character

 

Description: Get an input character from the user and give the ASCII value of the given input as the output.

Input: b

Output: 98

Input: B

Output: 66
  */
import java.util.Scanner;
class Day3 {
  public static void main(String[] args) {
    System.out.println("Enter the ASCII number");
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    int i=(int) ch;
    System.out.println("The ASCII number of "+ch+ "is:> "+i);
  }
}
