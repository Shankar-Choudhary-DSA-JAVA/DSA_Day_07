package day_07;

import java.util.Scanner;

public class Demo_16_joinIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:-");
		int marks = sc.nextInt();
		 char grade; // we have to initialises the variables
		 String result;
		 
		 if(marks > 80) {
			 grade = 'A';
		 }
		 else if(marks > 60) {
			 grade = 'B';

		 }
		 else if(marks > 40) {
			 grade = 'C';

		 }else {
			 grade = 'F';
			// result = "fails";

		 }

           System.out.println("Grade is : " +grade);
        //   System.out.println("Results is : " +result);

	}

}
