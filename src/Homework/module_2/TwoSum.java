package homework.module_2;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a target number: ");
        int target = sc.nextInt();
        Solution solution = new Solution();
        int num[] = {1, 3, 6, 0};
        num = solution.twoSum(num, target);
        System.out.println(Arrays.toString(num));
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2], sum;
        for (int i = 0; i + 1 < nums.length; i++) {
            sum = nums[i] + nums[i + 1];
            if (sum == target) {
                result[0] = i;
                result[1] = i + 1;
                return result;
            }
        } return null;
    }
}