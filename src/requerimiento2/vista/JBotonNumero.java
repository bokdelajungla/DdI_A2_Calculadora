package requerimiento2.vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

/**
 * Clase que implementa un botón numérico de la calculadora
 * Repositorio de la actividad: https://github.com/bokdelajungla/DdI_A2_Calculadora
 * 
 * @author Grupo 18
 * @version 1.0
 */
public class JBotonNumero extends JButton {

	private static final long serialVersionUID = 1L;

	public JBotonNumero(String value, int x, int y) {
		super(value);
		setBounds(x, y, 50, 50);
		setFont(new Font("Arial", Font.PLAIN, 15));
	    setOpaque(true);
	    claro();
	}
	
	/**
     * Método que cambia el color de fondo y texto para una GUI clara
     */
	public void claro() {
		setBackground(Color.decode("#f2efe6"));
		setForeground(Color.decode("#0095ff"));
	}
	
	/**
     * Método que cambia el color de fondo y texto para una GUI oscura
     */
	public void oscuro() {
		setBackground(Color.decode("#303030"));
		setForeground(Color.decode("#f2f2f2"));
	}
}
