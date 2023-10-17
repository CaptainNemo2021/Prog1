package övninginförprov;

import java.util.Scanner;

public class Ovn1prov {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Skriv in ett tecken: ");
		
		String tecken= input.nextLine();
		
		char tal2 = tecken.charAt(0);
		
		int teckenKod = (char) tal2;
		
		System.out.println("Ditt tecken i siffror är: " + teckenKod);
		
		
		
	}

}
