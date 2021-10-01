/**
 * @(#)FriendsPairing.java
 *
 *
 * @author 
 * @version 1.00 2021/9/30
 */
import java.util.*;
public class FriendsPairing {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]*(i-1);
        }
        System.out.println(dp[n]);
    }
}
