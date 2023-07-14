/*Day 42 coding Statement : Write Program to check if two arrays are the same or not

Description

Get two arrays as the input from the user and check whether it is the same or not.

Input

Enter the size of first array :

3

Enter the size of second array :

3

Enter elements of first array :

1 2 3

Enter elements of second array :

1 2 3

Output

Same

 */
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of first array:");
    int num1=sc.nextInt();
    System.out.println("Enter the size of Second Array:");
    int num2=sc.nextInt();
    System.out.println("Enter elements of first array :");
      int arr1[]=new int[num1];
    for(int i=0;i<num1;i++)
      {
        arr1[i]=sc.nextInt();
      }
    System.out.println("Enter elements of Second array :");
    int arr2[]=new int[num2];
    for(int j=0;j<num2;j++)
      {
        arr2[j]=sc.nextInt();
      }
    boolean same = Arrays.equals(arr1, arr2);

        if (same) {
            System.out.println("Same");
        } else {
            System.out.println("Not the same");
        }
    
      
  }
}
