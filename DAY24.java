/*Day 24 coding Statement : Write a program to print Pyramid pattern using stars

Description

Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.

Input

4

Output

  *

 ***

*****

*******
  */
import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    for(int i=1;i<=num;i++)
      {  
        for(int j=1;j<=num-i;j++)
         {
        System.out.println(" ");
         }
        
       for(int j=1;j<=(2*i-1);j++)
         {
           System.out.print("*");
         }
        System.out.println();
        
      
      }
    
  }
}
