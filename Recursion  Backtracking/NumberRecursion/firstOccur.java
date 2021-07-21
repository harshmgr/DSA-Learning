/**
 * @(#)firstOccur.java
 *
 *
 * @author 
 * @version 1.00 2021/6/21
 */

public class firstOccur {
        
 
    public static int firstOccur(int arr[],int index,int data) {
    	int ind;
    	if (index==arr.length-1)
    		return -1;
    	ind=firstOccur(arr,index+1,data);
    	if(arr[index]==data)
    		return index;
    	else
    		return ind;
    }
    public static void main(String[] args) {
        int arr[]={23,43,54,23,53,89};
        System.out.println(firstOccur(arr,0,54));
    }
}
