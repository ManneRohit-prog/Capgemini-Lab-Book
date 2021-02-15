package pack;

import java.util.Scanner;

public class Lab34
{
	
	static String reverse(char [] a,int n) {
		char b [] = new char[n];
		for(int i = 0;i<n;i++) {
			b[i] = a[n-(i+1)];
		}
		String ans1 = new String(b);
		return ans1;
	}

   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the string");
	   String str = sc.next();
	   char a[] = str.toCharArray();
	   System.out.print(str+"|"+reverse(a,str.length()));
	   
   }   
}