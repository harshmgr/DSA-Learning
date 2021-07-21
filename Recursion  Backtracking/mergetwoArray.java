import java.util.*;
public class mergetwoArray {
    public static void mergetwoArray(int arr1[],int arr2[]) {
    	int l1=arr1.length;
    	int l2=arr2.length;
    	int res[]=new int[l1+l2+1];
    	int k=0;
		for(int i=0;i<l1;i++){
			res[k]=arr1[i];
			k++;
		}
		for(int i=0;i<l2;i++){
			res[k]=arr2[i];
			k++;
		}
		Arrays.sort(res);
		for(int l=1;l<res.length;l++){
			System.out.println(res[l]);
		}
    		
    }
    
    public static void main(String[] args) {
        int arr1[] = {1,3,4,5};
        int arr2[] = {2,4,6,8};
       mergetwoArray(arr1,arr2);
    }
}
