package ovning;

import java.util.*;

public class Ovn72 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hur mycket bränsle har du finns i tanken?");
		int x = input.nextInt();
		
		if (x>10) {
		
			System.out.println("Kör vidare");
			
		}
		
		else {
			
			int y = 50 - x;
			int	z = (y*25);
			
			System.out.println("Du måste fylla på med "+ y + " liter, och det kostar " + z + " kr.");
		}
	}

}
