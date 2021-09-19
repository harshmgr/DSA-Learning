import java.util.*;
public class MaximumGold {
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int arr[][]=new int[n][m];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       
       int dp[][]=new int[n][m];
       for(int j=arr[0].length-1;j>=0;j--){
           for(int i=arr.length-1;i>=0;i--){
               if(j==arr[0].length-1){
                   dp[i][j]=arr[i][j];
               }else if(i==0){
                   dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
               }else if(i==arr.length-1){
                   dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
               }else{
                   dp[i][j]=arr[i][j]+Math.max(dp[i+1][j+1],Math.max(dp[i][j+1],dp[i-1][j+1]));
               }
           }
       }
       int max=0;
       for(int i=0;i<dp.length-1;i++){
           if(dp[i][0]>max){
               max=dp[i][0];
           }
       }
       System.out.println(max);
    }
}
