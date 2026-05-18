//LeetCode#136- Single Number (Using Brute force)
import java.util.Scanner;
public class SingleNumber{
    public int find(int nums[]){
        int i,j,n=0,l=nums.length,c=0;
        for(i=0;i<l;i++){
            c=0;
            for(j=0;j<l;j++){
                if(nums[i]==nums[j])
                    c++;
            }
            if(c==1)
                n=nums[i];
        }
        return n;
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n=in.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        SingleNumber obj=new SingleNumber();
        System.out.println("Element with Single iteration is: "+obj.find(nums));
    }
}