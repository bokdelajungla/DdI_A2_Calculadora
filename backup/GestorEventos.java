package requerimiento2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import requerimiento2.vista.JVentana;

public class GestorEventos implements ActionListener {
	
	private JVentana ventana;
	
	public GestorEventos (JVentana ventana){
		this.ventana = ventana;
	}

	public void escribir (String num) {
		double num1=Double.parseDouble(ventana.getNum1());
		double num2=Double.parseDouble(ventana.getNum2());
		if(!ventana.isOperPulsada() && !ventana.isIgualPulsado()) {
			ventana.getNum1()+=num;
			txt.setText(num1);
		}else if (operPulsada&&!igualPulsado){
			num2+=num;
			txt.setText(num2);
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Numeros
		if(e.getSource()==ventana.getNumero()[0]) {
			if(!operPulsada&&!igualPulsado) {
				num1+="0";
				txt.setText(num1);
			}else if (operPulsada&&!igualPulsado){
				num2+="0";
				txt.setText(num2);
			}
		}
		if(e.getSource()==ventana.getNumero()[1]) {
			
		}
		if(e.getSource()==ventana.getNumero()[2]) {
			
		}
		if(e.getSource()==ventana.getNumero()[3]) {
			
		}
		if(e.getSource()==ventana.getNumero()[4]) {
			
		}
		if(e.getSource()==ventana.getNumero()[5]) {
			
		}
		if(e.getSource()==ventana.getNumero()[6]) {
			
		}
		if(e.getSource()==ventana.getNumero()[7]) {
			
		}
		if(e.getSource()==ventana.getNumero()[8]) {
			
		}
		if(e.getSource()==ventana.getNumero()[9]) {
			
		}
		//Coma
		if(e.getSource()==ventana.getBcoma()) {
			
		}
		//Suma
		if(e.getSource()==ventana.getBsuma()) {
			
		}
		//Resta
		if(e.getSource()==ventana.getBresta()) {
			
		}
		//Multiplicacion
		if(e.getSource()==ventana.getBmult()) {
			
		}
		//Division
		if(e.getSource()==ventana.getBdiv()) {
			
		}
		//Raiz 2
		if(e.getSource()==ventana.getBraiz()) {
			
		}
		//Raiz3
		if(e.getSource()==ventana.getBraiz3()) {
			
		}
		//Borrar
		if(e.getSource()==ventana.getBdel()) {
			
		}
		//Modo claro/oscuro
		if(e.getSource()==ventana.getBmode()) {
			
		}		
	}

}
