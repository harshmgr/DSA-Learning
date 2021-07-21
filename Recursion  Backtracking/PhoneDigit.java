import java.util.*;
public class PhoneDigit {
    public static ArrayList<String> PhoneDigit(String key) {
    	if(key.length()==0){
    		ArrayList<String> y=new ArrayList<>();
    		y.add("");
    		return y;
    	}
    	char c=key.charAt(0);
    	String str=key.substring(1);
    	ArrayList<String> rres=PhoneDigit(str);
    	ArrayList<String> res=new ArrayList<>();
    	String codesofch=codes[c-'0'];
    	for(int i=0;i<codesofch.length();i++){
    		char co=codesofch.charAt(i);
    		for(String st:rres){
    			res.add(co+""+st);
    		}
    	}
    	return res;
    	
    }
    
public static String [] codes={".;","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void main(String[] args) {
       String key="456";
       System.out.println(PhoneDigit(key));
    }
}
