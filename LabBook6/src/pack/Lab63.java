package pack;
import java.util.*;
public class Lab63 {
		public static Map<Integer,Integer> getSquares(int[] a){
		Map<Integer,Integer> m1= new HashMap<Integer,Integer>();
		for(int i:a) {
			m1.put(i,i*i);
		}
		return m1;
		}
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			
			int[] a= {3,5,4,2,6};
			System.out.println(getSquares(a));
		}

	}
