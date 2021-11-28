package requerimiento2.vista;

import java.awt.Font;
import java.awt.Insets;
import java.awt.Color;

import javax.swing.JButton;

/**
 * Clase que implementa un botón de operación de la calculadora
 * Repositorio de la actividad: https://github.com/bokdelajungla/DdI_A2_Calculadora
 * 
 * @author Grupo 18
 * @version 1.0
 */
public class JBotonOperacion extends JButton{
	
	private static final long serialVersionUID = 1L;

	public JBotonOperacion(String value, int x, int y) {
		super(value);
		setBounds(x, y, 50, 50);
		setFont(new Font("Arial", Font.PLAIN, 15));
		setMargin(new Insets(0,0,0,0));
	    setOpaque(true);
	    claro();
	}
	
	/**
     * Método que cambia el color de fondo y texto para una GUI clara
     */
	public void claro() {
		setBackground(Color.decode("#e3dac5"));
		setForeground(Color.decode("#0040ff"));
	}
	
	/**
     * Método que cambia el color de fondo y texto para una GUI oscura
     */
	public void oscuro() {
		setBackground(Color.decode("#4a2e13"));
		setForeground(Color.WHITE);
	}
}
