package pack;
import java.util.*;
public class Lab44 {
	    static int[] modifyArray(int[] array) {
	        int n = array.length;
	        Arrays.sort(array);
	        List<Integer> res = new ArrayList<>();
	        for (int i = 0; i < n - 1; i++) {
	            if (array[i] != array[i + 1]) {
	                res.add(array[i]);
	            }
	        }
	        res.add(array[n - 1]);
	        res.sort(Collections.reverseOrder());
	        int[] temp = new int[res.size()];
	        for (int i = 0; i < res.size(); i++) {
	            temp[i] = res.get(i);
	        }
	        return temp;
	    }

	    public static void main(String[] args) {
	        Scanner read = new Scanner(System.in);
	        int n = read.nextInt(); //read size
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) { // read arr elements
	            arr[i] = read.nextInt();
	        }
	        int[] res = modifyArray(arr);
	        for (int s : res) {
	            System.out.println(s);
	        }
		

	}

}
