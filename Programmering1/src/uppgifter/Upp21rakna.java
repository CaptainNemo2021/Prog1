package uppgifter;

import java.util.Scanner;

public class Upp21rakna {
	
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);

			System.out.println("ange bas");
			
			int b =input.nextInt();
			
			System.out.println("ange höjd");
			
			int h =input.nextInt();
			
			
			double x = (b*h)/2;
			
			System.out.println("Ditt tal i kvadrat är "+x);
	}

}
