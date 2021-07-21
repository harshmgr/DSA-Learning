/**
 * @(#)getMazePath.java
 *
 *
 * @author 
 * @version 1.00 2021/7/19
 */
import java.util.*;
public class getMazePath {
  
    public static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc) {
    	if(sr==dr && sc==dc){
    		ArrayList<String> bres=new ArrayList<>();
    		bres.add("");
    		return bres;
    	}
    	ArrayList<String> hpath=new ArrayList<>();
    	ArrayList<String> vpath=new ArrayList<>();
    	if(sc<dc){
    		hpath=getMazePath(sr,sc+1,dr,dc);
    	}
    	if(sr<dr){
    		vpath=getMazePath(sr+1,sc,dr,dc);
    	}
    	
    	ArrayList<String> path=new ArrayList<>();
    	for(String vp:vpath){
    		path.add("v"+vp);
    	}
    	for(String hp:hpath){
    		path.add("h"+hp);
    	}
    	return path;
    }
    
    
    public static void main(String[] args) {
       ArrayList<String> path=getMazePath(1,1,3,3);
       System.out.println(path);
    }
}
