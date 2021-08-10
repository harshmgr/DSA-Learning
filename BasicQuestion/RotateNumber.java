import java.util.*;
public class RotateNumber {
    public static void RotateNumber(int num,int rotate) {
    	int t=num;
    	int dig=0;
    	while(t>0){
    		t=t/10;
    		dig++;
    	}
    	rotate=rotate%dig;			//convert bigger rotate value into smaller ones
    	if(rotate<0){
    		rotate=rotate+dig;		//convert negative rotation into positive rotation
    	}
    	int div=1;
    	int mul=1;
    	for(int i=1;i<=dig;i++){
    		if(i<=rotate){
    			div*=10;
    		}
    		else{
    			mul*=10;
    		}
    	}
    	int quo=num/div;
    	int rem=num%div;
    	rem=rem*mul;
    	rem=rem+quo;
    	System.out.println(rem);
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        RotateNumber(n,k);
    }
}
