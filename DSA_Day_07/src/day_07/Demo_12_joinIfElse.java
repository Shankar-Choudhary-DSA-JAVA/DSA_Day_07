package day_07;

import java.util.Scanner;

public class Demo_12_joinIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order:-");
		 String order = sc.next();

		// to compare string we need to use .equals() methods
		 
		 if(order.equals("Pizza")) {
			 System.out.println("BF will pays");
		 }else {
			 System.out.println("GF will pays");
		 }
	}

}
