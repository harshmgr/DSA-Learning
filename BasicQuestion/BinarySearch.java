import java.util.*;
public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        	a[i]=sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int search=sc.nextInt();
        int low=0;
        int high=a.length-1;
        while(low<=high){
        	int mid=(low+high)/2;
        	if(a[mid]>search){
        		high=mid-1;
        	}
        	else if(a[mid]<search){
        		low=mid+1;
        		}
        	else{
        		System.out.println("Element found at: "+mid);
        		return;
        		}
        }
       System.out.println("Not found");
        	
        	
    }
}
