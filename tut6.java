// Greatest of three num

import java.util.Scanner;

public class tut6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter num3 : ");
        int num3 = sc.nextInt();
        System.out.println("Max is " + max(num1, num2, num3));

        sc.close();
    }

    public static int max(int n1, int n2, int n3) {
        int max;
        max = n1 > n2 ? n1 : n2;
        max = max > n3 ? max : n3;
        return max;
    }
}