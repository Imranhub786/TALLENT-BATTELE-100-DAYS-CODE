/*Day 36 coding Statement : Write a Program to Capitalize the first and last letter of each word of a string

Description

Get a string from the user and then change the first and last letter to uppercase.

Input

programming

Output

ProgramminG
  */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String newstring = "";
        String[] str1 = str.split("\\s");
        for (String string : str1) {
            int length = string.length();
            String f = string.substring(0, 1);
            String r = string.substring(1, length - 1);
            String l = Character.toString(string.charAt(length - 1));
            newstring = newstring + f.toUpperCase() + r + l.toUpperCase();
        }
        System.out.println(newstring);
    }
}
