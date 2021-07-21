import java.util.*;
 public class getKPC {
 public static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
    	if(str.length()==0){
    		ArrayList<String> bres=new ArrayList<>();
    		bres.add("");
    		return bres;
    	}
    	char ch=str.charAt(0);
    	String s=str.substring(1);
    	ArrayList<String> rres=getKPC(s);
    	ArrayList<String> res=new ArrayList<>();
    	String codeforch=codes[ch-'0'];
    	for(int i=0;i<codeforch.length();i++){
    		char chcode=codeforch.charAt(i);
    		for(String r:rres){
    			res.add(chcode+""+r);
    		}
    	}
    	
    	return res;
    }
    public static void main(String[] args) {
        System.out.println("Enter Keypad:");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> result=getKPC(str);
        System.out.println(result);
    }
}
