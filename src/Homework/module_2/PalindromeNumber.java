package homework.module_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.
*/

public class PalindromeNumber {

    public static void main(String[] args) {
        int x, temp, reminder, reversedX = 0;
        Scanner sc = new Scanner(System.in);
        String errorMessage = "Invalid data. Please, enter int > 0";
        String general = "An integer is a palindrome when it reads the same backward as forward. ";
        try {
            System.out.println("Please enter an integer to check whether it is a palindrome: ");
            x = sc.nextInt();
            if (x <= 0) {
                System.out.println(errorMessage);
                System.exit(1);
            }
            temp = x;
            while (temp > 0) {
                reminder = temp % 10;
                reversedX = (reversedX * 10) + reminder;
                temp = temp / 10;
            }
            if (x == reversedX) {
                System.out.println(general + x + " is a palindrome.");
            } else {
                System.out.println(general + x + " is not a palindrome.");
            }
        } catch (InputMismatchException e) {
            System.out.println(errorMessage);
        }
    }
}



