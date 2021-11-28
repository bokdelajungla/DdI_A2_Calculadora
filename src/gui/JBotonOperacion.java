package gui;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

public class JBotonOperacion extends JButton{
	
	public JBotonOperacion(String value, int x, int y) {
		super(value);
		setBounds(x, y, 50, 50);
		setFont(new Font("Arial", Font.PLAIN, 30));
	    setOpaque(true);
	    claro();
	}
	
	public void claro() {
		setBackground(Color.decode("#bffbff"));
		setForeground(Color.decode("#0040ff"));
	}
	
	public void oscuro() {
		setBackground(Color.decode("#4a4a4a"));
		setForeground(Color.BLACK);
	}
}
