/**
 * @(#)SubsetParttition.java
 *
 *
 * @author 
 * @version 1.00 2021/10/3
 */

import java.util.*;
public class SubsetParttition { 
   public static long partitionKSubset(int n, int k) {
        if (n==0||k==0||n<k){
            System.out.println(0);
            return 0;
        }
        long dp[][]=new long[k+1][n+1];
        for(int t=1;t<=k;t++){
            for(int p=t;p<=n;p++){
                if(t==1||p==1||t==p){
                    dp[t][p]=1;
                }
                else{
                    dp[t][p]=dp[t-1][p-1]+dp[t][p-1]*t;
                }
            }
        }
        return dp[k][n];
        
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        long res = partitionKSubset(n, k);
        System.out.println(res);
    } 
}