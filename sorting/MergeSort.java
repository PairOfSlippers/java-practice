/*
Principle : Divide & Conquer (also involves Recursion)
Time Complexity : O(log n) for Divide && O(n) for Conquer. Total Time : O(n log n)
Space Complexity : O(n) for the temporary array we made in Conquer() function.
Dry Run: 4 > 3 > 2 > 1
Divide(arr,0,3) : mid = 1
    Divide(arr,0,1) : mid = 0
        Divide(arr,0,0) : ei = si = 0 > return (Base case)
        Divide(arr,1,1) : ei = si = 1 > return
        Conquer(arr,0,0,1) > arr : 3 > 4 > 2 > 1
    Divide(arr,2,3) : mid = 2
        Divide(arr,2,2) : ei = si = 2 > return
        Divide(arr,3,3) : ei = si = 3 > return
        Conquer(arr,2,2,3) > arr : 3 > 4 > 1 > 2
    Conquer(arr,1,0,3) > arr : 1 > 2 > 3 > 4
 */

import java.util.Scanner;

public class MergeSort {
    public void conquer(int[] arr, int mid, int si, int ei) {
        //Merges the cells into a temporary array and then copies its values to the original array.
        int[] merged = new int[ei - si + 1]; // Temporary array size = range of divided section.
        int idx1 = si; // IndexTracks the left half.
        int idx2 = mid + 1; // Tracks the right half.
        int i = 0; // Tracks the temporary array.
        while (idx1 <= mid && idx2 <= ei) { // Time : O(n)
            // Compares the two halves and adds only the smallest of the two halves first.
            if (arr[idx1] < arr[idx2]) {
                merged[i++] = arr[idx1++];
            } else {
                merged[i++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) { // Adds the remainder of left half it wasn't fully added.
            merged[i++] = arr[idx1++];
        }
        while (idx2 <= ei) { // Adds the remainder of right half it wasn't fully added.
            merged[i++] = arr[idx2++];
        }
        for (i = 0; i < merged.length; i++) //Copies the temporary array's values into the real one.
            arr[si + i] = merged[i];
    }

    public void divide(int[] arr, int si, int ei) { //Divides the array.
        if (si >= ei) // Base case - To stop when division of the array reduces it to individual cells.
            return; // Divides array into halves involves Time : log n
        int mid = si + (ei - si) / 2; // Finds the middle.
        divide(arr, si, mid); // Left Half of the array division.
        divide(arr, mid + 1, ei); // Right half of the array division.
        conquer(arr, mid, si, ei); // Merging Function.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        MergeSort ob = new MergeSort();
        ob.divide(arr, 0, n - 1);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}