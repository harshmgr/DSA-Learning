/**
 * @(#)PrintEncoding.java
 *
 *
 * @author 
 * @version 1.00 2021/7/25
 */
import java.util.*;
public class PrintEncoding {
    public static void PrintEncoding(String ques,String answer) {
    if(ques.length()==0){
    	System.out.println(answer);
    }else if(ques.length()==1){
    	char ch=ques.charAt(0);
    	if(ch=='0'){
    		return;
    	}else{
    		int chv=ch-'0';
    		char code=(char)('a'+chv-1);
    		System.out.println(answer+code);	
    	}
    }else{
    	char ch=ques.charAt(0);
    	String rem=ques.substring(1);
    	if(ch=='0'){
    		return;
    	}else{
    		int chv=ch-'0';
    		char code=(char)('a'+chv-1);
    		PrintEncoding(rem,answer+code);	
    	}
    	String firstTwo=ques.substring(0,2);
    	String roq=ques.substring(2);
    	
    	int charfirsttwo=Integer.parseInt(firstTwo);
    	if(charfirsttwo<=26){
    		char code=(char)('a'+charfirsttwo-1);
    		PrintEncoding(roq,answer+code);
    	}
    }
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String ques=sc.next();
       PrintEncoding(ques,"");
    }
}
