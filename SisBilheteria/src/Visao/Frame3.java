package Visao;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import Controle.Filme;

public class Frame3 extends JFrame{
	
	private JButton poltronaA1;
    private JButton poltronaA2;
    private JButton poltronaA3;
    private JButton poltronaA4;
    private JButton poltronaA5;
    private JButton poltronaA6;
    private Filme filme;
    GridLayout grid_Layout;
    
    public Frame3(Filme filme) {
    	this.filme = filme;
    	
    	poltronaA1 = new JButton("A1");
    	poltronaA2 = new JButton("A2");
    	poltronaA3 = new JButton("A3");
    	poltronaA4 = new JButton("A4");
    	poltronaA5 = new JButton("A5");
    	poltronaA6 = new JButton("A6");
    	
    	if(filme.poltronas[0] == 1)
			poltronaA1.setBackground(Color.RED);
    	else
    		poltronaA1.setBackground(Color.GREEN);
    	
    	grid_Layout = new GridLayout(2,5,5,5);
    	setLayout(grid_Layout);
        add(poltronaA1);
        add(poltronaA2);
        add(poltronaA3);
        add(poltronaA4);
        add(poltronaA5);
    	
    	poltronaA1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(0);
			}
    		
 	
    	});
    	
    	
    	
    }

    private void selecionaPoltrona(int poltrona) {
    	if(filme.poltronas[0] == 0) {
			filme.comprarPoltrona(1);
			poltronaA1.setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Poltrona selecionada com sucesso!");
			Frame3.this.dispose(); // FECHA
	}
		else
			JOptionPane.showMessageDialog(null, "Poltrona já selecionada, escolha outra");
	}
	
	

}
