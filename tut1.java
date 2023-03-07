// +ve/-ve check

import java.util.Scanner;

public class tut1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("The number is " + check(num));

        sc.close();
    }

    public static String check(int num) {
        String result = num < 0 ? "negative" : "positive";

        return result;
    }
}