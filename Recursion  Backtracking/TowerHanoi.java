public class TowerHanoi {
    public static void TowerHanoi(int n,char A,char B,char C) {
    	if(n==0)
    		return;
    		TowerHanoi(n-1,A,C,B);
    		System.out.println(n+ "from "+A+" to "+C);
    		TowerHanoi(n-1,C,B,A);
    }
    
   
    public static void main(String[] args) {
       TowerHanoi(4,'A','B','C');
    }
}
