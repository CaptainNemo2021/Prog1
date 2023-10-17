package Operatorer;

import java.util.Scanner;

public class abstraktVäxelKassa {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hur mycket kostar varan?");
		int prisVara = input.nextInt();
		
		System.out.println("Hur mycket betalade du med?");
		int KundGer = input.nextInt();
		
		int skillnad = KundGer - prisVara;
		
		int femhundralappar = skillnad/500; //antal femhundralappar//
		
		int hundralappar = skillnad%500 - skillnad%500/10;
		
		int femtiolappar = hundralappar%50;
		
		
		System.out.println(femhundralappar + " " + hundralappar+ " "+ femtiolappar );
		
		
		
		
		
	}

}
