// sum of digits

import java.util.Scanner;

public class tut10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        sc.close();
        System.out.println("Sum of " + n + " : " + sum(n));
    }

    // brute force
    /*
     * public static int sum(int n) {
     * int sum = 0;
     * while (n != 0) {
     * sum += (n % 10);
     * n /= 10;
     * }
     * return sum;
     */

    // most optimised
    public static int sum(int n) {
        int sum = 0;
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            sum += (num.charAt(i));
        }
        return sum;
    }
}
