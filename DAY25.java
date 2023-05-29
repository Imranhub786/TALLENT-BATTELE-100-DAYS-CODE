/*Day 25 coding Statement : Write a program to find Area of a circle

Description

Get the value for radius from the user and calculate the area of the circle for the given radius.

Area of circle = 3.14*radius*radius

Input

3

Output

28.26

  */
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Calculate Area of circle");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radious value:");
    double rad=sc.nextDouble();
    double area=3.14*rad*rad;
    System.out.println("Arae of the Circle :"+area);
  }
}
