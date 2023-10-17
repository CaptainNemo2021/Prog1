package ovning;

import java.util.Scanner;

public class ScannerTest {
public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("ange namn"); // Skriver "ange namn"
		
		String namn=input.nextLine(); // läser in text 
		
		System.out.println("ange ålder");
		
		int ålder=input.nextInt(); // läser in ett heltalsnummer
		
		System.out.println("Hej "+namn+ ". Jag ser att du är "+ålder+ " år gammal.");
		
		
	}

}
