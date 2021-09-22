/**
 * @(#)UnboundedKnapsack.java
 *
 *
 * @author 
 * @version 1.00 2021/9/22
 */
import java.util.*;
public class UnboundedKnapsack {
  public static void main(String[] args) throws Exception {
            Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val[]=new int[n];
        int wt[]=new int[n];
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }    
        for(int j=0;j<n;j++){
            wt[j]=sc.nextInt();
        }
        int cap=sc.nextInt();
        int dp[]=new int[cap+1];
            dp[0]=0;
            for(int i=1;i<dp.length;i++){
                int max=0;
                for(int j=0;j<n;j++){
                    if(wt[j]<=i){
                        int rem=i-wt[j];
                        int remv=dp[rem];
                        int tbagv=remv+val[j];
                        if(tbagv>max){
                            max=tbagv;
                        }
                    }
                }
                dp[i]=max;
            }
            System.out.println(dp[cap]);
	    }
}
