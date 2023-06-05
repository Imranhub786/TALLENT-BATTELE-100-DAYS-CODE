/*Day 32 coding Statement : Write a Program to Remove vowels from a string

Description

Get a string as the input from the user and then remove all the vowel letters from the string and give the output.

Input

remove

Output

rmv
*/
import java.util.Scanner;
class remove{
    public static void main(String[]args){
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String s1=" ";
        s1=str1.replaceAll("[aeiouAEIOU]","");
        System.out.println("After removing vowels symbol:"+s1);
        
        
    }
}
