package pack;
import java.util.*;
public class Lab65 {
		public static int getSecondSmallest(int[] a){
			List<Integer> li=new ArrayList<Integer>();
			for(int i:a) {
				li.add(i);
			}
			Collections.sort(li);
			return(li.get(1));
			
		} 

		public static void main(String[] args) {
			int[] a= {1,6,3,4,2};
			System.out.println(getSecondSmallest(a));
			
		}

	}