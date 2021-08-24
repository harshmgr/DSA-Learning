/**
 * @(#)CeilFloorProblem.java
 *
 *
 * @author 
 * @version 1.00 2021/8/25
 */
import java.util.*;
public class CeilFloorProblem {
public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int data=sc.nextInt();
    int low=0;
    int high=arr.length-1;
    int floor=0;
    int ceil=0;
    while(low<=high){
        int mid=(low+high)/2;
        if(data>arr[mid]){
           low=mid+1;
           floor=arr[mid];
        }else if(data<arr[mid]){
            high=mid-1;
            ceil=arr[mid];
        }else{
            ceil=arr[mid];
            floor=arr[mid];
        }
    }
    System.out.println(floor);
    System.out.println(ceil);
 }
}
