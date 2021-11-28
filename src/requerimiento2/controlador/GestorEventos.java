package requerimiento2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import requerimiento2.vista.JVentana;

/**
 * Clase que se encarga de gestionar todos los eventos relacionados con la calculadora
 * 
 * @author grupo 18
 */
public class GestorEventos implements ActionListener {
	
	private JVentana ventana;
	
	public GestorEventos (JVentana ventana){
		this.ventana = ventana;
	}

	/**
	 * Método que se encarga de concatenar el númeroo coma que se le pasa como argumento al
	 * texto de la caja de texto
	 * 
	 * @param num el elemento a concatenar.
	 */
	public void escribir (String num) {
		String num1 = ventana.getNum1();
		String num2 = ventana.getNum2();
		if(!ventana.isOperPulsada() && !ventana.isIgualPulsado()) {
			ventana.setNum1(num1+=num);
			ventana.setTxt(ventana.getNum1());
		}else if (ventana.isOperPulsada() && !ventana.isIgualPulsado()){
			ventana.setNum2(num2+=num);
			ventana.setTxt(ventana.getNum2());
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Numeros
		if(e.getSource()==ventana.getNumero()[0]) {
			escribir("0");
		}
		if(e.getSource()==ventana.getNumero()[1]) {
			escribir("1");
		}
		if(e.getSource()==ventana.getNumero()[2]) {
			escribir("2");
		}
		if(e.getSource()==ventana.getNumero()[3]) {
			escribir("3");
		}
		if(e.getSource()==ventana.getNumero()[4]) {
			escribir("4");
		}
		if(e.getSource()==ventana.getNumero()[5]) {
			escribir("5");
		}
		if(e.getSource()==ventana.getNumero()[6]) {
			escribir("6");
		}
		if(e.getSource()==ventana.getNumero()[7]) {
			escribir("7");
		}
		if(e.getSource()==ventana.getNumero()[8]) {
			escribir("8");
		}
		if(e.getSource()==ventana.getNumero()[9]) {
			escribir("9");
		}
		
		//Coma
		if(e.getSource()==ventana.getBcoma()) {
			if(!ventana.isOperPulsada()) {
				if(ventana.getContComas1() > 0) {
					JOptionPane.showMessageDialog(new JFrame(), "No puedes poner dos comas empanado!!",
							"Fatal Error", JOptionPane.ERROR_MESSAGE);
				} else {
					escribir(".");
					ventana.incComa1();
				}
			} else {
				if(ventana.getContComas2() > 0) {
					JOptionPane.showMessageDialog(new JFrame(), "No puedes poner dos comas empanado!!",
							"Fatal Error", JOptionPane.ERROR_MESSAGE);
				} else {
					escribir(".");
					ventana.incComa2();
				}
			}
		}
		
		//Suma
		if(e.getSource()==ventana.getBsuma()) {
			ventana.setIgualPulsado(false);
			ventana.setOper("+");
			ventana.setOperPulsada(true);
		}
		
		//Resta
		if(e.getSource()==ventana.getBresta()) {
			ventana.setIgualPulsado(false);
			ventana.setOper("-");
			ventana.setOperPulsada(true);
		}
		
		//Multiplicacion
		if(e.getSource()==ventana.getBmult()) {
			ventana.setIgualPulsado(false);
			ventana.setOper("*");
			ventana.setOperPulsada(true);
		}
		
		//Division
		if(e.getSource()==ventana.getBdiv()) {
			ventana.setIgualPulsado(false);
			ventana.setOper("/");
			ventana.setOperPulsada(true);
		}
		
		//Raiz 2
		if(e.getSource()==ventana.getBraiz()) {
			JOptionPane.showMessageDialog(new JFrame(), "Funcionalidad no disponible",
					"Raiz Cuadrada", JOptionPane.INFORMATION_MESSAGE);
		}
		
		//Raiz3
		if(e.getSource()==ventana.getBraiz3()) {
			if(!ventana.isPuedeOperar()) {
				String pass = JOptionPane.showInputDialog(new JFrame(), "Introduzca la contraseña:");
				if(pass == null) {
					JOptionPane.showMessageDialog(new JFrame(), "La contraseña es password",
							"Contraseña no introducida", JOptionPane.ERROR_MESSAGE);
					ventana.setPuedeOperar(false);
				} else if(pass.equals(ventana.getPASSWORD())) {
					JOptionPane.showMessageDialog(new JFrame(), "Ya puede usar esta funcionalidad",
								"Contraseña correcta", JOptionPane.INFORMATION_MESSAGE);
					ventana.setPuedeOperar(true);
				} else {
					JOptionPane.showMessageDialog(new JFrame(), "La contraseña es password",
							"Contraseña incorrecta", JOptionPane.ERROR_MESSAGE);
					ventana.setPuedeOperar(false);
				}
			} else {
				if(ventana.getNum1().equals("")) {
					JOptionPane.showMessageDialog(new JFrame(), "Falta el operando!!",
							"Number missing", JOptionPane.ERROR_MESSAGE);
				}
				ventana.setIgualPulsado(true);
				ventana.setRes(Math.cbrt(Double.parseDouble(ventana.getNum1())));
				ventana.setTxt(Double.toString(ventana.getRes()));
				ventana.reset();
			}
		}
		
		//Borrar
		if(e.getSource()==ventana.getBdel()) {
			ventana.reset();
			ventana.setIgualPulsado(false);
			ventana.setNum1("");
			ventana.setTxt("");
		}
		
		//Igual
		if(e.getSource()==ventana.getBequal()) {
			
			if(ventana.getNum1().equals("") || ventana.getNum2().equals("")) {
				JOptionPane.showMessageDialog(new JFrame(), "Falta un operando!!",
						"Number missing", JOptionPane.ERROR_MESSAGE);
			} else if(ventana.getOper().equals("")) {
				JOptionPane.showMessageDialog(new JFrame(), "Falta la operación!!",
						"Operator missing", JOptionPane.ERROR_MESSAGE);
			} else if(ventana.getOper().equals("+")) {
				ventana.setIgualPulsado(true);
				ventana.setRes(Double.parseDouble(ventana.getNum1()) + Double.parseDouble(ventana.getNum2()));
				ventana.reset();
			} else if(ventana.getOper().equals("-")) {
				ventana.setIgualPulsado(true);
				ventana.setRes(Double.parseDouble(ventana.getNum1()) - Double.parseDouble(ventana.getNum2()));
				ventana.reset();
			} else if(ventana.getOper().equals("*")) {
				ventana.setIgualPulsado(true);
				ventana.setRes(Double.parseDouble(ventana.getNum1()) * Double.parseDouble(ventana.getNum2()));
				ventana.reset();
			} else if(ventana.getOper().equals("/")) {			
				if(ventana.getNum2().equals("0")) {
					JOptionPane.showMessageDialog(new JFrame(), "No dividas entre cero!!!",
							"Division by zero", JOptionPane.ERROR_MESSAGE);
				} else {
					ventana.setIgualPulsado(true);
					ventana.setRes(Double.parseDouble(ventana.getNum1()) / Double.parseDouble(ventana.getNum2()));
					ventana.reset();
				}
			}
		}
		
		//Modo claro/oscuro
		if(e.getSource()==ventana.getBmode()) {
			int res = JOptionPane.showConfirmDialog(new JFrame(), "¿Desea cambiar de modo?"); 
			switch(res) {
				case JOptionPane.YES_OPTION: 
					ventana.changeMode();
					break;
				case JOptionPane.NO_OPTION: 
					break;
			     default:
			    	 break;
			}
		}		
	}

}
