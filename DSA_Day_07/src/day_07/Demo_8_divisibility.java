package day_07;

import java.util.Scanner;

public class Demo_8_divisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:-");
		int a = sc.nextInt();

		if(a % 7 == 0) {
			System.out.println("number is divisible by 7");
		}else {
			System.out.println("number is notdivisible by 7");
	
		}
		
	}

}
