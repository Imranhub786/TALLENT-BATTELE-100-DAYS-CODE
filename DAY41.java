/*
Day 41 coding Statement : Check if two strings match where one string contains wildcard characters

Description

Get two strings as input from the user, first with wildcard characters (* and ?) and second without wildcard characters.

Then check whether they match or not.

Input

Ta**nt

Talent

Output

Yes they match
  */
import java.util.Scanner;

public class StringMatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string with wildcard characters: ");
        String wildcardString = sc.nextLine();
        
        System.out.print("Enter the string without wildcard characters: ");
        String normalString = sc.nextLine();
        
        boolean match = isMatch(wildcardString, normalString);
        
        if (match) {
            System.out.println("Yes, they match");
        } else {
            System.out.println("No, they do not match");
        }
    }
    
    public static boolean isMatch(String wildcardString, String normalString) {
        int m = wildcardString.length();
        int n = normalString.length();
        
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        dp[0][0] = true;
        
        for (int i = 1; i <= m; i++) {
            if (wildcardString.charAt(i - 1) == '*') {
                dp[i][0] = dp[i - 1][0];
            }
        }
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (wildcardString.charAt(i - 1) == '?' || wildcardString.charAt(i - 1) == normalString.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (wildcardString.charAt(i - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }
        
        return dp[m][n];
    }
}
