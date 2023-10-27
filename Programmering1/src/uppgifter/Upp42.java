package uppgifter;

import java.util.*;

public class Upp42 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange ett heltal");
		int i = input.nextInt();
		
		int f = i;
		
		i = i+1;
		i = i*2;
		i = i-6;
		i = i/2;
		i = i+3;
		i = i-f;
		
		System.out.println("Detta är ditt nya tal: " +i);
		
		

		
		
		
	}

}
