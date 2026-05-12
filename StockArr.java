//LeetCode #121- Best time to buy and sell stock
import java.util.Scanner;
public class StockArr{
    public int Max(int prices[]){
        int max=-99999,i,j,l=prices.length,s,f=0;
        for(i=0;i<l-1;i++){
            for(j=i+1;j<l;j++){
                s=prices[j]-prices[i];
                if(s>=0&&s>max) {
                    max = s;
                    f=1;
                }
            }
        }
        if(f==1)
            return max;
        else
            return 0;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int n=in.nextInt();
        int prices[]=new int[n];
        System.out.println("Enter prices: ");
        for(int i=0;i<n;i++)
            prices[i]=in.nextInt();
        StockArr obj=new StockArr();
        System.out.println("Max Profit: "+obj.Max(prices));
    }
}
