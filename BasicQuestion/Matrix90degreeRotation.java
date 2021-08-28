/**
 * @(#)Matrix90degreeRotation.java
 *
 *
 * @author 
 * @version 1.00 2021/8/28
 */
import java.util.*;
public class Matrix90degreeRotation {
	public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[][]=new int[n][n];
      for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[0].length;j++){
              arr[i][j]=sc.nextInt();
          }
      }
      
      //transpose
      for(int i=0;i<arr.length;i++){
          for(int j=i;j<arr[0].length;j++){
              int temp=arr[i][j];
              arr[i][j]=arr[j][i];
              arr[j][i]=temp;
          }
      }
      //reverse
      for(int i=0;i<arr.length;i++){
          int left=0;
          int right=arr.length-1;
          while(left<right){
              int temp=arr[i][left];
              arr[i][left]=arr[i][right];
              arr[i][right]=temp;
              left++;
              right--;
          }
      }
      display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
