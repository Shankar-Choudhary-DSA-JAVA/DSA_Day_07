package day_07;

import java.util.Scanner;

public class Demo_14_joinIfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill:-");
		int bill = sc.nextInt();
		

		if(!(bill % 10 == 4 && bill >=500)) { // NOT !
			System.out.println("BF will pay");
		}else {
			System.out.println("GF will pay");

		}
	}

}
