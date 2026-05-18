//LeetCode#136- Single Number (Using XOR Bitwise Operator)
import java.util.Scanner;
public class SingleNumber2{
    public int find(int nums[]){
        int n=0,l=nums.length,i;
        for(i=0;i<l;i++){
            n^=nums[i];
        }
        return n;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        SingleNumber2 obj=new SingleNumber2();
        System.out.println("The single number is: "+obj.find(nums));
    }
}