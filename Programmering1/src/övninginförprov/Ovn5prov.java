package övninginförprov;

import java.util.Scanner;

public class Ovn5prov {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange ett tecken: ");
		
		String tecken = input.nextLine();
		
		int tal = tecken.charAt(0);
		
		int teckenKod = (int) tal;
		
		System.out.println("Ditt tecken är: " + teckenKod);
		
	
		
		
		
		
		
	}

}
