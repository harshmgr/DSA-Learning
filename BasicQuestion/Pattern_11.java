import java.util.*;
public class Pattern_11 {
        public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int num=1;
        int line=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=line;j++){
                System.out.print(num+"\t");
                 num++;
            }
            line++;
           
            System.out.println();
            
        }

    }
}
