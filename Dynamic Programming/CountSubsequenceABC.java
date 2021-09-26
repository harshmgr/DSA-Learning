/**
 * @(#)CountSubsequenceABC.java
 *
 *
 * @author 
 * @version 1.00 2021/9/26
 */
import java.util.*;
public class CountSubsequenceABC {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int a=0;
        int ab=0;
        int abc=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a'){
                a=2*a+1;
            }else if(c=='b'){
                ab=2*ab+a;
            }else if(c=='c'){
                abc=2*abc+ab;
            }
        }
        System.out.println(abc);
    }
}
