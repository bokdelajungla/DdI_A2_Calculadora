package requerimiento2.vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class JTexto extends JTextField {

	private static final long serialVersionUID = 1L;

	public JTexto() {
		super("");
		setBounds(10,10, 200, 80);
		setFont(new Font("Arial", Font.PLAIN, 20));
		setEditable(false);
	    claro();
	}
	
	/**
     * Método que cambia el color de fondo y texto para una GUI clara
     */
	public void claro() {
		setBackground(Color.decode("#f2efe6"));
		setForeground(Color.BLACK);
	}
	
	/**
     * Método que cambia el color de fondo y texto para una GUI oscura
     */
	public void oscuro() {
		setBackground(Color.decode("#303030"));
		setForeground(Color.decode("#ebebeb"));
	}

}
