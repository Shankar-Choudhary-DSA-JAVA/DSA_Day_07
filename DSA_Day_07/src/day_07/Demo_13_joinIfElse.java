package day_07;

public class Demo_13_joinIfElse {

	public static void main(String[] args) {

		//NOT !
		
		//boolean isRainy = true; // we assume there is no rains
		boolean isRainy = false; // we assume there is no rains

		
		if (isRainy) {  // true
			System.out.println("Lets go out"); //false
		}else {
			System.out.println("Lets hides"); // true

		}
		if(! (isRainy))
		{
			System.out.println("its no raining"); // true

		}
	}

}
