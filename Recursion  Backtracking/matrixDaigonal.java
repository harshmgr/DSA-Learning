/**
 * @(#)matrixDaigonal.java
 *
 *
 * @author 
 * @version 1.00 2021/6/26
 */

public class matrixDaigonal {
    public static void main(String[] args) {
       int a[][]={{1,2,3},
       			  {4,5,6},
       			  {7,8,9}};
       for(int i=0;i<3;i++){
       	for(int j=0;j<3;j++){
       		if(i==j)
       		System.out.print(a[i][j]+" ");
       	}
       }
       System.out.println();
       for (int l = 2; l>=0; l--){
       	for (int m = 2; m>=0; m--){
       		if(l==m){
       			System.out.print(a[l][m]+" ");
       		}
       	}
       }
    }
}
