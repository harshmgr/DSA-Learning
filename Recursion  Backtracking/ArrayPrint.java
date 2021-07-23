/**
 * @(#)ArrayPrint.java
 *
 *
 * @author 
 * @version 1.00 2021/6/21
 */

public class ArrayPrint {
    public static void ArrayPrint(int arr[],int index) {
    	if(index==-1 )
    		return;
    		ArrayPrint(arr,index-1);
    		System.out.println(arr[index]);
    	}
    
    public static void main(String[] args) {
   		int arr[] = {10,20,30,40,50};
   		ArrayPrint(arr,arr.length-1);
    }
}
