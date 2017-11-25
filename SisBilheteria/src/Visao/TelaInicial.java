package Visao;

import javax.swing.*;

import Controle.Database;

public class TelaInicial {
	
	public TelaInicial(Database data) {
		JFrame janela = new JFrame("Sistema de bilheteria");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame1 tela1 = new Frame1(data);
		janela.add(tela1);
		janela.setSize(1000, 700);
		janela.setVisible(true);
	}

}
