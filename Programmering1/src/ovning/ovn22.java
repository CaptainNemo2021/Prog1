package ovning;

import java.util.Scanner;

public class ovn22 {
 
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.println("ange tal");

		int a=input.nextInt();

		double svar = Math.pow(a, 2);
		
		System.out.println("Ditt tal i kvadrat är "+ svar);
		
	
}
}

//Man kan även göra som det står nedan//

/* Scanner input = new Scanner(System.in);

System.out.println("ange tal");

int a=input.nextInt();

int svar = a*a;
System.out.println("Ditt tal i kvadrat är "+ svar);
*/