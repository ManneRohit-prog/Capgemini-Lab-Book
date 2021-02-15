package pack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab37 {

   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter length of array");
	   int num = sc.nextInt();
	   int a[] = new int[num];
	   System.out.println("Enter array");
	   for (int i = 0;i<num ;i++) {
		   a[i] = sc.nextInt();
	   }  
	   int sum = 0;
	   System.out.println("Your array");
	   for (int i = 0;i<num;i++) {
		   sum+=a[i];
		   System.out.println(a[i]);
	   }
	   System.out.println("Sum of elements in array");
	   System.out.println(sum);
   }   
}