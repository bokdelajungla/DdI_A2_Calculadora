package requerimiento2.vista;

import javax.swing.JFrame;
import java.awt.Color;

import requerimiento2.controlador.GestorEventos;

/**
 * Clase que implementa el display de una calculadora
 * Repositorio de la actividad: https://github.com/bokdelajungla/DdI_A2_Calculadora
 * @author Grupo 18
 * @version 1.0
 */
public class JVentana extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JTexto txt;
	private String oper;
	private String num1, num2;
	private double res;
	private boolean operPulsada;
	private boolean igualPulsado=false;
	private boolean puedeOperar;
	private boolean esOscuro;
	private int contComas1, contComas2;
	private String pass;
	private final String PASSWORD = "password";
	private JBotonNumero[] numero = new JBotonNumero[10];
	private JBotonOperacion bdel, bsuma, bresta, bmult, bdiv, braiz, braiz3, bcoma, bequal, bmode;
	
	public JVentana() {
		super("Calculadora");
		this.setBounds(200, 200, 235, 395);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initComponentes();
		
		getContentPane().setBackground(Color.decode("#bfbfbf"));
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}
	
	private void initComponentes() {
		res = 0;
		contComas1 = 0;
		contComas2 = 0;
		num1 = "";
		num2 = "";
		oper = "";
		pass = "";
		operPulsada = false;
		puedeOperar = false;
		esOscuro = false;
		
		txt = new JTexto();
		add(txt);
		
		numero[0] = new JBotonNumero("0", 10, 250);
		numero[1] = new JBotonNumero("1", 10, 100);
		numero[2] = new JBotonNumero("2", 60, 100);
		numero[3] = new JBotonNumero("3", 110, 100);
		numero[4] = new JBotonNumero("4", 10, 150);
		numero[5] = new JBotonNumero("5", 60, 150);
		numero[6] = new JBotonNumero("6", 110, 150);
		numero[7] = new JBotonNumero("7", 10, 200);
		numero[8] = new JBotonNumero("8", 60, 200);
		numero[9] = new JBotonNumero("9", 110, 200);
		
		for (int i = 0; i < numero.length; i++) {
			add(numero[i]);
		}
		
		bdel = new JBotonOperacion("ce", 160, 100); 
		bsuma = new JBotonOperacion("+", 160, 150);
		bresta = new JBotonOperacion("-", 160, 200);
		bmult = new JBotonOperacion("x", 160, 250);
		bdiv = new JBotonOperacion("÷", 160, 300);
		braiz = new JBotonOperacion("√", 60, 250);
		braiz3 = new JBotonOperacion("3√", 110, 250);
		bcoma = new JBotonOperacion(",", 60, 300);
		bequal = new JBotonOperacion("=", 110, 300);
		bmode = new JBotonOperacion("mod", 10, 300);
		
		add(bdel);
		add(bsuma);
		add(bresta);
		add(bmult);
		add(bdiv);
		add(braiz);
		add(braiz3);
		add(bcoma);
		add(bequal);
		add(bmode);
	}
	
	public void initEventos(GestorEventos gestor) {

		numero[0].addActionListener(gestor);
		numero[1].addActionListener(gestor);
		numero[2].addActionListener(gestor);
		numero[3].addActionListener(gestor);
		numero[4].addActionListener(gestor);
		numero[5].addActionListener(gestor);
		numero[6].addActionListener(gestor);
		numero[7].addActionListener(gestor);
		numero[8].addActionListener(gestor);
		numero[9].addActionListener(gestor);
		bdel.addActionListener(gestor);
		bsuma.addActionListener(gestor);
		bresta.addActionListener(gestor);
		bmult.addActionListener(gestor);
		bdiv.addActionListener(gestor);
		braiz.addActionListener(gestor);
		braiz3.addActionListener(gestor);
		bcoma.addActionListener(gestor);
		bequal.addActionListener(gestor);
		bmode.addActionListener(gestor);
	
	}


	public void reset() {
		operPulsada = false;
		num1 = Double.toString(res);
		txt.setText(num1);
		num2 = "";
		oper = "";
		contComas1 = 0;
		contComas2 = 0;
	}
	
	/**
	 * Cambia entre modo claro/oscuro
	 */
	public void changeMode() {
		if (esOscuro) {
			getContentPane().setBackground(Color.decode("#bfbfbf"));
			txt.claro();
			for(int i = 0; i < numero.length; i++) {
				numero[i].claro();
			}
			bdel.claro();
			bsuma.claro();
			bresta.claro();
			bmult.claro();
			bdiv.claro();
			braiz.claro();
			braiz3.claro();
			bcoma.claro();
			bequal.claro();
			bmode.claro();
			esOscuro = false;
		} else {
			getContentPane().setBackground(Color.decode("#4a4a4a"));
			txt.oscuro();
			for(int i = 0; i < numero.length; i++) {
				numero[i].oscuro();
			}
			bdel.oscuro();
			bsuma.oscuro();
			bresta.oscuro();
			bmult.oscuro();
			bdiv.oscuro();
			braiz.oscuro();
			braiz3.oscuro();
			bcoma.oscuro();
			bequal.oscuro();
			bmode.oscuro();
			esOscuro = true;
		}
	}
	
	//Getters
	public JBotonNumero[] getNumero() {
		return numero;
	}

	public JBotonOperacion getBdel() {
		return bdel;
	}

	public JBotonOperacion getBsuma() {
		return bsuma;
	}

	public JBotonOperacion getBresta() {
		return bresta;
	}

	public JBotonOperacion getBmult() {
		return bmult;
	}

	public JBotonOperacion getBdiv() {
		return bdiv;
	}

	public JBotonOperacion getBraiz() {
		return braiz;
	}

	public JBotonOperacion getBraiz3() {
		return braiz3;
	}

	public JBotonOperacion getBcoma() {
		return bcoma;
	}

	public JBotonOperacion getBequal() {
		return bequal;
	}

	public JBotonOperacion getBmode() {
		return bmode;
	}

	
	public JTexto getTxt() {
		return txt;
	}

	public String getNum1() {
		return num1;
	}
	public void setNum1(String valor) {
		this.num1=valor;
	}
	
	public String getNum2() {
		return num2;
	}
	public void setNum2(String valor) {
		this.num2=valor;
	}
	public double getRes() {
		return res;
	}

	public boolean isOperPulsada() {
		return operPulsada;
	}

	public boolean isIgualPulsado() {
		return igualPulsado;
	}

	public boolean isPuedeOperar() {
		return puedeOperar;
	}

	public String getPass() {
		return pass;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public int getContComas1() {
		return contComas1;
	}

	public int getContComas2() {
		return contComas2;
	}
	public void incComa1() {
		contComas1++;
	}
	public void incComa2() {
		contComas2++;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public void setOperPulsada(boolean operPulsada) {
		this.operPulsada = operPulsada;
	}

	public void setIgualPulsado(boolean igualPulsado) {
		this.igualPulsado = igualPulsado;
	}

	public void setPuedeOperar(boolean puedeOperar) {
		this.puedeOperar = puedeOperar;
	}

	public void setRes(double res) {
		this.res = res;
	}

	public void setTxt(String txt) {
		this.txt.setText(txt);
	}

	public String getOper() {
		return oper;
	}
	 
	
	
}
