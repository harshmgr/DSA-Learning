import java.util.*;
public class Pattern_8 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int space=n-1;
        for(int i=1;i<=n;i++){
            if(space>=1){
             for(int j=1;j<=space;j++){
                System.out.print("\t");
                }
            }
            space--;
            System.out.println("*");
        }
       

    }
}
