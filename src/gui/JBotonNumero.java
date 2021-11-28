package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

/**
 * 
 * @author grupo 18
 *
 */
public class JBotonNumero extends JButton {

	public JBotonNumero(String value, int x, int y) {
		super(value);
		setBounds(x, y, 50, 50);
		setFont(new Font("Arial", Font.PLAIN, 30));
	    setOpaque(true);
	    claro();
	}
	
	public void claro() {
		setBackground(Color.decode("#bffbff"));
		setForeground(Color.decode("#0095ff"));
	}
	
	public void oscuro() {
		setBackground(Color.decode("#4a4a4a"));
		setForeground(Color.decode("#333333"));
	}
}
