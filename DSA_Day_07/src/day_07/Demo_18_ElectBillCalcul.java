package day_07;

import java.util.Scanner;

public class Demo_18_ElectBillCalcul {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Energy consumed:-");
		int consumptions = sc.nextInt();
		int bill;
		// done by me itself
		
		if(consumptions >1 && consumptions < 100) {
			bill = consumptions*5;
			System.out.println(bill);
		}
		
		else if(consumptions >=100 && consumptions < 200) {
			bill = (consumptions)*5 + (consumptions-100)*2;
			System.out.println(bill);
		}
		else if(consumptions >=200 && consumptions < 300) {
			bill= consumptions*10;
			System.out.println(bill);

		}else {
			bill= consumptions*12;
			System.out.println(bill);

		}
		
	}

}
