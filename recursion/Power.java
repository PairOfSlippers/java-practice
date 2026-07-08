// LeetCode #50 - Pow(x,n)
// Time : O(log n) || Space : O(log n)

import java.util.Scanner;

public class Power {
    public double myPow(double x, long n) {
        if (n == 0)
            return 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        if (n % 2 == 0)
            return myPow(x * x, n / 2);
        else
            return x * myPow(x * x, n / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term:");
        double x = sc.nextDouble();
        System.out.println("Enter exponent:");
        long n = sc.nextLong();
        Power obj = new Power();
        System.out.println("Answer: " + obj.myPow(x, n));
    }
}