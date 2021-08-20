/**
 * @(#)AnyBaseAddition.java
 *
 *
 * @author 
 * @version 1.00 2021/8/20
 */
import java.util.*;
public class AnyBaseAddition {
    public static int AnyBaseAddition(int num1,int num2,int base) {
    int add=0;
    int carry=0;
    int power=1;
    while(num1>0 || num2>0 || carry>0){
    	int n1=num1%10;
    	int n2=num2%10;
    	num1=num1/10;
    	num2=num2/10;
    	int res=n1+n2+carry;
    	carry=res/base;
    	res=res%base;
    	add+=res*power;
    	power=power*10;
    }
    return add;
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       int base=sc.nextInt();
       System.out.println(AnyBaseAddition(num1,num2,base));
    }
}
