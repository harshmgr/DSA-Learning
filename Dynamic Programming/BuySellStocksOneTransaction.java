/**
 * @(#)BuySellStocksOneTransaction.java
 *
 *
 * @author 
 * @version 1.00 2021/10/4
 */
import java.util.*;

public class BuySellStocksOneTransaction {
	public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
        int minPrice=Integer.MAX_VALUE;
        int op=0;
        int pst=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            pst=prices[i]-minPrice;
            if(pst>op){
                op=pst;
            }
        }
        System.out.println(op);
    }
}