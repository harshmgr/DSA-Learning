/**
 * @(#)ClimbStairsTabulation.java
 *
 *
 * @author 
 * @version 1.00 2021/9/14
 */
import java.util.*;
public class ClimbStairsTabulation {
        public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countStair(n));
    }
    public static int countStair(int n){
        int qb[]=new int[n+1];
        qb[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                 qb[i]=qb[i-1];
            }else if(i==2){
                qb[i]=qb[i-1]+qb[i-2];
            }else{
                qb[i]=qb[i-1]+qb[i-2]+qb[i-3];
            }
                
            }
        return qb[n];
    }
}
