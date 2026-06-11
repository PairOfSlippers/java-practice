// Time: Best Case - O(n) ; Worst Case - O(n^2) | Space - O(1)
//Best case arises when array is fully sorted.
//Worst case arises when array needs to be reversed completely.

import java.util.Scanner;

public class InsertionSort {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int current = arr[i];
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        InsertionSort ob = new InsertionSort();
        arr = ob.sort(arr);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}