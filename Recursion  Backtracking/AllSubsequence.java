
import java.util.ArrayList;
public class AllSubsequence {
   
    public static ArrayList<String> AllSubsequence(String a) {
    	if(a.length()==0){
    		ArrayList<String> y=new ArrayList<>();
    		y.add("");
    		return y;
    	}
    	char c = a.charAt(0);
    	String x=a.substring(1);
    	ArrayList<String> subProb=AllSubsequence(x);
    	ArrayList<String> res=new ArrayList<>();
    	for(String s: subProb){
    		res.add(c+""+s);
    	
    	}
    	for(String s: subProb){
    		res.add(s);
    	}
    	return res;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a="abc";
        ArrayList<String> ar=AllSubsequence(a);
        for(String l:ar){
        	System.out.println(l);
        }
        
    }
}
