/*Day 1 coding Statement: Write a program to identify if the character is a vowel or consonant.

Description of the program: 


Take an input character from the user and check whether the given input is a vowel or consonant.

Input
A

Output
Vowel

Input
m

Output
Consonant

Input
3

Output
Invalid Input
  */
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a character");
 char c = sc.next().charAt(0);
 if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'|| c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
 System.out.println(" Vowel");
 else if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
 System.out.println("Consonant");
 else
 System.out.println("Invalid input");
 }
}