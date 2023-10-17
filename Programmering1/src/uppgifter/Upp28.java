package uppgifter;

import java.util.Scanner;

public class Upp28 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("skriv in ett tecken (capital letter): ");
		
		String stortTecken=input.nextLine();
		
		char tal2 =  stortTecken.charAt(0); 
		
		int teckenKod = tal2 + 32;
		
		char t= (char) teckenKod;
		
		System.out.println(t);
		
		
	}

}
