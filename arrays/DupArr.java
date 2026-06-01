import java.util.Scanner;
public class DupArr{
    public static void main(String[] args){
        int i,j,c=0,f=0;
        System.out.println("Enter the size of the array:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter array elements:");
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        int a2[]=new int[n];
        for(i=0;i<n;i++){
            f=0;
            for(j=0;j<c;j++){
                if(a[i]==a2[j]){
                    f=1;
                    break;
                }
            }
            if(f==0){
                a2[c]=a[i];
                c++;
            }
        }
        System.out.println("Number of unique elements: "+c+"\nThe new array is:");
        for(i=0;i<c;i++){
            System.out.print(a2[i]+" ");
            }
    }
}