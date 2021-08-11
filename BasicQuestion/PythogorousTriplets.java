import java.util.*;
public class PythogorousTriplets {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int max;
       if(a>b && a>c)
       	max=a;
       else if(b>a && b>c)
       	max=b;
       else
       	max=c;
       if(max==a){
       	if((a*a)==(b*b)+(c*c)){
       		System.out.println("true");
       	}
       	else
       		System.out.println("false");
       }
       if(max==b){
       	if((b*b)==(a*a)+(c*c)){
       		System.out.println("true");
       	}
       	else
       		System.out.println("false");
       }
       else
       {	
       	if((c*c)==(a*a)+(b*b)){
       		System.out.println("true");
       	}
       	else
       		System.out.println("false");
       	
       }
    }
}
