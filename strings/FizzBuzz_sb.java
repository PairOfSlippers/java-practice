//LeetCode#412 - Fizz Buzz
//Approach: String Builder | Time: O(n) | Space: O(n)
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class FizzBuzz_sb{
    public List<String> Do(int n){
        List<String> list=new ArrayList<String>();
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            if(i%3==0)
                sb.append("Fizz");
            if(i%5==0)
                sb.append("Buzz");
            if(sb.length()==0)
                sb.append(i);
            list.add(sb.toString());
            sb.setLength(0);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        FizzBuzz_sb obj=new FizzBuzz_sb();
        System.out.println("Result:\n"+obj.Do(n));
    }
}