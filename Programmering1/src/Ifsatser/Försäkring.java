package Ifsatser;

import javax.swing.JOptionPane;

public class Försäkring {
	
	public static void main(String[] args) {
		
	String sÅlder = JOptionPane.showInputDialog("Hur gammal är bilen: ");
		
		int ålder = Integer.parseInt(sÅlder);
		
		if(ålder >= 10) {
			
			JOptionPane.showMessageDialog(null, "Trafikförsäkring");
			
		}
		
		else if(ålder >= 6 && ålder<=9){
			
			JOptionPane.showMessageDialog(null, "halvförsäkring");
			
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Helförsäkring");
		}
}
}