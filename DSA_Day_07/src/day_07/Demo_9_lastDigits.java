package day_07;

import java.util.Scanner;

public class Demo_9_lastDigits {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:-");
		int a = sc.nextInt();
		
		if(a % 10 == 4) {
			System.out.println(a + " last digit is 4");
		}else {
			System.out.println(a + " last digit is not 4");

		}

	}

}
