class rec1{

	static void decrease(int n){
		if(n==0) return;
		System.out.println(n);
		decrease(n-1);
	}

	public static void main(String []args){
		rec1.decrease(5);
	}
}