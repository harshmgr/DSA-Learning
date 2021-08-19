/**
 * @(#)AnyBaseToDecimal.java
 *
 *
 * @author 
 * @version 1.00 2021/8/20
 */
import java.util.*;
public class AnyBaseToDecimal {
	public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int num=0;
      int count=0;
      while(n>0){
          int quot=n%10;
          n=n/10;
          num=num+quot*(int)Math.pow(b,count);
          count++;
      }
      return num;
   }
}
