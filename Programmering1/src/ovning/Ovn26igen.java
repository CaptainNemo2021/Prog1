package ovning;

import java.util.Scanner;

public class Ovn26igen {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange hela ditt namn med mellanslag");
		
		String namn=input.nextLine();
		
		int posMellan = namn.indexOf(' ');
		
		System.out.println(posMellan);
		
		String surnamn = namn.substring(0, posMellan);
		
		System.out.println(surnamn);
		
		String lastnamn=namn.substring(posMellan+1);
		
		System.out.println("förnamn: " +surnamn+ "\nefternamn: " +lastnamn);
	}

}
