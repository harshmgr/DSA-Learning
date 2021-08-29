/**
 * @(#)StringCompression.java
 *
 *
 * @author 
 * @version 1.00 2021/8/29
 */
import java.util.*;
public class StringCompression {
 public static String compression1(String str){
		String a=str.substring(0,1);
		for(int i=1;i<str.length();i++){
		    char prev=str.charAt(i-1);
		    char curr=str.charAt(i);
		    if(curr!=prev){
		        a+=curr;
		    }
		}
		return a;
	}

	public static String compression2(String str){
			String a=str.substring(0,1);
			int count=1;
		for(int i=1;i<str.length();i++){
		    char prev=str.charAt(i-1);
		    char curr=str.charAt(i);
		    if(curr==prev){
		            count++;
		        }else{
		            if(count>1){
		                a+=count;
		                count=1;
		            }
		            a+=curr;
		        }
		}
		if(count>1){
		 a+=count;   
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}
}
