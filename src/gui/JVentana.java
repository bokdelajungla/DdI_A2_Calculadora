package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JVentana extends JFrame {
	
	private JTexto txt;
	private String oper;
	private String num1, num2;
	private double res;
	private boolean operPulsada;
	private boolean puedeOperar;
	private boolean esOscuro;
	private int contComas1, contComas2;
	private String pass;
	private final String PASSWORD = "password";
	private JBotonNumero[] numero = new JBotonNumero[10];
	private JBotonOperacion bdel, bsuma, bresta, bmult, bdiv, braiz, braiz3, bcoma, bequal, bmode;
	
	public JVentana() {
		super("Calculadora");
		this.setBounds(200, 200, 220, 380);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initComponentes();
		initEventos();
		
		getContentPane().setBackground(Color.decode("#bffbff"));
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
		braiz3 = new JBotonOperacion("∛", 110, 250);
		bcoma = new JBotonOperacion(",", 60, 300);
		bequal = new JBotonOperacion("=", 110, 300);
		bmode = new JBotonOperacion("❐", 10, 300);
		
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
	
	private void initEventos() {
		ActionListener ev0 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!operPulsada) {
					num1+="0";
					txt.setText(num1);
				} else {
					num2+="0";
					txt.setText(num2);
				}
			}
		};
		ActionListener ev1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!operPulsada) {
					num1+="1";
					txt.setText(num1);
				} else {
					num2+="1";
					txt.setText(num2);
				}
			}
		};
		ActionListener ev2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!operPulsada) {
					num1+="2";
					txt.setText(num1);
				} else {
					num2+="2";
					txt.setText(num2);
				}
			}
		};
		ActionListener ev3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!operPulsada) {
					num1+="3";
					txt.setText(num1);
				} else {
					num2+="3";
					txt.setText(num2);
				}
			}
		};
		ActionListener ev4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!operPulsada) {
					num1+="4";
					txt.setText(num1);
				} else {
					num2+="4";
					txt.setText(num2);
				}
			}
		};
		ActionListener ev5 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!operPulsada) {
					num1+="5";
					txt.setText(num1);
				} else {
					num2+="5";
					txt.setText(num2);
				}
			}
		};
		ActionListener ev6 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!operPulsada) {
					num1+="6";
					txt.setText(num1);
				} else {
					num2+="6";
					txt.setText(num2);
				}
			}
		};
		ActionListener ev7 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!operPulsada) {
					num1+="7";
					txt.setText(num1);
				} else {
					num2+="7";
					txt.setText(num2);
				}
			}
		};
		ActionListener ev8 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!operPulsada) {
					num1+="8";
					txt.setText(num1);
				} else {
					num2+="8";
					txt.setText(num2);
				}
			}
		};
		ActionListener ev9 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!operPulsada) {
					num1+="9";
					txt.setText(num1);
				} else {
					num2+="9";
					txt.setText(num2);
				}
			}
		};
		
		numero[0].addActionListener(ev0);
		numero[1].addActionListener(ev1);
		numero[2].addActionListener(ev2);
		numero[3].addActionListener(ev3);
		numero[4].addActionListener(ev4);
		numero[5].addActionListener(ev5);
		numero[6].addActionListener(ev6);
		numero[7].addActionListener(ev7);
		numero[8].addActionListener(ev8);
		numero[9].addActionListener(ev9);
		
		ActionListener suma = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				oper="+";
				operPulsada = true;
			}
		};
		bsuma.addActionListener(suma);
		
		ActionListener resta = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				oper="-";
				operPulsada = true;
			}
		};
		bresta.addActionListener(resta);
		
		ActionListener mult = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				oper="*";
				operPulsada = true;
			}
		};
		bmult.addActionListener(mult);
		
		ActionListener div = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				oper="/";
				operPulsada = true;
			}
		};
		bdiv.addActionListener(div);
		

		ActionListener coma = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!operPulsada) {
					if(contComas1 > 0) {
						JOptionPane.showMessageDialog(new JFrame(), "No puedes poner dos comas empanado!!",
								"Fatal Error", JOptionPane.ERROR_MESSAGE);
					} else {
						num1+=".";
						contComas1++;
						txt.setText(num1);
					}
				} else {
					if(contComas2 > 0) {
						JOptionPane.showMessageDialog(new JFrame(), "No puedes poner dos comas empanado!!",
								"Fatal Error", JOptionPane.ERROR_MESSAGE);
					} else {
						num2+=".";
						contComas2++;
						txt.setText(num2);
					}
				}
			}
		};
		bcoma.addActionListener(coma);
		
		ActionListener del = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				reset();
				num1 = "";
				txt.setText(num1);
			}
		};
		bdel.addActionListener(del);
		
		ActionListener raiz = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JFrame(), "Funcionalidad no disponible",
						"Raiz Cuadrada", JOptionPane.INFORMATION_MESSAGE);
			} 
		};
		braiz.addActionListener(raiz);
		
		ActionListener raiz3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!puedeOperar) {
					pass = JOptionPane.showInputDialog(new JFrame(), "Introduzca la contraseña:");
					if(pass == null) {
						JOptionPane.showMessageDialog(new JFrame(), "La contraseña es password",
								"Contraseña no introducida", JOptionPane.ERROR_MESSAGE);
						puedeOperar = false;
					} else if(pass.equals(PASSWORD)) {
						JOptionPane.showMessageDialog(new JFrame(), "Ya puede usar esta funcionalidad",
									"Contraseña correcta", JOptionPane.INFORMATION_MESSAGE);
						puedeOperar = true;
					} else {
						JOptionPane.showMessageDialog(new JFrame(), "La contraseña es password",
								"Contraseña incorrecta", JOptionPane.ERROR_MESSAGE);
						puedeOperar = false;
					}
				} else {
					if(num1.equals("")) {
						JOptionPane.showMessageDialog(new JFrame(), "Falta el operando!!",
								"Number missing", JOptionPane.ERROR_MESSAGE);
					}
					res = Math.cbrt(Double.parseDouble(num1));
					txt.setText(Double.toString(res));
					reset();
				}
			}
		};
		braiz3.addActionListener(raiz3);

		ActionListener igual = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(num1.equals("") || num2.equals("")) {
					JOptionPane.showMessageDialog(new JFrame(), "Falta un operando!!",
							"Number missing", JOptionPane.ERROR_MESSAGE);
				} else if(oper.equals("")) {
					JOptionPane.showMessageDialog(new JFrame(), "Falta la operación!!",
							"Operator missing", JOptionPane.ERROR_MESSAGE);
				} else if(oper.equals("+")) {
					res = Double.parseDouble(num1) + Double.parseDouble(num2);
					txt.setText(Double.toString(res));
					reset();
				} else if(oper.equals("-")) {
					res = Double.parseDouble(num1) - Double.parseDouble(num2);
					txt.setText(Double.toString(res));
					reset();
				} else if(oper.equals("*")) {
					res = Double.parseDouble(num1) * Double.parseDouble(num2);
					txt.setText(Double.toString(res));
					reset();
				} else if(oper.equals("/")) {			
					if(num2.equals("0")) {
						JOptionPane.showMessageDialog(new JFrame(), "No dividas entre cero!!!",
								"Division by zero", JOptionPane.ERROR_MESSAGE);
					} else {
						res = Double.parseDouble(num1) / Double.parseDouble(num2);
						txt.setText(Double.toString(res));
						reset();
					}
				}
			}
		};
		bequal.addActionListener(igual);
		
		ActionListener modo = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(new JFrame(), "¿Desea cambiar de modo?"); 
				switch(res) {
					case JOptionPane.YES_OPTION: 
						changeMode();
						break;
					case JOptionPane.NO_OPTION: 
						break;
				     default:
				    	 break;
				}
			}
		};
		bmode.addActionListener(modo);
	}
	private void reset() {
		operPulsada = false;
		num1 = Double.toString(res);
		txt.setText(num1);
		num2 = "";
		oper = "";
		contComas1 = 0;
		contComas2 = 0;
	}
	
	private void changeMode() {
		if (esOscuro) {
			getContentPane().setBackground(Color.decode("#bffbff"));
			txt.setBackground(Color.decode("#f5feff"));
			txt.setForeground(Color.BLACK);
			for(int i = 0; i < numero.length; i++) {
				numero[i].setBackground(Color.decode("#bffbff"));
				numero[i].setForeground(Color.decode("#0095ff"));
			}
			bdel.setBackground(Color.decode("#bffbff"));
			bdel.setForeground(Color.decode("#0040ff"));
			bsuma.setBackground(Color.decode("#bffbff"));
			bsuma.setForeground(Color.decode("#0040ff"));
			bresta.setBackground(Color.decode("#bffbff"));
			bresta.setForeground(Color.decode("#0040ff"));
			bmult.setBackground(Color.decode("#bffbff"));
			bmult.setForeground(Color.decode("#0040ff"));
			bdiv.setBackground(Color.decode("#bffbff"));
			bdiv.setForeground(Color.decode("#0040ff"));
			braiz.setBackground(Color.decode("#bffbff"));
			braiz.setForeground(Color.decode("#0040ff"));
			braiz3.setBackground(Color.decode("#bffbff"));
			braiz3.setForeground(Color.decode("#0040ff"));
			bcoma.setBackground(Color.decode("#bffbff"));
			bcoma.setForeground(Color.decode("#0040ff"));
			bequal.setBackground(Color.decode("#bffbff"));
			bequal.setForeground(Color.decode("#0040ff"));
			bmode.setBackground(Color.decode("#bffbff"));
			bmode.setForeground(Color.decode("#0040ff"));
			esOscuro = false;
		} else {
			getContentPane().setBackground(Color.decode("#4a4a4a"));
			txt.setBackground(Color.decode("#303030"));
			txt.setForeground(Color.decode("#ebebeb"));
			for(int i = 0; i < numero.length; i++) {
				numero[i].setBackground(Color.decode("#4a4a4a"));
				numero[i].setForeground(Color.decode("#333333"));
			}
			bdel.setBackground(Color.decode("#4a4a4a"));
			bdel.setForeground(Color.BLACK);
			bsuma.setBackground(Color.decode("#4a4a4a"));
			bsuma.setForeground(Color.BLACK);
			bresta.setBackground(Color.decode("#4a4a4a"));
			bresta.setForeground(Color.BLACK);
			bmult.setBackground(Color.decode("#4a4a4a"));
			bmult.setForeground(Color.BLACK);
			bdiv.setBackground(Color.decode("#4a4a4a"));
			bdiv.setForeground(Color.BLACK);
			braiz.setBackground(Color.decode("#4a4a4a"));
			braiz.setForeground(Color.BLACK);
			braiz3.setBackground(Color.decode("#4a4a4a"));
			braiz3.setForeground(Color.BLACK);
			bcoma.setBackground(Color.decode("#4a4a4a"));
			bcoma.setForeground(Color.BLACK);
			bequal.setBackground(Color.decode("#4a4a4a"));
			bequal.setForeground(Color.BLACK);
			bmode.setBackground(Color.decode("#4a4a4a"));
			bmode.setForeground(Color.BLACK);
			esOscuro = true;
		}
	}
	
}
