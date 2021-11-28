package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class JTexto extends JTextField {
	
	public JTexto() {
		super("");
		setBounds(10,10, 200, 80);
		setFont(new Font("Arial", Font.PLAIN, 20));
		setEditable(false);
	    setBackground(Color.decode("#f5feff"));
	}
	

}
