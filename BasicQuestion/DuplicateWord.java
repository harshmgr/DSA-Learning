import java.util.*;
public class DuplicateWord {
	public static void DuplicateWord(String sentence) {
		String[] words = sentence.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String word : words){
			Integer integer = map.get(word);
  
            if (integer == null){         
                map.put(word, 1);
            }
            else {
                map.put(word, integer + 1);			
			}
		}
		Set<String> set = map.keySet();
        for (String word : set) {
            if (map.get(word) > 1)
                System.out.print(word+" ");
        }
    }		
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String sentence=sc.nextLine();
       DuplicateWord(sentence);
    }
}
