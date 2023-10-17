package ovning;

import java.util.Arrays;
import java.util.Scanner;

public class Ovn32 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] i = new int[3];
		
		System.out.println("Ange temp1: ");
		i[0]=input.nextInt();
		
		System.out.println("Ange temp2");
		i[1]=input.nextInt();
		
		System.out.println("Ange temp3");
		i[2]=input.nextInt();
		
		int temp= i[0]; //vi lagrar undan första värdet så man kan använda den senare//
		
		i[0] = i [2];
		i[2] =temp;
		
		System.out.println(Arrays.toString(i));
		
		
		
	}

}
