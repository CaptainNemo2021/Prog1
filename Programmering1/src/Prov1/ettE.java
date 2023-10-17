package Prov1;

import java.util.Scanner;

public class ettE {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange första sidan i cm: ");
		
		int sida = input.nextInt();
		
		System.out.println("Ange andra sidan i cm: ");
		
		int sida1 = input.nextInt();
		
		int area = sida*sida1;
		
		System.out.println("Sida 1 är: " + sida + " cm.\n" + "Sida 2 är: " + sida1 + "cm. Arean är: " + area);
		
		
		
	}

}
