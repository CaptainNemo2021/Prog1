package ovning;

import java.util.Scanner;

public class Ovn24 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange Tal 1");

		int Tal1=input.nextInt();
		
		
		System.out.println("ange Tal 2");

		int Tal2=input.nextInt();
		
		
		System.out.println("ange Tal 3");

		int Tal3=input.nextInt();
		

	    int summaålder = Tal1 + Tal2 + Tal3;
		
		double medelvärde = (Tal1 + Tal2 + Tal3)/3.0; 
		
		System.out.println("Summan av talen är "+ summaålder+ " och medelvärdet av talen är " +medelvärde);
	}

}
