// LeetCode #704 - Binary Search
// Time: O(log n) | Space: O(1)

import java.util.Scanner;

public class BinarySearch {
    public int Find(int[] nums, int target) {
        int upper = nums.length - 1, lower = 0;
        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                upper = mid - 1;
            } else {
                lower = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        BinarySearch obj = new BinarySearch();
        if (obj.Find(arr, target) == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + obj.Find(arr, target));
    }
}