// LeetCode #15 - 3Sum
// Time : O(n^2) || Space : O(1) (excluding output list)

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ThreeSum {
    public static List<List<Integer>> find(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0)
                    left++;
                else if (sum > 0)
                    right--;
                else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    while (nums[left] == nums[left - 1] && left < right)
                        left++;
                    while (nums[right] == nums[right + 1] && left < right)
                        right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        List<List<Integer>> result = new ArrayList<>();
        result = find(nums);
        System.out.println(result);
    }
}