//LeetCode#448- Find All Numbers Disappeared in an Array.
//Brute force method with O(n^2) time complexity..
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class DisappearedArr{
    public List<Integer> Arr(int nums[]){
        int i,j,f=0,l=nums.length;
        List<Integer> list=new ArrayList<Integer>();
        for(i=1;i<=l;i++){
            f=0;
            for(j=0;j<l;j++){
                if(nums[j]==i){
                    f=1;
                    break;
                }
            }
            if(f==0)
                list.add(i);
        }
        return list;
    }

    public static void main(String[] Args){
        Scanner in=new Scanner(System.in);
        List<Integer> nums2=new ArrayList<Integer>();
        System.out.println("Enter size of array:");
        int n=in.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
            nums[i]=in.nextInt();
        DisappearedArr obj=new DisappearedArr();
        nums2=obj.Arr(nums);
        System.out.println("The new array is:");
        System.out.println(nums2);
    }
}
