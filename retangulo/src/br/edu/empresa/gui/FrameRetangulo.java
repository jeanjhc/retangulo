package br.edu.empresa.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.empresa.model.Retangulo;

public class FrameRetangulo {

	public void criarTela() {
		
		JFrame telaRetangulo = new JFrame();
		telaRetangulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaRetangulo.setSize(500, 300);
		telaRetangulo.setTitle("Cálculos com retângulo");
		telaRetangulo.setLayout(null);
		
		// *** Criar  Label e TextField da altura
		JLabel labelAltura = new JLabel ();
		labelAltura.setText("Altura: ");
		//** Definir a posição do tamanho do label ( x , y , w , h)
		labelAltura.setBounds(10, 10, 60, 30);
		
		//*** Criar um TextFild
		
		JTextField  textAltura = new JTextField();
		textAltura.setBounds(90, 10, 100, 30);
		
		// Criar um Label e TextField
		
		JLabel labelBase = new JLabel();
		labelBase.setText(null);
		labelBase.setText("Base: ");
		labelBase.setBounds(10, 40, 130, 30);
		
		JTextField  textBase = new JTextField();
		textBase.setBounds(90, 50, 100, 30);
		
		JButton btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(10, 150, 110, 30);
		
		//** criar botao
		
		JButton buttonCalcular = new JButton ();
		buttonCalcular.setText("Calcular");
		Color laranja = new Color (255,180,0);
		buttonCalcular.setBackground(laranja);
		buttonCalcular.setBounds(10, 100, 110, 30);
		
		//***Labels resultado
		JLabel labelArea= new JLabel();
		labelArea.setText("Area: ");
		labelArea.setBounds(200, 10, 120, 30);
		
		JLabel labelPerimetro= new JLabel();
		labelPerimetro.setText("Perimetro: ");
		labelPerimetro.setBounds(200, 50, 120, 30);
		
		
		
		//*** Colocar label altura dentro do painel de conteúdo 
		telaRetangulo.getContentPane().add(labelAltura);
		telaRetangulo.getContentPane().add(textAltura);
		telaRetangulo.getContentPane().add(labelBase);
		telaRetangulo.getContentPane().add(textBase);
		telaRetangulo.getContentPane().add(buttonCalcular);
		telaRetangulo.getContentPane().add(btnLimpar);
		telaRetangulo.getContentPane().add(labelArea);
		telaRetangulo.getContentPane().add(labelPerimetro);
	
		
		telaRetangulo.setVisible(true);
		
		//*** Ouvintes de ações/eventos
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Retangulo r1 = new Retangulo();
				r1.setAltura(Double.parseDouble(textAltura.getText()));
				r1.setBase(Double.parseDouble(textBase.getText()));
				
				labelArea.setText("Area: " + String.valueOf(r1.calcularArea()));
				labelPerimetro.setText(String.valueOf("perimetro: " + r1.calcularPerimetro()));
		
				
			}
		});
			
			
	}
}
