import java.util.*;
public class PrintStairPath {
    public static void PrintStairPath(int stair,String path) {
    if(stair==0){
    	System.out.println(path);
    	return;
    }
    if(stair<0){
    	return;
    }
    PrintStairPath(stair-1,path+"1");
    PrintStairPath(stair-2,path+"2");
    PrintStairPath(stair-3,path+"3");
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int stair=sc.nextInt();
       PrintStairPath(stair,"");
    }
}
