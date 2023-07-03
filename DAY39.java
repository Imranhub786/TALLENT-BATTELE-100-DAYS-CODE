/*
Day 39 coding Statement : Write a Program to check if two strings are Anagram or not

Description

Get two strings as input from the user and check whether it is Anagram or not.

Input

sunlight thgiluns

Output

Anagram
*/
import java.util.Arrays;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first  String:");
    String str1=sc.nextLine();
     System.out.println("Enter the Second  String:");
    String str2=sc.nextLine();
    char []arr1=str1.toCharArray();
    char []arr2=str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if(Arrays.equals(arr1,arr2))
    {
      System.out.println("Anagram");
    }
    else{
      System.out.println("Not a Anagram");
    }
    
  }
}
