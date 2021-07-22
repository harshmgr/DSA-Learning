import java.util.*;
public class MazeJump {
    public static ArrayList<String> MazeJump(int sr,int sc,int dr,int dc) {
    	if(sr==dr && sc==dc){
    		ArrayList<String> bres=new ArrayList<>();
    		bres.add("");
    		return bres;
    	}
    	ArrayList<String> paths=new ArrayList<>();
    	for(int hjump=1;hjump<=dc-sc;hjump++){
    		ArrayList<String> hpath=MazeJump(sr,sc+hjump,dr,dc);
  			for(String hpaths:hpath){
  				paths.add("h"+hjump+hpaths);
  			}
    	}
    	for(int vjump=1;vjump<=dr-sr;vjump++){
    		ArrayList<String> vpath=MazeJump(sr+vjump,sc,dr,dc);
  			for(String vpaths:vpath){
  				paths.add("v"+vjump+vpaths);
  			}
    	}
  		for(int djump=1;djump<=dr-sr && djump<=dc-sc;djump++){
    		ArrayList<String> dpath=MazeJump(sr+djump,sc+djump,dr,dc);
  			for(String dpaths:dpath){
  				paths.add("d"+djump+dpaths);
  			}	
    	}
    	
    	
    	return paths;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> path=MazeJump(1,1,n,m);
        System.out.println(path);
    }
}
