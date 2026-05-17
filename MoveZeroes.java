import java.util.Scanner;
public class MoveZeroes{
    public void shift(int nums[]){
        int i,j,l=nums.length,t=0;
        for(i=0;i<l-1;i++){
            for(j=i+1;j<l;j++){
                if(nums[i]==0&&nums[j]!=0){
                    t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=in.nextInt();
        System.out.println("Enter array elements:");
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++)
            nums[i]=in.nextInt();
        MoveZeroes obj=new MoveZeroes();
        obj.shift(nums);
        System.out.println("Shifted array is:");
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
    }
}