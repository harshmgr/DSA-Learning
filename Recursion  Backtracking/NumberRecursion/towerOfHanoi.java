/**
 * @(#)towerOfHanoi.java
 *
 *
 * @author 
 * @version 1.00 2021/6/20
 */

public class towerOfHanoi {
        
    /**
     * Creates a new instance of <code>towerOfHanoi</code>.
     */
    public static void towerOfHanoi(int n,char A,char B,char C) {
    	if(n==0)
    		return;
    	towerOfHanoi(n-1,A,C,B);
    	System.out.println(n+" from "+A+" to "+B);
    	towerOfHanoi(n-1,C,B,A);
    
    }
    public static void main(String[] args) {
       towerOfHanoi(3,'A','B','C');
    }
}
