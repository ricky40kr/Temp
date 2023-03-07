// odd/even check

import java.util.Scanner;

public class tut2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("The number is " + check(num));

        sc.close();
    }

    public static String check(int num) {
        String result = ((num & 1) == 0) ? "even" : "odd";

        return result;
    }
}
