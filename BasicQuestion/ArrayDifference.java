import java.util.*;
public class ArrayDifference {
	public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int a1[]=new int[n1];
    for(int i=0;i<n1;i++){
        a1[i]=sc.nextInt();
    }
    int n2=sc.nextInt();
    int a2[]=new int[n2];
    for(int i=0;i<n2;i++){
        a2[i]=sc.nextInt();
    }
    int sub[]=new int[n2];
    int carry=0;
    int i=a1.length-1;
    int j=a2.length-1;
    int k=sub.length-1;
    while(k>=0){
        int d=0;
        int a1v=i>=0?a1[i]:0;
        a2[j]=a2[j]+carry;
        if(a2[j]>=a1v){
            d=a2[j]-a1v;
            carry=0;
        }
        else{
            carry=-1;
            d=a2[j]+10-a1v;
        }
        sub[k]=d;
        i--;
        j--;
        k--;
    }
    int idx=0;
    while(idx<sub.length){
        if(sub[idx]==0){
            idx++;
        }else{
            break;
        }
    }
    while(idx<sub.length){
        System.out.println(sub[idx]);
        idx++;
    }
 }
}
