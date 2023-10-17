package övninginförprov;

import java.util.Scanner;

public class Ovn4prov {
	
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Ange ditt namn och efternamn med mellanslag");
		
		String name = input.nextLine();
		
		char förstaBokstav = name.charAt(0);
		int mellanslag = name.indexOf(' ');
		char sistaBokstav = name.charAt(mellanslag +1);
		
		System.out.println("Du heter " + name + ". Dina initialer är även " + förstaBokstav + " " +sistaBokstav + ".");
		
		
	}

	
	
	

	
	}



