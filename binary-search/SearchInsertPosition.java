// LeetCode #35 - Search Insert Position
// Time: O(log n) | Space: O(1)
import java.util.Scanner;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int lower = 0, upper = nums.length - 1;
        while (lower <= upper) {
            int middle = lower + (upper - lower) / 2;
            if (nums[middle] == target)
                return middle;
            else if (nums[middle] > target)
                upper = middle - 1;
            else
                lower = middle + 1;
        }
        return lower;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        SearchInsertPosition obj = new SearchInsertPosition();
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        System.out.println("Target index is: " + obj.searchInsert(nums, target));
    }
}