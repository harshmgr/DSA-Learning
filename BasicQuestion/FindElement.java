/**
 * @(#)FindElement.java
 *
 *
 * @author 
 * @version 1.00 2021/8/20
 */
import java.util.*;
public class FindElement {
	public static void main(String[] args) throws Exception {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int index=-1;
	    int find=sc.nextInt();
	    for(int i=0;i<n;i++){
	        if(arr[i]==find){
	            index=i;
	            break;
	        }
	    }
	    System.out.println(index);
 }
}
