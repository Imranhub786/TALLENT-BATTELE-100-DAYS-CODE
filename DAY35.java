/*Day 35 coding Statement : Write a Program to Count the sum of numbers in a string

Description

Get a string from the user and find the sum of numbers in the string.

Input

Hello56

Output

11
  */
import java.util.Scanner;
class Stringnumber {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String str1=sc.nextLine();
    int sum=0;
    for(int i=0;i<str1.length();i++){
    if(Character.isDigit(str1.charAt(i)))
      sum=sum+Character.getNumericValue(str1.charAt(i));
      }
    System.out.println("Sum is:"+sum);
  }
}
