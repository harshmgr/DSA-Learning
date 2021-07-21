/**
 * @(#)InverseNumber.java
 *
 *
 * @author 
 * @version 1.00 2021/7/20
 */
import java.util.*;
public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=1,output=0;
        while(num!=0){
        	int temp=num%10;
        	int digit=count;
        	int pos=temp;
        	output=output+count*(int)Math.pow(10,pos-1);
        	num=num/10;
        	count++;
        }
        System.out.println(output);
    }
}
