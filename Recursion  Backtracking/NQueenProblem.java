import java.util.*;
public class NQueenProblem {
    public static void NQueenProblem(int chess[][],String asf,int row) {
    	if(row==chess.length){
    		System.out.println(asf);
    		return;
    	}
    	for(int col=0;col<chess.length;col++){
    	if(isSafe(chess,row,col)==true){
    		chess[row][col]=1;
    		NQueenProblem(chess,asf+row+col+",",row+1);
    		chess[row][col]=0;
    	}
    	}
    }
    public static boolean isSafe(int chess[][],int row,int col){
    	for(int i=row-1,j=col;i>=0;i--){ //Vertically Check
    		if(chess[i][j]==1){
    			return false;
    		}
    	}
    	for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){ //diagonal upper-left
    		if(chess[i][j]==1){
    			return false;
    		}
    	}
    	for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){ //diagonal upper-right
    		if(chess[i][j]==1){
    			return false;
    		}
    	}
    	return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n chess board: ");
        int n=sc.nextInt();
        int chess[][]=new int[n][n];
        NQueenProblem(chess,"",0);
    }
}
