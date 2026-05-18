//LeetCode#448- Disappeared Elements (Using HashSet).
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
public class DisappearedArr3 {
    public List<Integer> find(int nums[]){
        int i,l=nums.length;
        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(i=0;i<l;i++)
            set.add(nums[i]);
        for(i=1;i<=l;i++){
            if(!set.contains(i))
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
            nums[i]=in.nextInt();
        DisappearedArr3 obj=new DisappearedArr3();
        System.out.println("The result:\n"+obj.find(nums));
    }
}
