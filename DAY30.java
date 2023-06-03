/*Day 30 coding Statement : Write a Program to print Length of the string without using strlen() function

Description

Get a string as input from user and print the length of the string without using strlen() function.

Input

Hello

Output

5
*/
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String input");
    String num=sc.nextLine();
    int output=0;
    for(char c:num.toCharArray())
      {
        output++;
      }
    System.out.println("Length of the String is:"+output);
    
  }
}
