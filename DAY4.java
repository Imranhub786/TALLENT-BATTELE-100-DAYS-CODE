/*Day 4 coding Statement:  Write a program to identify of the a number is positive or negative

Description


Get an input number from the user and check whether it is a positive or negative number.

Input : -10
Output : Negative number

Input :0
Output : Neither positive nor negative

Input :15
Output : Positive number
  */
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter the number and Check");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(num>0)
    {
      System.out.println("Positive NUmber");
      
    }
    else if(num==0)
    {
      System.out.println("Neither positive nor negative");
    }
    else{
      System.out.println("Negative Number");
    }
    
    
    
  }
}
