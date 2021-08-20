
public class ArrayBasic1 {
    public static void swap(int arr[],int i,int j) {
    	arr[i]=arr[i]^arr[j];
    	arr[j]=arr[i]^arr[j];
    	arr[i]=arr[i]^arr[j];
    }
    public static void main(String[] args) {
        int arr[]=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        int two[]=arr;
        two[2]=300;
        
        for(int i=0;i<two.length;i++){
        	System.out.println(two[i]);
        }
        System.out.println("\n");
        swap(arr,0,1);
        for(int i=0;i<two.length;i++){
        	System.out.println(two[i]);
        }
        
    }
}
