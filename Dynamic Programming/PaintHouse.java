import java.util.*;
public class PaintHouse {
   public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
         long red = arr[0][0];
        long blue = arr[0][1];
        long green = arr[0][2];

        for (int i = 1; i < arr.length; i++) {
            long nred = arr[i][0] + Math.min(blue, green);
            long nblue = arr[i][1] + Math.min(red, green);
            long ngreen = arr[i][2] + Math.min(red, blue);

            red = nred;
            blue = nblue;
            green = ngreen;
        }

        System.out.println(Math.min(red, Math.min(blue, green)));
    }
}
