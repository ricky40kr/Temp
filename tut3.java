// sum of n natural numbers

import java.util.Scanner;

public class tut3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("The sum is " + sum(num));

        sc.close();
    }

    static int sum(int num) {
        if (num == 0) {
            return num;
        }

        return num + sum(num - 1);
    }

}
