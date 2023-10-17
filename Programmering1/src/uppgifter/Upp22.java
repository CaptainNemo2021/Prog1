package uppgifter;

import java.util.Scanner;

public class Upp22 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("ange ett ord på svenska");
		
		String a =input.nextLine();
		
		System.out.println("ange den engelska översättningen på ordet");
		
		String b =input.nextLine();
		
		
		System.out.println(a+ " heter \""+b+"\" på engelska");
		
		
		
	}
}
