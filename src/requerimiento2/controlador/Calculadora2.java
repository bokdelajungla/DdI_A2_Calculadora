package requerimiento2.controlador;

import requerimiento2.vista.VentanaPrincipal;

public class Calculadora2 {
	
	public static void main(String[] args) {
		
		VentanaPrincipal v1 = new VentanaPrincipal();
		GestorOperaciones gOp = new GestorOperaciones(v1);
		v1.establecerListeners(gOp);
	}
}
