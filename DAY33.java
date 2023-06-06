/*Day 33 coding Statement : Write a Program to check if String is a palindrome or not

Description

Get an input string from the user and then check whether it is a palindrome string or not.

Input

noon

Output

Palindrome

Input

Talent

Output

Not a Palindrome
*/
import java.util.Scanner;
class palindrome{
    public static boolean isPalindrome(String s) {
        char[]charArray=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(charArray[start]!=charArray[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String str = sc.nextLine();
       if (isPalindrome(str)){
       System.out.print("Palindrome");
       }
       else{
       System.out.print("Not a palindrome");
       }
    }
    
}
//time complexity is O(n)
// space complexity is O(1)
