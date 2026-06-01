//LeetCode#125 - Valid Palindrome
//Approach: Two Point | Time: O(n) | Space: 1
import java.util.Scanner;
public class ValidPalindrome_TwoPoint {
    public boolean Check(String s){
        int left=0,right=s.length()-1;
        s=s.toLowerCase();
        while(left<right){
            while(left<right&&!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while(left<right&&!Character.isLetterOrDigit(s.charAt(right)))
                right--;
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        ValidPalindrome_TwoPoint obj=new ValidPalindrome_TwoPoint();
        if(obj.Check(s))
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is not a Palindrome.");
    }
}