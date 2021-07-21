/**
 * @(#)SubSeq.java
 *
 *
 * @author 
 * @version 1.00 2021/7/1
 */
import java.util.*;
public class SubSeq {
        
    /**
     * Creates a new instance of <code>SubSeq</code>.
     */
    public static ArrayList<String> SubSeq(String s) {
    	if(s.length()==0){
    		ArrayList<String> y=new ArrayList<>();
    		y.add("");
    		return y;
    	}
    	char c=s.charAt(0);
    	String a=s.substring(1);
    	ArrayList<String> r= SubSeq(a);
    	ArrayList<String> res=new ArrayList<>();
    	for(String p: r){
    		res.add(c+""+p);
    	res.add(p);
    	}
    	return res;
    }
    
    public static void main(String[] args) {
        String a="abcd";
       System.out.println(SubSeq(a));
    }
}
