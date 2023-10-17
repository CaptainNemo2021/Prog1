package arrayer;

import java.util.Scanner;

public class MedelTem {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] i = new int[5];
		
		System.out.println("Ange temperatur ett");
		i[0]=input.nextInt();
		
		System.out.println("Ange temperaturen två");
		i[1]=input.nextInt();
		
		System.out.println("Ange temperaturen tre");
		i[2]=input.nextInt();
		
		double medel = (i[0]+i[1]+i[2])/3.0;
		
		System.out.println("Medelvärdet: " + medel);
		
		
	}

}
