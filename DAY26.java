/*Day 26 coding Statement : Write a program to calculate Maximum number of handshakes

Description

Get the number of people in the room as input from the user. Then calculate the maximum number of handshakes possible among that people.

For e.g. If there are N people in the room then the first person has to shake hand with N-1 people and second person has to shake hand with N-1-1 people i.e., N-2 handshakes are possible. Thus, it goes on.

So total hand shakes = N-1 + N-2 + N-3 +………+1 + 0

Input

10

Output

45
  */

import java.util.Scanner;

class maxHandshake {
  public static int maximumHandshake(int num) {
    return (num * (num - 1)) / 2;
  }

  public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int output = maximumHandshake(num);
    System.out.println("The max Handshake number is: " + output);

  }
}
//Time compexity : O(1)
//Space complexity : O(1)
