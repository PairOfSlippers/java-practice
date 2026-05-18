//LeetCode #26- Two Sum problem.
import java.util.Scanner;
public class ArrTarget{
    public static void main(String[] args){
        int f=0,i=0,j=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements: ");
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter target: ");
        int t=in.nextInt();
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(j==i)
                    continue;
                if(a[i]+a[j]==t){
                    f=1;
                    break;
                }
            }
            if(f==1)
                break;
        }
        if(f==1)
            System.out.println("[ "+i+", "+j+" ]");
        else
            System.out.println("No match found.");
    }
}
