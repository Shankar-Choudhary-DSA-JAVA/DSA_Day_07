package day_07;

import java.util.Scanner;

public class Demo_17_LargestOfThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:-");
		int a = sc.nextInt();	
		int b = sc.nextInt();
        int c = sc.nextInt();
        
        // done by my self

		if(a > b && a>c) {
			System.out.println(a +" a is largest");
		}
		//else if (a>b &&  a < c) {
//			else if (b>a &&  b > c) {
		else if (b>c) {

			System.out.println(b +" b is largest");

		}else {
			System.out.println(c + " c is largest");
			
		}
	}

}
