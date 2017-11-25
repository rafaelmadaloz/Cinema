package Visao;

import Controle.Database;
import Controle.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame1 extends JPanel{
	
	private JLabel label;
	private JButton botaoIniciar;
	private JTextField texto;
	
	public Frame1(Database database) {
		super();
		
		setLayout(null);
		label = new JLabel();
		label.setToolTipText("Clique em 'comprar' para iniciar uma nova compra");
		add(label);
		
		botaoIniciar = new JButton("Comprar");
		botaoIniciar.setBounds(420, 350, 150, 100);
		botaoIniciar.addActionListener(
		
		new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Frame2 janela2 = new Frame2(database);
				janela2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				janela2.setSize(1000, 700);
				janela2.setVisible(true);
				
			}
			
		});
		add(botaoIniciar);
	
	
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 60));
		g.drawString("Sistema de bilheteria", 150, 200);
		
	}
	
	

}
