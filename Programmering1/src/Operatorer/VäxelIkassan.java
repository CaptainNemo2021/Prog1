package Operatorer;

public class VäxelIkassan {
	

	public static void main(String[] args) {
		
		int prisVara= 1000;
		int KundGer = 645;
		
		int skillnad = 1000 - 645;
		
		int hundratal = skillnad/100;
		
		int tiotal = skillnad%100 - skillnad%100/10;
		
		int ental = tiotal/10;
		
		
		System.out.println("Då varan kostar 1000 kr och du ger in 645kr får du tillbaka " + skillnad);
		System.out.println("Hundralappar: " + hundratal + " st");
		System.out.println("Tiotal, alltså sedlar och mynt i tiotal: " + tiotal +" kr");
		System.out.println("Mynt: " + ental +" kr");
		
		
		
	}

}
