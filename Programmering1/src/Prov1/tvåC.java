package Prov1;

import java.util.Scanner;

public class tvåC {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in din mailadress: ");
		
		String mening = input.nextLine();
		
		int punkt = mening.indexOf('.');
		int snabelA = mening.indexOf('@');
		
		String domän = mening.substring(snabelA, punkt);
		String förnamn= mening.substring(0, punkt);
		String efternamn= mening.substring(punkt, snabelA);
		
		System.out.println("Domän: " + domän);
		System.out.println("Förnamn: " + förnamn);
		System.out.println("Efternamn: " + efternamn);
		
		
	}

}
