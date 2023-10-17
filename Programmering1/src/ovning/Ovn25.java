package ovning;

import java.util.Scanner;

public class Ovn25 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange ditt namn och efternamn"); 
		String namn=input.nextLine();

		
		char initial = namn.charAt(0);
		int mellanslag = namn.indexOf(' ');
		char någonting  = namn.charAt( mellanslag +1);
		
		
		System.out.println("Du heter "+namn + ". Dina initialer är: " + initial + " "+ någonting);
		
		
	}

}
