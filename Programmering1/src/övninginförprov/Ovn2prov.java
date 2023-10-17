package övninginförprov;

import java.util.Scanner;

public class Ovn2prov {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Ange ett tal: ");
		
		int tal = input.nextInt();
		
		char tecken = (char) tal;
		
		System.out.println("Talet är: " + tecken);
		
	}

}
