import java.util.*;
public class Pattern_7 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            if(i>1){
             for(int j=1;j<i;j++){
                System.out.print("\t");
                }
            }
            System.out.println("*");
        }
       

    }
}
