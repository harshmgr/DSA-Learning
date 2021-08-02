import java.util.*;
public class Fibonacci {
    public static int Fibonacci(int n,int[] store) {
    	if(n==1 ||n==0)
    		return n;
    	if(store[n]!=0){
    		return store[n];
    	}
    	System.out.println("Call "+n);
    	int fib=Fibonacci(n-1,store)+Fibonacci(n-2,store);
    	store[n]=fib;
    	return fib;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println(Fibonacci(n,new int[n+1]));
    }
}
