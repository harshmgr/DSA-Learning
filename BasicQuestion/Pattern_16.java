import java.util.*;
public class Pattern_16 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int space=2*n-3;
    int star=1;
    for(int i=1;i<=n;i++){
        int val=1;
        for(int j=1;j<=star;j++){
            System.out.print(val+"\t");
            val++;
        }
        for(int j=1;j<=space;j++){
            System.out.print("\t");
        }
        if(i==n){
            star--;
            val--;
        }
        for(int j=1;j<=star;j++){
            val--;
            System.out.print(val+"\t");
        }
        space-=2;
        star++;
        
        System.out.println();
    }
 }
}
