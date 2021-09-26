/**
 * @(#)ArrangeBuildings.java
 *
 *
 * @author 
 * @version 1.00 2021/9/25
 */
import java.util.*;
public class ArrangeBuildings {
	public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   int ob=1;
    int os=1;
    for(int i=2;i<=n;i++){
        int nb=os;
        int ns=os+ob;
        
        os=ns;
        ob=nb;
    }
    int total=os+ob;
    total=total*total;
    System.out.println(total);
 }
}
