package övninginförprov;

import java.util.Scanner;

public class Ovn3prov {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange ditt namn och efternamn med mellanslag");
		String namn = input.nextLine();
		
		char förstaBokstav = namn.charAt(0);
		int mellanslag = namn.indexOf(' ');
		char sistaBokstav = namn.charAt(mellanslag +1);
		
		System.out.println("Du heter " + namn + " och dina initaler är " +förstaBokstav + " " + sistaBokstav);
		
        
		
	}

}
