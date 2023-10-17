package uppgifter;

import java.util.Scanner;

public class Upp27 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("skriv in ett tecken: ");
		
		String tecken=input.nextLine();
		
		char tal2 =  tecken.charAt(0); 
		
		int teckenKod = tal2;
		
		System.out.println(teckenKod);
	}

}
