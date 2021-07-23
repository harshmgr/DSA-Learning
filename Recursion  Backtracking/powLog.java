/**
 * @(#)powLog.java
 *
 *
 * @author 
 * @version 1.00 2021/6/18
 */

public class powLog {
        
    public static int powLog(int x,int y) {
     if (y==1)
     	return x;
    if (y%2==0)
    	return powLog(x,y/2)*powLog(x,y/2);
    else
    	return powLog(x,y/2)*powLog(x,y/2)*x;
    }
    public static void main(String[] args) {
        System.out.print(powLog(2,8));
    }
}
