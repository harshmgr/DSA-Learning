class abc{
	public static void main (String[] args) {
	try{
		Float f1 =new Float("3.0"); /* comment**** */
		int x=f1.intValue(); 
		byte b=f1.byteValue();	/* this //more*/
		double d=f1.doubleValue();  // /*This // // comment */
		System.out.println(x+b+d);
	}catch(NumberFormatException e){
		System.out.println("Bad Number");
	}
}
}