package övninginförprov;

import java.util.Scanner;

public class Ovn6prov {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange en siffra");
		
		int siffra = input.nextInt();
		
		char tecken = (char) siffra;
		
		System.out.println("Ditt tecken är: " + tecken);
		
	}

}
