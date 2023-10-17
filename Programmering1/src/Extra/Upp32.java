package Extra;

import java.util.Arrays;
import java.util.Scanner;


public class Upp32 {
	
	public static void main(String[] args) {
		
		int [] i = new int[4];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tal 1: ");
		i[0]=input.nextInt();
		
		System.out.println("Tal 2: ");
		i[1]=input.nextInt();
		
		System.out.println("Tal 3: ");
		i[2]=input.nextInt();
		
		System.out.println("Tal 4: ");
		i[3]=input.nextInt();
		
		
		
		int temp=  i[0]; //vi lagrar undan fyran så man kan använda den senare//
		int temp1= i[1];
		
		input.nextLine();
				
		System.out.println("Vill du ha talen i ordning eller inte? Svara ja eller nej!");
		String svar = input.nextLine();
		
		
		
		if (svar.equalsIgnoreCase("ja")){
			System.out.println(Arrays.toString(i));
		}
		
		else if (svar.equalsIgnoreCase("nej")){ 
			
		i[0]= i[3];	
		i[1]= i[2];
		i[2]=temp1;
		i[3]=temp;
		
		System.out.println(Arrays.toString(i));
		}
		
		else {
		System.out.println("Ogiligt svar, du måste svara ja eller nej!");
		
		
		
	


	}
}	
}
