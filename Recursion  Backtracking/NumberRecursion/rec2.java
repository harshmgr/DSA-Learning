class rec2{
	static void increase(int n){
		if(n==0)
			return;
		increase(n-1);
		System.out.println(n);
	}
	public static void main(String[] args){
		increase(5);
	}
}