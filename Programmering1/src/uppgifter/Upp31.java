package uppgifter;

import java.util.Arrays;
import java.util.Scanner;

public class Upp31 {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	double [] i = new double[3];
	
	System.out.println("Ange temp1: ");
	i[0]=input.nextDouble();
	
	System.out.println("Ange temp2");
	i[1]=input.nextDouble();
	
	System.out.println("Ange temp3");
	i[2]=input.nextDouble();
	
	
	Double summa =  i[0]+i[1]+i[2];
	
	Double medel = (i[0]+i[1]+i[2])/i.length;
	
	
	System.out.println("Summan är: " + summa + " och medelvärdet är " + medel);

}
}