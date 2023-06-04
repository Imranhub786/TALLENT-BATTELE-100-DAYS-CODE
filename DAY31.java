/*Day 31 coding Statement : Write a Program to Toggle each character in a string

Description

Get an input string from user and then convert the lower case of alphabets to upper case and all upper-case alphabets into lower case.

Input

Hello

Output

hELLO
  */
import java.util.Scanner;
class alphabet {
  public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner sc=new Scanner("System.in");
    String str=sc.nextLine();
    String s1=" ";
    for (int i = 0; i < str.length(); i++) {
    if(Character.isUpperCase(str.charAt(i)))
    s1=s1+Character.toLowerCase(str.charAt(i));
    else
     s1=s1+Character.toUpperCase(str.charAt(i));
  }
     System.out.println("Toggle String : "+s1);
  }
}
