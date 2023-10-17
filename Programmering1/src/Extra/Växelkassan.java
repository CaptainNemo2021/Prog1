package Extra;

import java.util.Scanner;

public class Växelkassan {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Hur mycket kostar varan?");
		int pris = input.nextInt();
		
		System.out.println("Hur mycket betalade du med?");
		int belopp = input.nextInt();
		
		int tillbaka = belopp - pris;
		
		int tusen = tillbaka/1000;
		int rest = tillbaka%1000;
		
		int femhundra = rest/500;
		    rest = rest%500;
		    
		int tvåhundra= rest/200;
			rest = rest%200;
		
		int hundra = rest/100;
			rest = rest%100;
			
		int femtio = rest/50;
			rest = rest%50;
		
		int tjugo = rest/20;
			rest = rest%20;
			
		int tiokrona = rest/10;
			rest = rest%10;
		
		int femkrona = rest/5;
			rest = rest%5;
			
		int tvåkrona = rest/2;
			rest = rest%2;
			
		int enkrona = rest/1;
		
		System.out.println("Kunden ska få: ");
		
		System.out.println("Tusenlappar: " + tusen);
		
		System.out.println("Femhundralappar: " + femhundra);
		
		System.out.println("Tvåhundralappar: " + tvåhundra);
		
		System.out.println("Hundralappar: " + hundra);
		
		System.out.println("Femtiolappar: " + femtio);
		
		System.out.println("Tjugolappar: " + tjugo);
		
		System.out.println("Tiokronor: " + tiokrona);
		
		System.out.println("Femkronor: " + femkrona);
		
		System.out.println("Tvåkrona: " + tvåkrona);
		
		System.out.println("Enkronor: " + enkrona);
	}

}
