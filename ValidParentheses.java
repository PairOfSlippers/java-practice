//LeetCode#20- Valid Parentheses
//Approach: Stack || Time: O(n) || Space: O(n)
import java.util.Stack;
import java.util.Scanner;
public class ValidParentheses {
    public boolean Check(String s){
        Stack<Character>st=new Stack<>();
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
                continue;
            }
            if(st.isEmpty())
                return false;
            char top=st.peek();
            if((top=='('&&s.charAt(i)!=')')||(top=='{'&&s.charAt(i)!='}')||(top=='['&&s.charAt(i)!=']'))
                return false;
            st.pop();
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the brackets:");
        String s=sc.nextLine();
        ValidParentheses obj=new ValidParentheses();
        if(obj.Check(s))
            System.out.println("Valid Parentheses");
        else
            System.out.println("Invalid Parentheses");
    }
}