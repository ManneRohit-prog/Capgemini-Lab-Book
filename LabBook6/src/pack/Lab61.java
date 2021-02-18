package pack;
import java.util.*;


public class Lab61 {
		public static List<Integer> getValues(Map<String, Integer> m,Collection li){
			
			List<Integer> l= new ArrayList<Integer>(li);
			Collections.sort(l);
			return l;
		} 
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			Map<String, Integer> m=new HashMap<String, Integer>();
			m.put("Babblu", 3000);
			m.put("Rohit", 1000);
			m.put("Kumar", 2500);
			m.put("Manne", 3000);
			Collection li= (m.values());
			System.out.println(getValues(m,li));
			
		}

}
