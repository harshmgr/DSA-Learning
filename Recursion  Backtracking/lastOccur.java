/**
 * @(#)lastOccur.java
 *
 *
 * @author 
 * @version 1.00 2021/6/22
 */

public class lastOccur {
 
    public static int lastOccur(int arr[],int index,int data) {
    	int ind=0;
    	if(index==-1)
    		return -1;
    	if(arr[index]==data)
    		return index;
    	else 
    		{
    			ind=lastOccur(arr,index-1,data);
    			if(arr[index]==data)
    				return index;
    			else
    				return ind;
    	}
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	int arr[]={10,20,30,40,20,40};
    	System.out.println(lastOccur(arr,arr.length-1,50));
    	
        // TODO code application logic here
    }
}
