package ovning;

import java.util.Scanner;
import java.util.Arrays;


public class Ovn31 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] i = new int [4];
		
		
		System.out.println("Ange nr1: ");
		i[0]=input.nextInt();
		
		System.out.println("Ange nr2: ");
		i[1]=input.nextInt();
		
		System.out.println("Ange nr3: ");
		i[2]=input.nextInt();
		
		System.out.println("Ange nr4: ");
		i[3]=input.nextInt();
		
		System.out.println(Arrays.toString(i));
		
		
	}

}
