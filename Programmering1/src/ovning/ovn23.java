package ovning;

import java.util.Scanner;

public class ovn23 {
 
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange ålder");

		double ålder=input.nextDouble();

		double nästaålder = (int) (ålder/10);
		
		double nästaålder1 = ålder*10;
		
		System.out.println("Din ålder om 10 år är "+ nästaålder1);
		
}
}

/* int ålder = 41;
 * double deladMedTio = ålder/10.0
 * int nollasistEttTal = (int) deladMedTio*10;
 * int nollarNästa = nollasist+10;
 * int årKvar=nollarNästa-ålder;
 * System.out.println(nollarNästa+"år kvar"+årKvar);
 */