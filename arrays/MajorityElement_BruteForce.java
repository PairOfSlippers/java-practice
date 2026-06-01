//LeetCode#169- Majority Element (Brute Force)
import java.util.Scanner;
public class MajorityElement_BruteForce{
    public int find(int[] nums){
        int i,j,l=nums.length,c;
        for(i=0;i<l;i++){
            c=0;
            for(j=0;j<l;j++){
                if(nums[j]==nums[i])
                    c++;
            }
            if(c>l/2)
                return nums[i];
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        MajorityElement_BruteForce obj=new MajorityElement_BruteForce();
        System.out.println("The majority element is: "+obj.find(nums));
    }
}
