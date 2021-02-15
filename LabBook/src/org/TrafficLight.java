package org;

import java.util.Scanner;
	public class TrafficLight {

		public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
			System.out.println("enter the number");
			int colour= input.nextInt();
			switch(colour) {
			case 1: System.out.println("Stop!"); break;
			case 2: System.out.println("Start"); break;
			case 3: System.out.println("Go!"); break;
			default: System.out.println("no colour selected");
			}
			}
			
		}
