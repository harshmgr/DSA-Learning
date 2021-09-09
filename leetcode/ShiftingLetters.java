/**
 * @(#)ShiftingLetters.java
 *
 *
 * @author 
 * @version 1.00 2021/9/9
 */

public class ShiftingLetters {
  public static String shiftingLetters(String s, int[] shifts) {
        char[] arr = S.toCharArray();
        int shift = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            shift = (shift + shifts[i]) % 26;
            arr[i] = (char)((arr[i] - 'a' + shift) % 26 + 'a');
        }
        return new String(arr);
    }
    public static void main (String[] args) {
		String s="abc";
		int shifts[]=new int[3];
		shifts[0]=3;
		shifts[1]=5;
		shifts[2]=9;
		System.out.println(shiftingLetters(s,shifts));
}
    
}
