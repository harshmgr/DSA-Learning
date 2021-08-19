/**
 * @(#)DemicalToAnyBase.java
 *
 *
 * @author 
 * @version 1.00 2021/8/20
 */
import java.util.*;
public class DemicalToAnyBase {
	public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
      int power=0;
      int num=0;
      while(n>0){
          int quo=n%b;
          num=num+quo*(int)Math.pow(10,power);
          power++;
          n=n/b;
      }
      return num;
   }
}
