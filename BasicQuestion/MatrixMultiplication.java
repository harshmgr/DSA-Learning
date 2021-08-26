/**
 * @(#)MatrixMultiplication.java
 *
 *
 * @author 
 * @version 1.00 2021/8/25
 */
 import java.io.*;
import java.util.*;
public class MatrixMultiplication {
public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int a1[][]=new int[r1][c1];
    for(int i=0;i<a1.length;i++){
        for(int j=0;j<a1[0].length;j++){
            a1[i][j]=sc.nextInt();
        }
    }
    int r2=sc.nextInt();
    int c2=sc.nextInt();
    int a2[][]=new int[r2][c2];
    for(int i=0;i<a2.length;i++){
        for(int j=0;j<a2[0].length;j++){
            a2[i][j]=sc.nextInt();
        }
    }
    if(c1!=r2){
        System.out.println("Invalid input");
        return;
    }
    int prod[][]=new int[r1][c2];
    for(int i=0;i<prod.length;i++){
        for(int j=0;j<prod[0].length;j++){
            for(int k=0;k<c1;k++){
                prod[i][j]+=a1[i][k]*a2[k][j];
            }
        }
    }
     for(int i=0;i<prod.length;i++){
        for(int j=0;j<prod[0].length;j++){
            System.out.print(prod[i][j]+" ");
        }
        System.out.println();
    }
 }

}1
