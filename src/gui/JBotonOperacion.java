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
	    setForeground(Color.decode("#0040ff"));
	    setBackground(Color.decode("#bffbff"));
        
	}
}
