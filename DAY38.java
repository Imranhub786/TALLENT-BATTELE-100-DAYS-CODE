/*
Day 38 coding Statement : Write a Program to print Non-repeating characters in a string

Description

Get a string as the input from the user and print the non-repeating characters in a string.

Input

Hello

Output

H e o
  */
//Brute force Approach
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string:");
    String str = sc.nextLine();

    for (int i = 0; i < str.length(); i++) {
      boolean isRepeating = false;
      for (int j = 0; j < str.length(); j++) {
        if (i != j && str.charAt(i) == str.charAt(j)) {
          isRepeating = true;
          break;
        }
      }
      if (!isRepeating) {
        System.out.print(str.charAt(i) + " ");
      }
    }
  }
}

/*Another Approach 
import java.util.Scanner;
class Main
{
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter a string");
    String str = sc.next ();
    int frequency[] = new int[256];
    for (int i = 0; i < str.length (); i++)
    frequency[str.charAt(i)]++;
    System.out.println ("Non repeating characters are: ");
    for (int i = 0; i < 256; i++)
     if (frequency[i] == 1)
    System.out.print ((char) i + " ");
    }
}
*/



