//LeetCode#412 - Fizz Buzz
//Approach: If else | Time: O(n) | Space: O(n)
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class FizzBuzz{
    public List<String> Do(int n){
        List<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0)
                list.add("FizzBuzz");
            else if(i%3==0)
                list.add("Fizz");
            else if(i%5==0)
                list.add("Buzz");
            else
                list.add(Integer.toString(i));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        FizzBuzz obj=new FizzBuzz();
        System.out.println("The result:\n"+obj.Do(n));
    }
}