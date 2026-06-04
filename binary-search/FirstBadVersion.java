// LeetCode #278 - First Bad Version
// Time: O(log n) | Space: O(1)

import java.util.Scanner;

public class FirstBadVersion {
    public boolean isBadVersion(int n); // Pre-Defined API

    public int firstBadVersion(int n) {
        int lower = 1, upper = n;
        while (lower <= upper) {
            int middle = lower + (upper - lower) / 2;
            if (isBadVersion(middle))
                upper = middle - 1;
            else
                lower = middle + 1;
        }
        return lower;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of versions you want to check:");
        int n = sc.nextInt();
        FirstBadVersion obj = new FirstBadVersion();
        System.out.println("The first bad version is " + obj.firstBadVersion(n));
    }
}