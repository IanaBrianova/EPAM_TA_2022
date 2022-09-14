package homework.module_2;

import java.util.Scanner;

public class FibonacciN {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            System.out.println(fib(number));
        } catch (Exception e) {
            System.out.println("Invalid data. Please, enter an integer.");
        }
    }

    static int fib(int number) {
        int n1 = 0, n2 = 1, n3, i;
        if (number < 0) {
            System.out.println("Invalid value. Please, enter a positive number.");
            System.exit(1);
        } else if (number == 0) {
            return n1;
        }
        for (i = 2; (i + 1) <= number; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }
}
