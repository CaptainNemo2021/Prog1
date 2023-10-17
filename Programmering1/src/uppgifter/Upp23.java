package uppgifter;

import java.util.Scanner;

public class Upp23 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange ett substantiv: ");
		
		String a =input.nextLine();
		
		System.out.println("Ange ändelsen på substantivet som du skrev in: ");
		
		String b =input.nextLine();
		
		System.out.println("En "+a+ ", flera " +a+b);


		
	}

}
