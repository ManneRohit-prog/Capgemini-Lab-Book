package pack;
import java.util.Scanner;
import java.util.Arrays;

public class Lab36 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char a[] = str.toCharArray();
		int num = str.length();
		Arrays.sort(a);
		String k = new String(a);
		if (str.equals(k)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
