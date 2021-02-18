package pack;
import java.util.*;

public class Lab62 {
	public static Map<Character, Integer> countChars(char c[]){
		Map<Character, Integer> m= new HashMap<Character, Integer>();
		for(char i:c) {
			if(m.containsKey(i))
				m.put(i, m.get(i)+1);
			else
				m.put(i, 1);
		}
		return m;
		
	}
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			String str= s.next();
			char c[]=str.toCharArray();
			System.out.println(countChars(c));
		}

}
