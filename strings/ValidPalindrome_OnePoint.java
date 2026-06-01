//LeetCode#125 - Valid Palindrome
//Approach: One Point | Time: O(n) | Space: O(n)
import java.util.Scanner;
public class ValidPalindrome_OnePoint {
    public boolean Check(String s){
        s=s.toLowerCase();
        int c=0;
        char c1[]=new char[s.length()];
        char c2[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
            c1[c]=s.charAt(i);
        }
    }
        for(int i=0;i<c;i++){
            c2[c-i-1]=c1[i];
        }
        String s1=new String(c1,0,c);
        String s2=new String(c2,0,c);
        return  s1.equals(s2);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        ValidPalindrome_OnePoint obj = new ValidPalindrome_OnePoint();
        if(obj.Check(s))
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is not a Palindrome.");
    }
}