package homework.module_2;

import java.util.Scanner;

/*
Fizz-buzz: show 'fizz' if a number divisible by 3, show 'buzz' if a number divisible by 5, show 'fizz-buzz' if a number divisible by both 3 and 5
 */

public class FizzBuzz {

    public static void main(String[] args) {
        String errorMessage = "Invalid data. Please, enter a number";
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int x = sc.nextInt();
            if ((x % 3) == 0) {
                if ((x % 5) == 0) {
                    System.out.println("fizz-buzz");
                    System.exit(1);
                }
                System.out.println("fizz");
            } else if ((x % 5) == 0) {
                System.out.println("buzz");
            } else {
                System.out.println("Nor fizz, neither buzz");
            }
        } catch (Exception e) {
            System.out.println(errorMessage);
        }
    }
}