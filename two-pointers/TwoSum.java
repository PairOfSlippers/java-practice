// LeetCode #167 - Two Sum II - Input array is sorted.
// Time : O(n) || Space : O(1)

import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum < target)
                left++;
            else if (sum > target)
                right--;
            else return new int[]{left + 1, right + 1};
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter array: ");
        for (int i = 0; i < size; i++)
            nums[i] = sc.nextInt();
        System.out.println("Enter target sum:");
        int target = sc.nextInt();
        System.out.println("Answer:");
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}