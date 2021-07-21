/**
 * @(#)StringOp.java
 *
 *
 * @author 
 * @version 1.00 2021/6/25
 */
 import java.util.ArrayList;

public class StringOp {
	
        
    
    public static void main(String[] args) {
       
       String s="Hello";
       
       for (int i = 0; i<s.length(); i++){
       	char c=s.charAt(i);
       	System.out.println(c);
       }
       String ss=s.substring(1,3);
       System.out.print(ss); 
       System.out.println(s.substring(3));
       
       
       
       ArrayList<Integer> arr= new ArrayList<>();
       arr.add(10);
       arr.add(15);
       arr.add(4);
       System.out.println(arr+" "+arr.size());
       
    }
}
