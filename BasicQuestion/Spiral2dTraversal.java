/**
 * @(#)Spiral2dTraversal.java
 *
 *
 * @author 
 * @version 1.00 2021/8/27
 */
import java.util.*;
public class Spiral2dTraversal {
 public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int arr[][]=new int[n1][n2];
    for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    int minr=0;
    int minc=0;
    int maxr=arr.length-1;
    int maxc=arr[0].length-1;
    int total=n1*n2;
    int cnt=0;
    while(cnt<total){
        //left wall
        for(int row=minr,col=minc;row<=maxr && cnt<total;row++){
            System.out.println(arr[row][col]);
            cnt++;
        }
        minc++;
        //bottom wall
        for(int row=maxr,col=minc;col<=maxc && cnt<total;col++){
            System.out.println(arr[row][col]);
            cnt++;
        }
        maxr--;
        //right wall
        for(int row=maxr,col=maxc;row>=minr && cnt<total;row--){
            System.out.println(arr[row][col]);
            cnt++;
        }
        maxc--;
        //top wall
        for(int row=minr,col=maxc;col>=minc && cnt<total;col--){
            System.out.println(arr[row][col]);
            cnt++;
        }
        minr++;
    }

}
}
