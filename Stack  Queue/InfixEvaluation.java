import java.io.*;
import java.util.*;

public class InfixEvaluation {
	public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Stack<Integer> operands=new Stack<>();
    Stack<Character> operators=new Stack<>();
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        if(ch=='('){
            operators.push(ch);
        }else if(Character.isDigit(ch)){
            operands.push(ch-'0');
        }else if(ch==')'){
            while(operators.peek()!='('){
                char operator=operators.pop();
                int v2=operands.pop();
                int v1=operands.pop();
                int val=operation(v1,v2,operator);
                operands.push(val);
            }
            operators.pop();
        }else if(ch=='+' || ch=='-'||ch=='*'||ch=='/'){
            while(operators.size()>0 && operators.peek()!='(' && precedence(ch)<=precedence(operators.peek())){
              char operator=operators.pop();
                int v2=operands.pop();
                int v1=operands.pop();
                int val=operation(v1,v2,operator);
                operands.push(val);   
            }
            operators.push(ch);
        }
    }
    while(operators.size()!=0){
        char operator=operators.pop();
                int v2=operands.pop();
                int v1=operands.pop();
                int val=operation(v1,v2,operator);
                operands.push(val); 
    }
    System.out.println(operands.peek());
 }
 public static int operation(int val1,int val2,char op){
    if(op=='+'){
       return val1+val2;  
    }else if(op=='-'){
        return val1-val2;
    }else if(op=='*'){
        return val1*val2;
    }else{
        return val1/val2;
    }
}
public static int precedence(char op){
    if(op=='+' || op=='-'){
        return 1;
    }else 
        return 2;
} 
}