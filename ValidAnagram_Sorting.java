// LeetCode #242 - Valid Anagram
// Approach: Sorting | Time: O(n log n) | Space: O(n)
import java.util.Scanner;
import java.util.Arrays;
public class ValidAnagram_Sorting{
    public boolean Check(String s, String t){
        char a1[]=s.toCharArray();
        char a2[]=t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Strings:");
        String s=sc.nextLine();
        String t=sc.nextLine();
        ValidAnagram_Sorting obj=new ValidAnagram_Sorting();
        if(obj.Check(s,t))
            System.out.println("It is an Anagram");
        else
            System.out.println("It is not an Anagram");
    }
}