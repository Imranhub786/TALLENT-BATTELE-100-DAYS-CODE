/*Day 27 coding Statement : Write a program to find the double of the given number without using arithmetic operator

Description

For the given input number calculate the double of it without using arithmetic operator.

Input

4

Output

8
*/
import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int num = sc.nextInt();
System.out.println(num<<1);
}
}
//Here we use left shift operator ("<<") to shift the binary representation of the number one position to the left, effectively doubling the value.
