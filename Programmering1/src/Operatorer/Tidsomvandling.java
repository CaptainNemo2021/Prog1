package Operatorer;

public class Tidsomvandling {
	
	public static void main(String[] args) {
		
		int sekunderTot = 3666;
		
		int timmar = sekunderTot/3600;
		
		int restTimmar = sekunderTot-(timmar*3600); //blir i sekunder//

		int minuter = restTimmar/60;
		
		int sekunder = restTimmar%60;
	
		
		System.out.println("SekunderTot är: " + sekunderTot);
		System.out.println("Timmar är: " + timmar);
		System.out.println("Minuter är: " + minuter);
		System.out.println("Sekunder är: " + sekunder);
		
		
		
	}

}
