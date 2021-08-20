/**
 * @(#)SpanArray.java
 *
 *
 * @author 
 * @version 1.00 2021/8/20
 */
import java.util.*;
public class SpanArray {
	public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    int min=arr[0];
    for(int j=1;j<arr.length;j++){
        if(max<arr[j]){
           max=arr[j]; 
        }
        if(min>arr[j]){
            min=arr[j];
        }
    }
    System.out.println(max-min);
 }
}
