package day_07;

import java.util.Scanner;

public class Demo_7_Even_odd {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:-");
		int a = sc.nextInt();
		//int b= sc.nextInt();
		
		if(a % 2 ==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");

		}
	}

}
