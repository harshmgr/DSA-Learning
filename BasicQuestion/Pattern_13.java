/**
 * @(#)Pattern_13.java
 *
 *
 * @author 
 * @version 1.00 2021/8/16
 */
import java.util.*;
public class Pattern_13 {
	public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            int icj=1;
            for(int j=0;j<=i;j++){
                System.out.print(icj+"\t");
              int icjp1=icj*(i-j)/(j+1);
              icj=icjp1;
            }
            System.out.println();
        }

    }
}
