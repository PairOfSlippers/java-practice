// LeetCode #977 - Squares of a Sorted Array.
// Approach - Sorting | Time: O(n log n) | Space: O(1)

import java.util.Scanner;
import java.util.Arrays;

public class SortedSquares_Sorting {
    public int[] Square(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            nums[i] *= nums[i];
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        SortedSquares_Sorting obj = new SortedSquares_Sorting();
        nums = obj.Square(nums);
        System.out.println("The resultant Array:");
        for (int i = 0; i < n; i++)
            System.out.print(nums[i] + " ");
    }
}
