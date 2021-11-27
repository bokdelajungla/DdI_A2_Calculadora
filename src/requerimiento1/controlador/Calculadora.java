package requerimiento1.controlador;

import requerimiento1.vista.VentanaPrincipal;

public class Calculadora {
	
	public static void main(String[] args) {
		
		VentanaPrincipal v1 = new VentanaPrincipal();
		GestorOperaciones gOp = new GestorOperaciones(v1);
		v1.establecerListeners(gOp);
	}
}
