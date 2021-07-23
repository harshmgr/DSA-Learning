import java.util.*;
public class PrintMazePath {
    public static void PrintMazePath(int sr,int sc,int dr,int dc,String path) {
    if(sc==dc && sr==dr){
    	System.out.println(path);
    	return;
    }
    
    if(sc<dc){
    	PrintMazePath(sr,sc+1,dr,dc,path+"h");
    }
    if(sr<dr){
    	PrintMazePath(sr+1,sc,dr,dc,path+"v");
    }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        PrintMazePath(1,1,r,c,"");
    }
}
