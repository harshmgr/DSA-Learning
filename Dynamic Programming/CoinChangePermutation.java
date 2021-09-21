/**
 * @(#)CoinChangePermutation.java
 *
 *
 * @author 
 * @version 1.00 2021/9/21
 */
import java.util.*;
public class CoinChangePermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int dp[]=new int[tar+1];
        dp[0]=1;
        for(int i=1;i<dp.length;i++){
            for(int coin:arr){
                if(coin<=i){
                    int rem=i-coin;
                    dp[i]=dp[i]+dp[rem];
                }
            }
        }
        System.out.println(dp[tar]);
    }
}
