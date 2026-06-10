// LeetCode #933 - Number of recent calls.
// Time - O(n) | Space - O(n)

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Scanner;

public class RecentCounter {
    Queue<Integer> q = new ArrayDeque<>();
    public int ping(int t) {
        q.add(t);
        while (t - 3000 > q.peek()) {
            q.remove();
        }
        return q.size();
    }

    public static void main(String[] args) {
        RecentCounter recent = new RecentCounter();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of pings: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter time: ");
            int t = sc.nextInt();
            System.out.println(recent.ping(t));
        }
    }
}