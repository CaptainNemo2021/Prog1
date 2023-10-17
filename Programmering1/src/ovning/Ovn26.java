package ovning;

import java.util.Scanner;

public class Ovn26 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange ditt föramn"); 
		
		String förnamn=input.nextLine();
		
		System.out.println("ange ditt efternamn");
		
		
		String efternamn=input.nextLine();
		
		System.out.println("Förnamn: "+ förnamn);
		System.out.println("Efternamn: "+ efternamn);

	}
}



