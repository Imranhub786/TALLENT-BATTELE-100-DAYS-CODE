/*Day 2 coding Statement: Write a program to identify if the character is an alphabet or not.

 

Description: Take an input character from user and check whether it is an alphabet or not.

 

Input : A

Output:  Alphabet

Input: 7

Output: Not an alphabet
  */
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Character ");
    char c=sc.next().charAt(0);
    if(c>='A' && c<='Z' || c>='a'&& c<='z')
    {
      System.out.println("Your Enter of the Character "+c+" Alphabet");
    }
   else{
     System.out.println("Your Enter of the Character "+c+" Not an Alphabet");
   }
  }
}
