package Ifsatser;

import javax.swing.JOptionPane;

public class If1 {

	public static void main(String[] args) {
		
		String sÅlder = JOptionPane.showInputDialog("Ange din ålder: ");
		
		int ålder = Integer.parseInt(sÅlder);
		
		if (ålder >= 65) {
			
			JOptionPane.showMessageDialog(null, "Priset blir 20 kr");
		}
		
		
		else {
			
			JOptionPane.showMessageDialog(null, "Priset blir 10 kr");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
