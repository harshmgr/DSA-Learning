/**
 * @(#)PrimeFactorization.java
 *
 *
 * @author 
 * @version 1.00 2021/8/11
 */
import java.util.*;
public class PrimeFactorization {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int div=2;div*div<=num;div++){
        	while(num%div==0){
        		num=num/div;
        		System.out.println(div);
        	}
        }
        if(num!=1){
        	System.out.println(num);
        }
    }
}
