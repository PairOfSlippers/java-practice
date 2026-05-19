import java.util.Scanner;
public class MajorityElement_Sorting {
    public int find(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        MajorityElement_Sorting obj=new MajorityElement_Sorting();
        System.out.println("The majority element is: "+obj.find(nums));
    }
}