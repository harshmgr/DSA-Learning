/**
 * @(#)power.java
 *
 *
 * @author 
 * @version 1.00 2021/6/18
 */

public class power {
        
   
    public static int power(int x,int y) {
    	if(y==1)
    		return x;
    	return x*power(x,y-1);
    }
    
    public static void main(String[] args) {
        System.out.print(power(4,3));
    }
}
