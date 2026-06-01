import java.util.Scanner;
import java.util.Stack; //If you import this, no need to make push, peek and pop functions.
import java.util.List;
import java.util.ArrayList;
public class StackP{
    static class Stack{
        static  List<Integer> list = new ArrayList<Integer>();
        //Checks if list is empty.
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //Input in a stack.
        public static void push(int n){
            list.add(n);
        }

        //Deletes the top element and returns it.
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //Access top element.
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}