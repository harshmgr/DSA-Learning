import java.util.*;
public class BenjaminBulbs { 
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i*i<=n;i++){
        System.out.println(i*i);   //perfect square number bulb will always  only because it has 2n+1 factors 
   }
  }
}
