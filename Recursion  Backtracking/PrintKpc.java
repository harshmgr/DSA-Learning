
import java.util.*;
public class PrintKpc {
public static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void PrintKpc(String que,String ans) {
    	if(que.length()==0){
    		System.out.println(ans);
    		return;
    	}
    	char ch=que.charAt(0);
    	String rem=que.substring(1);
    
    	String codech=codes[ch-'0'];
    	for(int i=0;i<codech.length();i++){
    		char codeEach=codech.charAt(i);
    		PrintKpc(rem,ans+codeEach);
    	}
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String que=sc.next();
      PrintKpc(que,"");
    }
}
