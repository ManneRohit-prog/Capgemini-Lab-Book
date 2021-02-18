package pack;
import java.util.*;
public class Lab66 {
		public static List<String> votersList(Map<String,Integer> m){
			List<String> li=new ArrayList<String>();
			Set<String> s= m.keySet();
			for(String i:s) {
				Integer age= m.get(i);
				if(age>=18)
					li.add(i);
			}
			return li;
		}

		public static void main(String[] args) {
			Map<String,Integer> m= new HashMap<String,Integer>();
			m.put("ID121", 19);
			m.put("ID154", 13);
			m.put("ID272", 26);
			m.put("ID768", 18);
			System.out.println(votersList(m));
		}

	}