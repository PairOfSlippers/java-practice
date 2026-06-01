//Data ko niche insert karna hai top mein nahi (for this question)
import java.util.Stack;
public class Rear_Stack{
    public static void bottom(Stack<Integer> s,int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int top=s.pop();
        bottom(s,n);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        bottom(s,4);
        while(!s.isEmpty())
            System.out.println(s.pop());
    }
}