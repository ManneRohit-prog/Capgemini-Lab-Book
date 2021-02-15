package pack;
import java.util.*;

public class Lab33 {
	    static int[] getSorted(int[] arr) {

	        Arrays.sort(arr);
	        int[] res = new int[arr.length];
	        for (int i = arr.length - 1; i >= 0; i--) {
	            res[arr.length - 1 - i] = arr[i];
	        }
	        return res;
	    }

	    public static void main(String[] args) {
	        Scanner read = new Scanner(System.in);
	        int n = read.nextInt(); // read size
	        int[] arr = new int[n];
	        //read array elements
	        for (int i = 0; i < n; i++) {
	            arr[i] = read.nextInt();
	        }
	        int[] res = getSorted(arr);
	        for(int i:res) {
	            System.out.println(i);
	        }

	}

}
