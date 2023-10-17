package ovning;

public class var2 {
	
	public static void main(String[] args) {
	
			String namn = "Daniel ";
			
			String ennamn= "Andersson";
			
			String total= namn +ennamn;
			
			char förstaB = namn.charAt(1); //bokstav på egen namngiven position
			
			String delAv= namn.substring(2); //plockar ut bokstäver 
			
			int i = namn.length(); //säger längden på ordet
			
			int a = namn.indexOf('a'); //för att få reda på positioner på ord
			
			System.out.println(total+ " "+ förstaB+ " "+ delAv);
					
			
		
	}

}
