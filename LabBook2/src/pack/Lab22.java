package pack;
import java.util.*;

public class Lab22 {
		    static String[] sortStrings(String[] strs) {
		        Arrays.sort(strs);
		        int size = strs.length;
		        String[] res = new String[size];
		        if (size % 2 == 1) {
		            for (int i = 0; i < (size / 2) + 1; i++) {
		                res[i] = strs[i].toUpperCase();
		            }
		            for (int i = (size / 2) + 1; i < size; i++) {
		                res[i] = strs[i].toLowerCase();
		            }
		        } else {
		            for (int i = 0; i < (size / 2); i++) {
		                res[i] = strs[i].toUpperCase();
		            }
		            for (int i = (size / 2); i < size; i++) {
		                res[i] = strs[i].toLowerCase();
		            }
		        }

		        return res;
		    }

		    public static void main(String[] args) {
		        Scanner read = new Scanner(System.in);
		        int n = read.nextInt(); //read no of strings
		        String[] strs = new String[n+1];
		        for (int i = 0; i < strs.length; i++) {
		            strs[i] = read.nextLine();
		        }
		        String[] res = sortStrings(strs);
		        for (String s : res) {
		            System.out.println(s);
		        }
		    }

		}
