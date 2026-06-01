// LeetCode #242 - Valid Anagram
// Approach: Frequency Array | Time: O(n) | Space: O(1)
import java.util.Scanner;
public class ValidAnagram_Frequency{
    public boolean Check(String s, String t){
        s=s.toLowerCase();
        t=t.toLowerCase();
        int a[]=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            a[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings:");
        String s=sc.nextLine().trim();
        String t=sc.nextLine().trim();
        ValidAnagram_Frequency obj=new ValidAnagram_Frequency();
        if(obj.Check(s,t))
            System.out.println("It is an Anagram.");
        else
            System.out.println("It is not an Anagram.");
    }
}