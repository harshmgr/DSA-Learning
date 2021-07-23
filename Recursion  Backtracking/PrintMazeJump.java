import java.util.*;
public class PrintMazeJump {
    public static void PrintMazeJump(int sr,int sc,int dr,int dc,String path) {
    	if(sr==dr && sc==dc){
    		System.out.println(path);
    		return;
    	}
    	for(int hjump=1;hjump<=dc-sc;hjump++){
    		PrintMazeJump(sr,sc+hjump,dr,dc,path+"h"+hjump);
    		
    	}
    	for(int vjump=1;vjump<=dr-sr;vjump++){
    		PrintMazeJump(sr+vjump,sc,dr,dc,path+"v"+vjump);
    		
    	}
    	for(int djump=1;djump<=dr-sr && djump<=dc-sc;djump++){
    		PrintMazeJump(sr+djump,sc+djump,dr,dc,path+"d"+djump);
    		
    	}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dr=sc.nextInt();
        int dc=sc.nextInt();
        PrintMazeJump(1,1,dr,dc,"");
    }
}
