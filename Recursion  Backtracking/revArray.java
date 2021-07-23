/**
 * @(#)revArray.java
 *
 *
 * @author 
 * @version 1.00 2021/6/21
 */

public class revArray {
        
    /**
     * Creates a new instance of <code>revArray</code>.
     */
    public static void revArray(int arr[],int index) {
    	if (index==-1)
    		return ;
    		System.out.println(arr[index]);
    		revArray(arr,index-1);
   			
    }
    
    public static void main(String[] args) {
       int arr[]={10,20,30,40,50,60};
       revArray(arr,arr.length-1);
    }
}
