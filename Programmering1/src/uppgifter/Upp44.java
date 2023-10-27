package uppgifter;

import java.util.*;

public class Upp44 {
	
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Ange ett tusental");
			int i = input.nextInt();
			
			int f = i;
			
			int x =  (i + 500)/1000;
			
			int z = x*1000;
			
			System.out.println("Ditt tal " + f + " avrundat är: " + z );
		
	}

}
