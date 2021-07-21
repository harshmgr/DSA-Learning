/**
 * @(#)StairPath.java
 *
 *
 * @author 
 * @version 1.00 2021/7/18
 */
import java.util.*;
public class StairPath {
    public static ArrayList<String> getStairPath(int n) {
    	  if(n <= 0){
            ArrayList<String> bres = new ArrayList<>();

            if(n == 0){
                bres.add("");
            }

            return bres;
        }
    	
    	ArrayList<String> path1=getStairPath(n-1);
    	ArrayList<String> path2=getStairPath(n-2);
    	ArrayList<String> path3=getStairPath(n-3);
    	ArrayList<String> paths=new ArrayList<>();
    	
    	for(String path:path1){
    		paths.add(1 +path);
    	}
    	for(String path:path2){
    		paths.add(2 +path);
    	}
    	for(String path:path3){
    		paths.add(3 +path);
    	}
    	return paths;
    }
   
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       ArrayList<String> ttlpath=getStairPath(n);
       System.out.println(ttlpath);
    }
}
