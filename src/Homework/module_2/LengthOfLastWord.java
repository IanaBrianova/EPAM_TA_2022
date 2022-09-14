package homework.module_2;

import java.util.Scanner;

/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
*/

public class LengthOfLastWord {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string consisting of words and spaces: ");
        String input = s.nextLine();
        int count = lengthOfLastWord(input);
        System.out.println("The length of the last word in the string is " + count);

    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        char ch;
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ch = s.charAt(i);
            reversed += ch;
        }
        for (int i = 0; i < reversed.length(); i++) {
            if (!Character.isWhitespace(reversed.charAt(i)))
                count++;
            if (count > 1 && Character.isWhitespace(reversed.charAt(i))) {
                break;
            }
        }
        return count;
    }
}