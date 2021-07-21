/**
 * @(#)ArrMax.java
 *
 *
 * @author 
 * @version 1.00 2021/6/21
 */

public class ArrMax {
        
    /**
     * Creates a new instance of <code>ArrMax</code>.
     */
    public static int ArrMax(int arr[],int index) {
    	int max=0;
    	if(index==-1)
    		return max;
    	max=ArrMax(arr,index-1);
    	if(max>arr[index])
    		return max;
    	else{
    		return arr[index];
    		}
    }
    
    public static void main(String[] args) {
        int arr[]={21,45,63,12,9};
        System.out.println(ArrMax(arr,arr.length-1));
    }
}
