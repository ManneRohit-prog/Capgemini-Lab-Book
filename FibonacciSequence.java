package org;
import java.util.Scanner;
public class FibonacciSequence {

public static void main(String[] args) {
	int a=0,b=1,c=0;
	Scanner input= new Scanner(System.in);
	System.out.println("enter the number");
	int n= input.nextInt();
	for(int i=1;i<n;i++) {
		c=a+b;
		//System.out.println(c+" " );
		a=b;
		b=c;
		
	}	
	System.out.println(c);
	}
}

		
		