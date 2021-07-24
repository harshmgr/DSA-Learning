import java.util.*;
public class PrintPermutation {
    public static void PrintPermutation(String que,String ans) {
    	if(que.isEmpty()){
    		System.out.println(ans);
    		return;
    	}
    	for(int i=0;i<que.length();i++){
    		char ch=que.charAt(i);
    		String leftside=que.substring(0,i);
    		String rightside=que.substring(i+1);
    		String total=leftside+rightside;
    		PrintPermutation(total,ans+ch);
    	}
    
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String que=sc.next();
       PrintPermutation(que,"");
    }
}
