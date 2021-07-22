/**
 * @(#)PrintSubSeq.java
 *
 *
 * @author 
 * @version 1.00 2021/7/23
 */
import java.util.*;
public class PrintSubSeq {
    public static void PrintSubSeq(String str,String res) {
    	if(str.length()==0){
    		System.out.println(res);
    		return;
    	}
    	char c=str.charAt(0);
    	String rem=str.substring(1);
    	PrintSubSeq(rem,res+c);
    	PrintSubSeq(rem,res+"");
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       PrintSubSeq(str,"");
    }
}
