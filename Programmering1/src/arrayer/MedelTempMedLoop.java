package arrayer;

import java.util.Arrays; 
import java.util.Scanner;


public class MedelTempMedLoop {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] i = new int[7];
		
		double summa = 0;
		for(int j = 0; j < i.length; j++) {
			
		System.out.println("Ange temperatur: ");
		i[j]=input.nextInt();
		summa=summa+i[j];
		}
		
		System.out.println(Arrays.toString(i));
		
		
		double medel = summa/i.length;
		
		System.out.println("Medelvärdet: " + medel);
		
		
	}

}


