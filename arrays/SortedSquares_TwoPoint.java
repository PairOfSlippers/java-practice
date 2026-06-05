// LeetCode #977 - Squares of a Sorted Array.
// Approach - Two Pointer | Time: O(n) | Space: O(n)

import java.util.Scanner;

public class SortedSquares_TwoPoint {
    public int[] Square(int[] nums) {
        int left = 0, right = nums.length - 1, pos = nums.length - 1;
        int result[] = new int[nums.length];
        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            if (leftSq > rightSq) {
                result[pos--] = leftSq;
                left++;
            } else {
                result[pos--] = rightSq;
                right--;
            }
        }
        return result;
    }

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        SortedSquares_TwoPoint obj = new SortedSquares_TwoPoint();
        int[] result = obj.Square(nums);
        System.out.println("The resultant array is:");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}