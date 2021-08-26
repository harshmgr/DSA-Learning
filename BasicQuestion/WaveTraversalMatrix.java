/**
 * @(#)WaveTraversalMatrix.java
 *
 *
 * @author 
 * @version 1.00 2021/8/25
 */
import java.util.*;
public class WaveTraversalMatrix {
public static void main(String[] args) throws Exception {
   Scanner sc=new Scanner(System.in);
   int row=sc.nextInt();
   int col=sc.nextInt();
   int mat[][]=new int[row][col];
   for(int i=0;i<mat.length;i++){
       for(int j=0;j<mat[0].length;j++){
           mat[i][j]=sc.nextInt();
       }
   }
   
    for(int i=0;i<mat[0].length;i++){
       if(i%2==0){
       for(int j=0;j<mat.length;j++){
           System.out.println(mat[j][i]);
       }
           
       }else{
           for(int j=mat.length-1;j>=0;j--){
               System.out.println(mat[j][i]);
           }
       }
   }
   
}
}
