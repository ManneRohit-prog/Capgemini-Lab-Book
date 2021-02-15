package pack;

import java.util.Scanner;
import java.util.Arrays;

public class Lab35 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		String str = Integer.toString(inp);
		char a[] = str.toCharArray();
		int num = str.length();
		int b[] = new int[num];
		for (int i = 0;i<num;i++) {
			b[i] = Character.getNumericValue(a[i]);
		}
		String ans = "";
		for (int i = 0;i<num-1 ; i++) {
			int d = Math.abs(b[i]-b[i+1]);
			ans+=(char)(d+'0');
		}
		ans+=(char)(b[num-1]+'0');
		System.out.println(ans);
	}
}