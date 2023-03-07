// Max of 2 num

import java.util.Scanner;

public class tut5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 limit : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 limit : ");
        int num2 = sc.nextInt();
        System.out.println("Max is " + max(num1, num2));
        System.out.println("Max is " + Math.max(num1, num2));

        sc.close();
    }

    public static int max(int n1, int n2) {

        return n1 > n2 ? n1 : n2;
    }

}
