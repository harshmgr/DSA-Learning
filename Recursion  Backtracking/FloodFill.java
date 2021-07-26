import java.util.*;
public class FloodFill {
    public static void FloodFill(int maze[][],int row,int col,String answer,boolean visited[][]) {
    if(row<0 ||col<0 || row==maze.length || col==maze[0].length || maze[row][col]==1 || visited[row][col]==true)
    	return;
    if(row==maze.length-1 && col==maze[0].length-1){
    	System.out.println(answer);
    	return;
    }
    visited[row][col]=true;
    FloodFill(maze,row-1,col,answer+"t",visited);
    FloodFill(maze,row,col-1,answer+"l",visited);
    FloodFill(maze,row+1,col,answer+"d",visited);
    FloodFill(maze,row,col+1,answer+"r",visited);
    visited[row][col]=false;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      int col=sc.nextInt();
      int maze[][]=new int[row][col];
      for(int i=0;i<row;i++){
      	for(int j=0;j<col;j++){
      		maze[i][j]=sc.nextInt();
      	}
      }
      boolean visited[][] = new boolean[row][col];
      FloodFill(maze,0,0,"",visited);
    }
}