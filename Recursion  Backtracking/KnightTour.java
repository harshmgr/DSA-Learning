/**
 * @(#)KnightTour.java
 *
 *
 * @Harsh 
 * @version 1.00 2021/7/30
 */
import java.util.*;
public class KnightTour {
    public static void KnightTour(int chess[][],int row,int col,int move) {
    	if(row<0 || col<0 || row>=chess.length || col>=chess.length || chess[row][col]>0){
    		return;
    	}
    	else if(move==chess.length*chess.length){
    		chess[row][col]=move;
    		printBoard(chess);
    		chess[row][col]=0;
    		return;
    	}
    	chess[row][col]=move;
    	KnightTour(chess,row-2,col+1,move+1);
    	KnightTour(chess,row-1,col+2,move+1);
    	KnightTour(chess,row+1,col+2,move+1);
    	KnightTour(chess,row+2,col+1,move+1);
    	KnightTour(chess,row+2,col-1,move+1);
    	KnightTour(chess,row+1,col-2,move+1);
    	KnightTour(chess,row-1,col-2,move+1);
    	KnightTour(chess,row-2,col-1,move+1);
    	chess[row][col]=0;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter chess board size: ");
       int n=sc.nextInt();
       System.out.println("Where knight start row & col ");
       int row=sc.nextInt();
       int col=sc.nextInt();
       int chess[][]=new int[n][n];
       KnightTour(chess,row,col,1);
    }
    public static void printBoard(int chess[][]){
    	for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
