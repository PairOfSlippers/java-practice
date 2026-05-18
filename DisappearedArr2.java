//LeetCode#448- Find All Numbers Disappeared in an Array.
//Using Marking method with O(n) time complexity..
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.math.*;
public class DisappearedArr2{
    public List<Integer> Diss(int nums[]){
    List<Integer> list=new ArrayList<>();
    int i,l=nums.length;
        for(i=0;i<l;i++){  //nums[nums[i]-1]*=-1;
            if(nums[Math.abs(nums[i])-1]>0)
                nums[Math.abs(nums[i])-1]*=(-1);
        }
        for(i=0;i<l;i++){
            if(nums[i]>0)
                list.add(i+1);
        }
        return list;
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
            nums[i]=in.nextInt();
        DisappearedArr2 obj=new DisappearedArr2();
        System.out.println("The result:\n"+obj.Diss(nums));
    }
}
