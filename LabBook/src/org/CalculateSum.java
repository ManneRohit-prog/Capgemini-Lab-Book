package org;
import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int sum=0;
	System.out.println("Enter the value of n");
	int n= input.nextInt();
	for(int i=n;i>0;i--) {
	if((i%3==0)||(i%5==0)) {
	sum+=i;

	}
	}
	System.out.println(sum);

	}

	}


