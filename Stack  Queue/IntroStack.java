import java.util.*;
public class IntroStack {
	public static void main (String[] args) {
	Stack<Integer> st=new Stack<>();
	st.push(10);
	st.push(20);
	st.push(30);
	System.out.println(st);
	System.out.println(st.peek()+" "+st.size());
}
}