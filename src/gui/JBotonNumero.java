package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class JBotonNumero extends JButton {

	public JBotonNumero(String value, int x, int y) {
		super(value);
		setBounds(x, y, 50, 50);
		setFont(new Font("Arial", Font.PLAIN, 30));
	    setOpaque(true);
	    setForeground(Color.decode("#0095ff"));
	    setBackground(Color.decode("#bffbff"));
	}
}
