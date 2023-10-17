package övninginförprov;

import java.util.Scanner;

public class Ovn7prov {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange ett tecken");
		
		String tecken = input.nextLine();
		
		int tal = tecken.charAt(0);
		
		int tal2 = (int) tal;
		
		System.out.println("Ditt tal är: " + tal2);
		
		
	}
}
