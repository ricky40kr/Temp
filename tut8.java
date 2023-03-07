// Prime check

import java.util.Scanner;

public class tut8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (checkPrime(num, (int) Math.sqrt(num)) == true) {
            System.out.println(num + " is Prime");
        } else {
            System.err.println(num + " is not Prime");
        }

        sc.close();
    }

    // recursion
    public static boolean checkPrime(int n, int i) {
        if (n < 2) {
            return false;
        }

        if (i == 1) {
            return true;
        }

        if ((n % i) == 0) {
            return false;
        }

        return checkPrime(n, i - 1);

    }

    // public static boolean checkPrime(int n) {
    // boolean isPrime = true;
    // for (int i = 2; i * i <= n; i++) {
    // if (n % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }

    // return isPrime;
    // }
}
