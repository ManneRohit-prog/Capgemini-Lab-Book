package pack;
import java.util.*;


public class Lab2 {
		    static int getSecondSmallest(int[] arr) {
		        Arrays.sort(arr);

		        return arr[1];
		    }

		    public static void main(String[] args) {
		        Scanner read = new Scanner(System.in);
		        int n = read.nextInt();
		        int[] arr = new int[n];
		        for (int i = 0; i < n; i++) {
		            arr[i] = read.nextInt();
		        }
		        System.out.println(getSecondSmallest(arr));
		    }

		}
