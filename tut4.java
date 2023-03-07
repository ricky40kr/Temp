// Sum of numbers in a range

import java.util.Scanner;

public class tut4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper limit : ");
        int upper = sc.nextInt();
        System.out.print("Enter lower limit : ");
        int lower = sc.nextInt();
        System.out.println("The sum is " + sum(0, upper, lower));

        sc.close();
    }

    static int sum(int sum, int upper, int lower) {
        if (upper < lower) {
            return sum;
        }

        return upper + sum(sum, upper - 1, lower);
    }
}
