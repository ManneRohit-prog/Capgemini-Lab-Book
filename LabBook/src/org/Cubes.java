package org;

public class Cubes {
		static int cubes(int n) {
	    int sum = 0; 
	    for (int x=1; x<=n; x++) {
	        sum += x*x*x; }
	    return sum; 
	} 


		public static void main(String[] args) {
			 System.out.println(cubes(5)); 
		}

	}
