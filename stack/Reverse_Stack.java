//Stack ko reverse karna.
import java.util.Stack;
public class Reverse_Stack{
    public static void bottom(int n,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int top=s.pop();
        bottom(n,s);
        s.push(top);
    }

    public static void rev(Stack<Integer> s){
        if(s.isEmpty())
            return;
        int top=s.pop();
        rev(s);
        bottom(top,s);
    }

    public static void main(String[] Args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        rev(s);
        while(!s.isEmpty())
            System.out.println(s.pop());
    }
}