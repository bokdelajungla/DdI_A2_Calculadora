package requerimiento1.vista;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import requerimiento1.controlador.GestorOperaciones;

public class VentanaPrincipal extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JLabel operando1L, operando2L, resultadoTextoL, resultadoL;
	private JTextField operando1TF, operando2TF;
	private JButton botonSuma, botonResta, botonMult, botonDiv, botonRaiz2, botonRaiz3;
	
	public VentanaPrincipal() {
		//Propiedades de la ventana principal
		setSize(330,400);
		setLocationRelativeTo(null);//Centrada en la pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Salir de la aplicación al cerrar la ventana
		setResizable(false);
		setTitle("Calculadora");
		setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/calculadora.png"));//Cambiar el icono de la ventana
		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {

		//Labels
		operando1L = new JLabel("Número 1:");
		operando1L.setBounds(50,30,80,30);
		add(operando1L);
		operando2L = new JLabel("Número 2:");
		operando2L.setBounds(50,80,80,30);
		add(operando2L);
		resultadoTextoL = new JLabel("Resultado:");
		resultadoTextoL.setBounds(50,300,80,30);
		add(resultadoTextoL);
		resultadoL = new JLabel("");
		resultadoL.setBounds(150,300,150,30);
		add(resultadoL);
		
		//TextFields
		operando1TF = new JTextField();
		operando1TF.setBounds(150,30,120,30);
		add(operando1TF);
		operando2TF = new JTextField();
		operando2TF.setBounds(150,80,120,30);
		add(operando2TF);
		
		//Botones operaciones
		botonSuma = new JButton("Sumar");
		botonSuma.setBounds(50, 140, 100, 30);
		add(botonSuma);
		botonResta = new JButton("Restar");
		botonResta.setBounds(170, 140, 100, 30);
		add(botonResta);
		botonMult = new JButton("Multiplicar");
		botonMult.setBounds(50, 190, 100, 30);
		add(botonMult);
		botonDiv = new JButton("Dividir");
		botonDiv.setBounds(170, 190, 100, 30);
		add(botonDiv);
		botonRaiz2 = new JButton("Raiz 2");
		botonRaiz2.setBounds(50, 240, 100, 30);
		add(botonRaiz2);
		botonRaiz3 = new JButton("Raiz 3");
		botonRaiz3.setBounds(170, 240, 100, 30);
		add(botonRaiz3);
		
	}

	public void establecerListeners(GestorOperaciones gOp) {		
		//Botones operaciones
		botonSuma.addActionListener(gOp);
		botonResta.addActionListener(gOp);
		botonMult.addActionListener(gOp);
		botonDiv.addActionListener(gOp);
		botonRaiz2.addActionListener(gOp);
		botonRaiz3.addActionListener(gOp);
	}
	
	//Setters & Getters
	public JTextField getOperando1() {
		return operando1TF;
	}
	
	public JTextField getOperando2() {
		return operando2TF;
	}

	public void setResultado (double resultado){
		this.resultadoL.setText(Double.toString(resultado));
	}
	
	public void setResultado (String error) {
		this.resultadoL.setText(error);
	}
	
	public JButton getBotonSuma() {
		return botonSuma;
	}
	
	public JButton getBotonResta() {
		return botonResta;
	}
	
	public JButton getBotonMult() {
		return botonMult;
	}
	
	public JButton getBotonDiv() {
		return botonDiv;
	}
	
	public JButton getBotonRaiz2() {
		return botonRaiz2;
	}

	public JButton getBotonRaiz3() {
		return botonRaiz3;
	}
}

