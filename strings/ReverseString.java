// LeetCode #344 - Reverse a Character Array
// Time : O(n) || Space : O(n)

import java.util.Scanner;

public class ReverseString {
    public static char[] Reverse(char[] s, int left, int right) {
        if (left >= right) return s;
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        return Reverse(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character array size:");
        int size = sc.nextInt();
        char[] s = new char[size];
        System.out.println("Enter character array:");
        for (int i = 0; i < size; i++)
            s[i] = sc.next().charAt(0);
        int left = 0, right = size - 1;
        s = Reverse(s, left, right);
        System.out.print(s);
    }
}