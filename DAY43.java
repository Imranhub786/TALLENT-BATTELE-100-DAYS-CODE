/*
Day 43 coding Statement : Write Program to find the array type

Description

Get an array as input from the user and check the type of the array, whether it is odd, even or mixed type.

Input

Enter size of array :

3

Enter elements 

1 3 5

Output

Odd
  */

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array :");
    int size=sc.nextInt();
    int array[]=new int [size];
    System.out.println("Enter elements");
    for(int i=0;i<size;i++)
      {
        array[i]=sc.nextInt();
      }
    if(array.length %2==0)
    {
      System.out.println("even");
    }
    else{
      System.out.println("odd");
    }
  }
}
