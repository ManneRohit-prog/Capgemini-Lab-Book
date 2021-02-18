package pack;
import java.util.*;
public class Lab64 {
		public static Map<String,String> getStudents(Map<String, Integer> m ){
			Map<String,String> m1=new HashMap<String,String>();
			Set<String> st=m.keySet();
			for(String i:st) {
				Integer marks= m.get(i);
				if(marks>=90)
					m1.put(i, "Gold");
				else if(marks>=80)
					m1.put(i, "Silver");
				else if(marks>=70)
					m1.put(i, "Bronze");
			}
			return m1;
		}

		public static void main(String[] args) {
			
			Map<String,Integer> m= new HashMap<String,Integer>();
			m.put("1001", 86);
			m.put("1002", 78);
			m.put("1003", 98);
			m.put("1004", 93);
			System.out.println(getStudents(m));
			
		}

	}