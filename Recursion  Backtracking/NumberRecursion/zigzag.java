/**
 * @(#)zigzag.java
 *
 *
 * @author 
 * @version 1.00 2021/6/18
 */

public class zigzag {
        
    public static void zigzag(int n) {
    	if(n==0)
    		return;
    	System.out.print(n+" ");
    	zigzag(n-1);
    	System.out.print(n+" ");
    	zigzag(n-1);
    	System.out.print(n+" ");
    }
    
   
    public static void main(String[] args) {
        zigzag(3);
    }
}
