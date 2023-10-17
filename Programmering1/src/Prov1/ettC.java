package Prov1;

import java.util.Scanner;

public class ettC {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Mata in ett täljare: ");
		
		int täljare = input.nextInt();
		
		System.out.println("Mata in ett nämnare: ");
		
		int nämnare = input.nextInt();
		
		int x = täljare/nämnare;
		
		int y = täljare - x*nämnare;
		
		System.out.println("Ditt bråk är " + täljare + "/" + nämnare); 
		System.out.println("Sedan är ditt bråk i blandad form " + x + " och " + y + "/" + nämnare);
				
		
		
		
		
		
	}
}
