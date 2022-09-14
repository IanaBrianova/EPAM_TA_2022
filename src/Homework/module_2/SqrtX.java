package homework.module_2;

import java.util.Scanner;

/*
Given a non-negative integer x, compute and return .
Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
*/

public class SqrtX {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int x = sc.nextInt();
            double s = Math.sqrt(x);
            if (x >= 0) {
                System.out.println("The square root of the number is " + Math.round(s));
                System.exit(1);
            } else {
                System.out.println("Enter a non-negative number");
            }
        } catch (Exception e) {
            System.out.println("Enter a non-negative number");
        }
    }
}