package Prov1;

import java.util.Scanner;

public class tvåE {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in en mening ");
		
		String mening = input.nextLine();
		
		int mellanslag = mening.indexOf(' ');
		
		String förstaOrdet = mening.substring(0, mellanslag);
		
		int längd = mening.length();
		
		System.out.println("Ditt första ord : " + förstaOrdet);
		System.out.println("Meningen är: " + längd + " tecken");
		
		
	}

}
