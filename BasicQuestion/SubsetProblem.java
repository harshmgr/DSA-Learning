import java.util.*;
public class SubsetProblem {
    public static void main(String[] args) {
       	Scanner sc=new Scanner(System.in);
       	int n=sc.nextInt();
       	int arr[]=new int[n];
       	for(int i=0;i<n;i++){
       			arr[i]=sc.nextInt();
       		}
       	int total=(int)Math.pow(2,arr.length);
       	for(int i=0;i<total;i++){
       		String set="";
       		int temp=i;
       		for(int j=arr.length-1;j>=0;j--){
       				int bit=temp%2;
       				temp=temp/2;
       				if(bit==0){
       					set="-\t"+set;
       					}else{
       						set=arr[j]+"\t"+set;
       						}
       			}
       			System.out.println(set);
       		}
    }
}
