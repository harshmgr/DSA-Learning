/**
 * @(#)DiagonalTraversal.java
 *
 *
 * @author 
 * @version 1.00 2021/8/28
 */
import java.util.*;
public class DiagonalTraversal {
          public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int g=0;g<arr.length;g++){
            for(int i=0,j=g;j<arr.length;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }

}
