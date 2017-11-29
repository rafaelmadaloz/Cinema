package Visao;

import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
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
	
    private Filme filme;
    GridLayout grid_Layout;
    
    JButton[] botaoPoltronas = new JButton[30];
    String nomePoltrona;
    
    
    public Frame3(Filme filme) {
    	this.filme = filme;
    	
    	
    	
    	botaoPoltronas[0] = new JButton("A1");
    	botaoPoltronas[1] = new JButton("A2");
    	botaoPoltronas[2] = new JButton("A3");
    	botaoPoltronas[3] = new JButton("A4");
    	botaoPoltronas[4] = new JButton("A5");
    	botaoPoltronas[5] = new JButton("A6");
    	botaoPoltronas[6] = new JButton("B1");
    	botaoPoltronas[7] = new JButton("B2");
    	botaoPoltronas[8] = new JButton("B3");
    	botaoPoltronas[9] = new JButton("B4");
    	botaoPoltronas[10] = new JButton("B5");
    	botaoPoltronas[11] = new JButton("B6");
    	botaoPoltronas[12] = new JButton("C1");
    	botaoPoltronas[13] = new JButton("C2");
    	botaoPoltronas[14] = new JButton("C3");
    	botaoPoltronas[15] = new JButton("C4");
    	botaoPoltronas[16] = new JButton("C5");
    	botaoPoltronas[17] = new JButton("C6");
    	botaoPoltronas[18] = new JButton("D1");
    	botaoPoltronas[19] = new JButton("D2");
    	botaoPoltronas[20] = new JButton("D3");
    	botaoPoltronas[21] = new JButton("D4");
    	botaoPoltronas[22] = new JButton("D5");
    	botaoPoltronas[23] = new JButton("D6");
    	botaoPoltronas[24] = new JButton("E1");
    	botaoPoltronas[25] = new JButton("E2");
    	botaoPoltronas[26] = new JButton("E3");
    	botaoPoltronas[27] = new JButton("E4");
    	botaoPoltronas[28] = new JButton("E5");
    	botaoPoltronas[29] = new JButton("E6");
    	
    	
    	for(int i = 0; i < 30; i++) {
    		if(filme.poltronas[i] == 1)
    			botaoPoltronas[i].setBackground(Color.RED);
        	else
        		botaoPoltronas[i].setBackground(Color.GREEN);
    	}
    	
    	
    	grid_Layout = new GridLayout(5,6,5,5);
    	setLayout(grid_Layout);
    	
    	for(int i = 0; i < botaoPoltronas.length; i++) {
    		add(botaoPoltronas[i]);
    	}
    	
       
        
    	
        botaoPoltronas[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				selecionaPoltrona(0);
				nomePoltrona = botaoPoltronas[0].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(1);
					nomePoltrona = botaoPoltronas[1].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(2);
					nomePoltrona = botaoPoltronas[2].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(3);
					nomePoltrona = botaoPoltronas[3].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(4);
					nomePoltrona = botaoPoltronas[4].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(5);
					nomePoltrona = botaoPoltronas[5].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(6);
					nomePoltrona = botaoPoltronas[6].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(7);
					nomePoltrona = botaoPoltronas[7].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[8].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(8);
					nomePoltrona = botaoPoltronas[8].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[9].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(9);
					nomePoltrona = botaoPoltronas[9].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[10].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(10);
					nomePoltrona = botaoPoltronas[10].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[11].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(11);
					nomePoltrona = botaoPoltronas[11].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[12].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(12);
					nomePoltrona = botaoPoltronas[12].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[13].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(13);
					nomePoltrona = botaoPoltronas[13].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[14].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(14);
					nomePoltrona = botaoPoltronas[14].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[15].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(15);
					nomePoltrona = botaoPoltronas[15].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[16].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(16);
					nomePoltrona = botaoPoltronas[16].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[17].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(17);
					nomePoltrona = botaoPoltronas[17].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[18].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(18);
					nomePoltrona = botaoPoltronas[18].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[19].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(19);
					nomePoltrona = botaoPoltronas[19].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[20].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(20);
					nomePoltrona = botaoPoltronas[20].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[21].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(21);
					nomePoltrona = botaoPoltronas[21].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[22].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(22);
					nomePoltrona = botaoPoltronas[22].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[23].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(23);
					nomePoltrona = botaoPoltronas[23].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[24].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(24);
					nomePoltrona = botaoPoltronas[24].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[25].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(25);
					nomePoltrona = botaoPoltronas[25].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[26].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(26);
					nomePoltrona = botaoPoltronas[26].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[27].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(27);
					nomePoltrona = botaoPoltronas[27].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[28].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(28);
					nomePoltrona = botaoPoltronas[28].getName();
			}
    		
 	
    	});
    	
        botaoPoltronas[29].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					selecionaPoltrona(29);
					nomePoltrona = botaoPoltronas[29].getName();
			}
    		
 	
    	});
    	
    	
    	
    	
    }
    


    private void selecionaPoltrona(int poltrona) {
    	if(filme.poltronas[poltrona] == 0) {
			filme.comprarPoltrona(poltrona);
			botaoPoltronas[poltrona].setBackground(Color.RED);
			JOptionPane.showMessageDialog(null, "Poltrona selecionada com sucesso!");
			Frame3.this.dispose(); // FECHA
			Frame4 frame4 = new Frame4(filme);
			frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame4.setSize(1000, 700);
			frame4.setVisible(true);
	}
		else
			JOptionPane.showMessageDialog(null, "Poltrona já selecionada, escolha outra");
	}



	public String getNomePoltrona() {
		return nomePoltrona;
	}
    
    
	

}
