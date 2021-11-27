package requerimiento1.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import requerimiento1.vista.VentanaPrincipal;

public class GestorOperaciones implements ActionListener{
	//Atributos
	private VentanaPrincipal ventana;
	private final String PASS = "please";//Valor de la contraseña
	
	//Constructor
	public GestorOperaciones (VentanaPrincipal ventana) {
		this.ventana = ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			//Si la primera casilla está vacía
			if(ventana.getOperando1().getText().equals("")) {
				JOptionPane.showMessageDialog(null,"La primera casilla está vacía. Introduce algún número", "¡¡ESPABILA!!", JOptionPane.ERROR_MESSAGE);
			}
			else {
				//Parseamos el primer operando
				Double a = Double.parseDouble(ventana.getOperando1().getText());
				Double b; //El b no lo parseamos aún porque para Raiz2 y Raiz 3 no lo necesitamos
				
				//Comprobamos el botón que ha disparado el evento
				if(e.getSource()==ventana.getBotonSuma()) {
					//Comprobamos si la segunda casilla está vacía
					if(ventana.getOperando2().getText().equals("")) {
						JOptionPane.showMessageDialog(null,"La segunda casilla está vacía. Introduce algún número para realizar esta operación", "¡¡ESPABILA!!", JOptionPane.ERROR_MESSAGE);	
					}
					else {
						//Parseamos el segundo operando y realizamos la operacion
						b = Double.parseDouble(ventana.getOperando2().getText());
						ventana.setResultado(a+b);
					}
				}
				else if(e.getSource()==ventana.getBotonResta()){
					if(ventana.getOperando2().getText().equals("")) {
						JOptionPane.showMessageDialog(null,"La segunda casilla está vacía. Introduce algún número para realizar esta operación", "¡¡ESPABILA!!", JOptionPane.ERROR_MESSAGE);	
					}
					else {
						b = Double.parseDouble(ventana.getOperando2().getText());
						ventana.setResultado(a-b);
					}
				}
				else if(e.getSource()==ventana.getBotonMult()){
					if(ventana.getOperando2().getText().equals("")) {
						JOptionPane.showMessageDialog(null,"La segunda casilla está vacía. Introduce algún número para realizar esta operación", "¡¡ESPABILA!!", JOptionPane.ERROR_MESSAGE);	
					}
					else {
					b = Double.parseDouble(ventana.getOperando2().getText());
					ventana.setResultado(a*b);
					}
				}
				else if(e.getSource()==ventana.getBotonDiv()){
					if(ventana.getOperando2().getText().equals("")) {
						JOptionPane.showMessageDialog(null,"La segunda casilla está vacía. Introduce algún número para realizar esta operación", "¡¡ESPABILA!!", JOptionPane.ERROR_MESSAGE);	
					}
					else {
						//Comprobamos si el divisor el cero
						b = Double.parseDouble(ventana.getOperando2().getText());
						if(b==0) {
							JOptionPane.showMessageDialog(null,"No se puede dividir por 0", "Hay que repasar esas mates...", JOptionPane.ERROR_MESSAGE);
						}
						else {
							ventana.setResultado(a/b);
						}
					}	
				}
				//Mostramos la ventana de informacion
				else if(e.getSource()==ventana.getBotonRaiz2()){
					JOptionPane.showMessageDialog(null,"Funcionalidad NO disponible :(", "Raiz Cuadrada", JOptionPane.INFORMATION_MESSAGE);
				}
				//Pedimos la contraseña
				else if(e.getSource()==ventana.getBotonRaiz3()){
					String password = JOptionPane.showInputDialog(null,"Contraseña");
					if(password.equals(PASS)) {
						b = 1D/3D; //Especificamos que sean double, si no emplearia int
						ventana.setResultado(Math.pow(a,b));
					}
					else {
						JOptionPane.showMessageDialog(null,"No has dicho la palabra mágica", "AH, AH, AH!", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		}catch(NullPointerException ex) {
			//Se dispara si se pulsa cancelar en la ventana de input, así que no hacemos nada y volvemos al programa
		}catch(NumberFormatException e2) {
			//Si no se introducen valores numéricos lanza esta excepción
			JOptionPane.showMessageDialog(null,"Los valores introducidos deben ser números", "¡¡¡ANIMAL!!!", JOptionPane.ERROR_MESSAGE);
		}finally {
			//Borramos el contenido de las cajas de texto
			//y hacemos focus a la primera
			ventana.getOperando1().setText(null);
			ventana.getOperando2().setText(null);
			ventana.getOperando1().requestFocus();
		}	
	}
}
