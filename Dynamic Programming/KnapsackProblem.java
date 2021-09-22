/**
 * @(#)KnapsackProblem.java
 *
 *
 * @author 
 * @version 1.00 2021/9/22
 */
import java.util.*;
public class KnapsackProblem {
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
        int dp[][]=new int[n+1][cap+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(j>=wt[i-1]){
                    int rem=j-wt[i-1];
                    if(dp[i-1][rem]+val[i-1]>dp[i-1][j]){
                        dp[i][j]=dp[i-1][rem]+val[i-1];
                    }else{
                        dp[i][j]=dp[i-1][j];
                    }
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][cap]);
    }
}
