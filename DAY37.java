/*Day 37 coding Statement : Write a Program to calculate the Frequency of characters in a string

Description

Get a string as the input from the user and find the frequency of characters in the string.

Input

program

Output

The frequency of a is 1

The frequency of g is 1

The frequency of m is 1

The frequency of o is 1

The frequency of p is 1

The frequency of r is 2
  */
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String:");
    String input=sc.nextLine();
    //int c=0;
    input=input.toLowerCase();
    for(char ch='a'; ch<='z'; ch++)
      {
        int count=0;//count variable
        for(int i=0;i<input.length();i++)
          {
            if(ch==input.charAt(i))
              count++;
          }
        if(count!=0)
          System.out.println("The frequency of "+ch+" is "+count);
      }
  }
}
/*
