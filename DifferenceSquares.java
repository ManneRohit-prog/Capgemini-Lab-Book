package org;
import java.util.Scanner;
public class DifferenceSquares {
	  public static void calculateDifference(int n){
		  int sum1=0,sum2=0;
		  for(int i=1;i<=n;i++) {
			  sum1+= Math.pow(i,2);
		  }
		  for(int j=1;j<=n;j++) {
			  sum2+=j;
		  }
		  double x= Math.pow(sum2, 2);
		  System.out.println(sum1-x);
		  //System.out.println(x);
	  }
		public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
			int n= input.nextInt();
			calculateDifference(n);
		}	
}
