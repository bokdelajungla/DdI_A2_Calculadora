package requerimiento2.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import requerimiento2.controlador.GestorOperaciones;

public class VentanaPrincipal extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private int width,height;
	private Color colorFondo;
	
	private JLabel fondo;
	private Font fuenteTexto;
	private JLabel operando1L, operando2L, resultadoTextoL, resultadoL;
	private JTextField operando1TF, operando2TF;
	private JButton botonSuma, botonResta, botonMult, botonDiv, botonRaiz2, botonRaiz3;
	
	
	public VentanaPrincipal() {
		//Propiedades de la ventana principal
		width=330;
		height=400;
		setSize(width,height);
		colorFondo = new Color(2,93,88);
		setLocationRelativeTo(null);//Centrada en la pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Salir de la aplicación al cerrar la ventana
		setResizable(false);
		setTitle("Calculadora");
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/calculadora.png"));//Cambiamos el icono de la ventana
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {
		//Fondo
		getContentPane().setBackground(colorFondo);//En caso de que la imagen no se cargara
		//fondo = new JLabel(new ImageIcon("img/fondoCalculadora.png"));//Reescalado extraño
		Image img = new ImageIcon("img/fondoCalculadora.png").getImage();
		fondo = new JLabel(new ImageIcon(img.getScaledInstance(314, 362, Image.SCALE_SMOOTH)));
		setContentPane(fondo);//Pierde resolucion :/
		
		//Fuente
		try {
			fuenteTexto = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("ITCKRIST.ttf"));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Labels
		operando1L = new JLabel("Número 1:");
		operando1L.setBounds(50,30,80,30);
		operando1L.setFont(fuenteTexto.deriveFont(Font.PLAIN, 15f));
		operando1L.setForeground(Color.WHITE);
		add(operando1L);
		
		operando2L = new JLabel("Número 2:");
		operando2L.setBounds(50,80,80,30);
		operando2L.setFont(fuenteTexto.deriveFont(Font.PLAIN, 15f));
		operando2L.setForeground(Color.WHITE);
		add(operando2L);
		
		resultadoTextoL = new JLabel("Resultado:");
		resultadoTextoL.setBounds(50,300,80,30);
		resultadoTextoL.setFont(fuenteTexto.deriveFont(Font.PLAIN, 15f));
		resultadoTextoL.setForeground(Color.WHITE);
		add(resultadoTextoL);
		
		resultadoL = new JLabel("");
		resultadoL.setBounds(150,300,150,30);
		resultadoL.setFont(fuenteTexto.deriveFont(Font.PLAIN, 15f));
		resultadoL.setForeground(Color.WHITE);
		add(resultadoL);
		
		//TextFields
		operando1TF = new JTextField();
		operando1TF.setBounds(150,30,120,30);
		operando1TF.setFont(fuenteTexto.deriveFont(Font.PLAIN, 15f));
		operando1TF.setBackground(colorFondo);
		operando1TF.setForeground(Color.WHITE);
		add(operando1TF);
		
		operando2TF = new JTextField();
		operando2TF.setBounds(150,80,120,30);
		operando2TF.setFont(fuenteTexto.deriveFont(Font.PLAIN, 15f));
		operando2TF.setBackground(colorFondo);
		operando2TF.setForeground(Color.WHITE);
		add(operando2TF);
		
		//Botones operaciones
		botonSuma = new JButton("Sumar");
		botonSuma.setBounds(50, 140, 100, 30);
		botonSuma.setFont(fuenteTexto.deriveFont(Font.PLAIN, 15f));
		botonSuma.setBackground(Color.WHITE);
		botonSuma.setForeground(colorFondo);
		add(botonSuma);
		
		botonResta = new JButton("Restar");
		botonResta.setBounds(170, 140, 100, 30);
		botonResta.setFont(fuenteTexto.deriveFont(Font.PLAIN, 15f));
		botonResta.setBackground(Color.WHITE);
		botonResta.setForeground(colorFondo);
		add(botonResta);
		
		botonMult = new JButton("Multiplicar");
		botonMult.setBounds(50, 190, 100, 30);
		botonMult.setFont(fuenteTexto.deriveFont(Font.PLAIN, 15f));
		botonMult.setBackground(Color.WHITE);
		botonMult.setForeground(colorFondo);
		botonMult.setMargin(new Insets(0,0,0,0));//Eliminamos espacio vacío para que entre la palabra
		add(botonMult);
		
		botonDiv = new JButton("Dividir");
		botonDiv.setBounds(170, 190, 100, 30);
		botonDiv.setFont(fuenteTexto.deriveFont(Font.PLAIN, 15f));
		botonDiv.setBackground(Color.WHITE);
		botonDiv.setForeground(colorFondo);
		add(botonDiv);
		
		botonRaiz2 = new JButton("Raiz 2");
		botonRaiz2.setBounds(50, 240, 100, 30);
		botonRaiz2.setFont(fuenteTexto.deriveFont(Font.PLAIN, 15f));
		botonRaiz2.setBackground(Color.WHITE);
		botonRaiz2.setForeground(colorFondo);
		add(botonRaiz2);
		
		botonRaiz3 = new JButton("Raiz 3");
		botonRaiz3.setBounds(170, 240, 100, 30);
		botonRaiz3.setFont(fuenteTexto.deriveFont(Font.PLAIN, 15f));
		botonRaiz3.setBackground(Color.WHITE);
		botonRaiz3.setForeground(colorFondo);
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

