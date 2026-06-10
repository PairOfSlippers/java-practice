// LeetCode #225 - Implement Stack using 2 queues.
// Time: Push - O(n) | Pop - O(1) | Peek - O(1)
// Space - O(n)

import java.util.Queue;
import java.util.ArrayDeque;

public class Stack_TwoQueues {
    static class Stack {
        static Queue<Integer> q1 = new ArrayDeque<>();
        static Queue<Integer> q2 = new ArrayDeque<>();
        static boolean empty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        static void push(int data) {
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            q1.add(data);
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        static int pop() {
            if (empty()) {
                System.out.println("Stack empty.");
                return -1;
            }
            return q1.remove();
        }

        static int peekStack() {
            if (empty()) {
                System.out.println("Stack empty");
                return -1;
            }
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Removed: "+s.pop());
        while(!s.empty()){
            System.out.print(s.peekStack()+" ");
            s.pop();
        }
    }
}

