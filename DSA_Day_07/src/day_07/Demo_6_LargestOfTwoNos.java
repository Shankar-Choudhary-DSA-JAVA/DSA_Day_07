package day_07;

	
	class A{
		
		public int comparing() {
			
			int a=8;
			int b=90;
			
			if(a >b ) {
				System.out.println("a is greater than b");
			}else {
				System.out.println("b is greater than a");

			}
			return comparing();
		}
	}
	public class Demo_6_LargestOfTwoNos {


	public static void main(String[] args) {

		A  p = new A();
		p.comparing();
		
	}

}
