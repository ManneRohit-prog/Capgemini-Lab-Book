package org;
import java.util.Scanner;

public class IncreasingNumber {
		  public static void checkNumber(int n){
			  int temp=0;
			  while(n>0) {
				  int m=n%10;
				  n=n/10;
				  int p=n%10;
				  
				  if(p>m) {
					  System.out.println("not in an increasing order");
					  break;  
				  }
					  
			  }
		  }
			public static void main(String[] args) {
				Scanner input= new Scanner(System.in);
				int n= input.nextInt();
				checkNumber(n);
	}

}
