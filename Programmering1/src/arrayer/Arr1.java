package arrayer;

import java.util.Arrays;

public class Arr1 {
	public static void main(String[] args) {
		
		int [] i= new int [4]; //detta (  []  )betyder att det är en array. Skapar array samt 5 st positioner. Skapar referens till denna//
		
		int längd = i.length; //tar reda på längden på arrayen//
		
		//tilldelar värde till olika positioner i array//
		i[0]=4; 
		i[1]=7;
		i[2]=8;
		i[3]=1;
	
		System.out.println( i[0] +" "+ i[1] + " " + i[2] );
		System.out.println(Arrays.toString(i));
		
		for(int k=0; k<=3  ;k=k+1) {
		System.out.println(i[k]);
	}
	}
}
