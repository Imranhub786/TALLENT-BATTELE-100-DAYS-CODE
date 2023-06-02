/*
Day 28 coding Statement : Write a Program to reverse a string.

Description

Get an input string from user and print it in reverse order.

Input

Hello

Output

olleH
 */
import java.util.Scanner;
class reverseString {
  public static void main(String[] args) {
    System.out.println("Enter the String");
    Scanner sc=new Scanner(System.in);
   String input = sc.nextLine();

        String reversed = " ";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reverse of the String is: "+reversed);
  }
}
//Time complexity:O(n)
//Space complexity:O(n)
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String num = sc.nextLine();

        String result = reverseString(num);
        System.out.println(result);
    }

    public static String reverseString(String num) {
        char[] chars = num.toCharArray();
        int start = 0;
        int end = num.length() - 1;

        while (start < end) {
            // Swap characters
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            // Move the pointers
            start++;
            end--;
        }

        return new String(chars);
    }
}
//Time complexity:O(n)
//Space complexity:O(1)
