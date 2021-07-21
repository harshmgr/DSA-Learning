/**
 * @(#)SubseqRecursion.java
 *
 *
 * @author 
 * @version 1.00 2021/6/29
 */
import java.util.*;
public class SubseqRecursion {
        
    /**
     * Creates a new instance of <code>SubseqRecursion</code>.
     */
    public static ArrayList<String> SubseqRecursion(String s) {
    	if(s.length()==0){
    		ArrayList<String> y=new ArrayList<>();
    		y.add("");
    		return y;
    	}
    	char c=s.charAt(0);
    	String a=s.substring(1);
    	ArrayList<String> res=new ArrayList<>();
    	
    	ArrayList<String> rr=SubseqRecursion(a);
    	for(String i:rr){
    		res.add(c+""+i);
    	}
    	for(String i:rr){
    		
    		res.add(i);
    	}
    	return res;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a="abc";
        ArrayList<String> res=SubseqRecursion(a);
        System.out.println(res);
    }
}
