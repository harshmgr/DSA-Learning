/**
 * @(#)StringPermutationIterative.java
 *
 *
 * @author 
 * @version 1.00 2021/8/31
 */
import java.util.*;
public class StringPermutationIterative {
		public static void solution(String str){
	    int n=str.length();
	    int fact=factorial(n);
	    for(int i=0;i<fact;i++){
	        StringBuilder sb=new StringBuilder(str);
	        int temp=i;
	        for(int div=n;div>0;div--){
	            int q=temp/div;
	            int r=temp%div;
	            System.out.print(sb.charAt(r));
	            sb.deleteCharAt(r);
	            temp=q;
	        }
	        System.out.println();
	    }
		
	}
	public static int factorial(int n){
	    int val=1;
	    for(int i=2;i<=n;i++){
	        val*=i;
	    }
	    return val;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
