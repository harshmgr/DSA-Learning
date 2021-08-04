import java.util.*;
public class ClimbStairs {
	
    public static int ClimbStairs(int n,int []qb) {
    	if(n==0){
    		return 1;
    	}
 		else if(n<0){
 			return 0;
 		}
 		if(qb[n]!=0){
 			return qb[n];
 		}
    	int count=ClimbStairs(n-1,qb)+ClimbStairs(n-2,qb)+ClimbStairs(n-3,qb);
    	qb[n]=count;
    	return count;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ClimbStairs(n,new int[n+1]));
    }
}
