package Grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


//import java.awt.*; 
//import javax.swing.*;
//Detta betyder att man imprterar alla saker men programmet väljer bort det som inte behövs //

public class HelloWorld extends JFrame{
	
	JLabel text= new JLabel("Hello World");
	JButton knapp = new JButton("change text");
	
	
	public HelloWorld() {   //kallas constructor//
		// TODO Auto-generated constructor stub
		
		this.setVisible(true);
		this.setSize(new Dimension(500,500));
		this.setLayout(new FlowLayout());
		this.add(text);
		this.add(knapp);
		
		knapp.addActionListener(e->{
			text.setText("ny text");
		});
		
	}

	
	
	
	
	public static void main(String[] args) {
		
		new HelloWorld();
		
		
	}

}
