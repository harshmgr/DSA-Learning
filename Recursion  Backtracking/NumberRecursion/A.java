public class B{
	int add(int i,int j){
		return i+j;
	}
	}

public class A extends B {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	short s=9;
    	System.out.println(add(s,6));
        // TODO code application logic here
    }
    
}
