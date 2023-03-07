// leap year

import java.util.Scanner;

public class tut7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        System.out.println(year + " is " + checkLeap(year) + " year");
        sc.close();
    }

    public static String checkLeap(int year) {
        String result = (year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0) ? "leap" : "not leap";

        return result;
    }
}