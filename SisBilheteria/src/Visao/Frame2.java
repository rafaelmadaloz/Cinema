package Visao;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Controle.Database;
import Controle.Filme;
import Controle.Sala;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class Frame2 extends JFrame{
	
	private JTextField textoEscolha;
	private JButton botaoAvancar;
	private JButton botaoVoltar;
	private BorderLayout border_Layout;
	
	private GridLayout grid_Layout;
	private JButton botaoFilme8;
    private JButton botaoFilme1;
    private JButton botaoFilme2;
    private JButton botaoFilme3;
    private JButton botaoFilme4;
    private JButton botaoFilme5;
    private JButton botaoFilme6;
    private JButton botaoFilme7;
    private JButton botaoFilme9;
    private JButton botaoFilme10;
    private int numEscolheFilme;
    private boolean continuar = false;
	
	
	public Frame2(Database database) {
		super();
		setLayout(null);
		
		textoEscolha = new JTextField("Escolha um filme:", 20);
		textoEscolha.setBounds(420, 0, 120, 20);
		textoEscolha.setEditable(false);
		add(textoEscolha);
		
		ImageIcon imgFilme1 = new ImageIcon("thor.png");
		
		
		
		botaoFilme1 = new JButton(imgFilme1);
        botaoFilme2 = new JButton("Filme 2");
        botaoFilme3 = new JButton("Filme 3");
        botaoFilme4 = new JButton("Filme 4");
        botaoFilme5 = new JButton("Filme 5");
        botaoFilme6 = new JButton("Filme 6");
        botaoFilme7 = new JButton("Filme 7");
        botaoFilme8 = new JButton("Filme 8");
        botaoFilme9 = new JButton("Filme 9");
        botaoFilme10 = new JButton("Filme 10");
        
       



        grid_Layout = new GridLayout(2,5,5,5);
        setLayout(grid_Layout);
      //  botaoFilme1.setBounds(420, 350, 150, 100);
        add(botaoFilme1);
        add(botaoFilme2);
        add(botaoFilme3);
        add(botaoFilme4);
        add(botaoFilme5);
        add(botaoFilme6);
        add(botaoFilme7);
        add(botaoFilme8);
        add(botaoFilme9);
        add(botaoFilme10);

        //setExtendedState(JFrame.MAXIMIZED_BOTH);



        botaoFilme1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Frame frame3 = new Frame3(database.getFilme(0));
                ((JFrame) frame3).setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame3.setSize(1000, 700);
				frame3.setVisible(true);
				Frame2.this.dispose(); // apenas fecha janela 
            
            	
             
            }
        });

        botaoFilme2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	Frame frame3 = new Frame3(database.getFilme(1));
                ((JFrame) frame3).setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame3.setSize(1000, 700);
				frame3.setVisible(true);
				Frame2.this.dispose(); // apenas fecha janela 
            }

        });

        botaoFilme3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	Frame frame3 = new Frame3(database.getFilme(2));
                ((JFrame) frame3).setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame3.setSize(1000, 700);
				frame3.setVisible(true);
				Frame2.this.dispose(); // apenas fecha janela 
            }

        });

        botaoFilme4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	Frame frame3 = new Frame3(database.getFilme(3));
                ((JFrame) frame3).setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame3.setSize(1000, 700);
				frame3.setVisible(true);
				Frame2.this.dispose(); // apenas fecha janela 
            }

        });

        botaoFilme5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	Frame frame3 = new Frame3(database.getFilme(4));
                ((JFrame) frame3).setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame3.setSize(1000, 700);
				frame3.setVisible(true);
				Frame2.this.dispose(); // apenas fecha janela 
            }

        });

        botaoFilme6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	Frame frame3 = new Frame3(database.getFilme(5));
                ((JFrame) frame3).setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame3.setSize(1000, 700);
				frame3.setVisible(true);
				Frame2.this.dispose(); // apenas fecha janela 
            }

        });

        botaoFilme7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	Frame frame3 = new Frame3(database.getFilme(6));
                ((JFrame) frame3).setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame3.setSize(1000, 700);
				frame3.setVisible(true);
				Frame2.this.dispose(); // apenas fecha janela 
            }

        });

        botaoFilme8.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	Frame frame3 = new Frame3(database.getFilme(7));
                ((JFrame) frame3).setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame3.setSize(1000, 700);
				frame3.setVisible(true);
				Frame2.this.dispose(); // apenas fecha janela 
            }

        });

        botaoFilme9.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	Frame frame3 = new Frame3(database.getFilme(8));
                ((JFrame) frame3).setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame3.setSize(1000, 700);
				frame3.setVisible(true);
				Frame2.this.dispose();
            }

        });

        botaoFilme10.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	Frame frame3 = new Frame3(database.getFilme(9));
                ((JFrame) frame3).setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame3.setSize(1000, 700);
				frame3.setVisible(true);
				Frame2.this.dispose();
             

            }

        });
		
		
		
		
		
	}
	
	
	





/*
    int numero;
    private JTextField textoEscolha;
    private JButton botaoVoltar;
    private GridLayout grid_Layout;
    private JButton botaoFilme8;
    private JButton botaoFilme1;
    private JButton botaoFilme2;
    private JButton botaoFilme3;
    private JButton botaoFilme4;
    private JButton botaoFilme5;
    private JButton botaoFilme6;
    private JButton botaoFilme7;
    private JButton botaoFilme9;
    private JButton botaoFilme10;
    private int numEscolheFilme;
    private boolean continuar = false;
    Database database = new Database();
    MenuComprarIngresso comprarIngresso = new MenuComprarIngresso(database);

    ImageIcon imagemFilme1 = new ImageIcon("THOR.jpg");
    public Frame2() {

            super("Selecione um filme");




            botaoFilme1 = new JButton("Filme 1", imagemFilme1);
            botaoFilme2 = new JButton("Filme 2");
            botaoFilme3 = new JButton("Filme 3");
            botaoFilme4 = new JButton("Filme 4");
            botaoFilme5 = new JButton("Filme 5");
            botaoFilme6 = new JButton("Filme 6");
            botaoFilme7 = new JButton("Filme 7");
            botaoFilme8 = new JButton("Filme 8");
            botaoFilme9 = new JButton("Filme 9");
            botaoFilme10 = new JButton("Filme 10");




            grid_Layout = new GridLayout(2,5,5,5);
            setLayout(grid_Layout);
            add(botaoFilme1);
            add(botaoFilme2);
            add(botaoFilme3);
            add(botaoFilme4);
            add(botaoFilme5);
            add(botaoFilme6);
            add(botaoFilme7);
            add(botaoFilme8);
            add(botaoFilme9);
            add(botaoFilme10);

            setExtendedState(JFrame.MAXIMIZED_BOTH);



            botaoFilme1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 1;
                    JOptionPane.showMessageDialog(null,"Voce escolheu o filme " + getNumEscolheFilme());
                    comprarIngresso.selecionarFilme(1);
                 
                }
            });

            botaoFilme2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 2;
                }

            });

            botaoFilme3.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 3;
                }

            });

            botaoFilme4.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 4;
                }

            });

            botaoFilme5.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 5;
                }

            });

            botaoFilme6.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 6;
                }

            });

            botaoFilme7.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 7;
                }

            });

            botaoFilme8.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 8;
                }

            });

            botaoFilme9.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 9;
                }

            });

            botaoFilme10.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 10;
                    int resposta = JOptionPane.showConfirmDialog(null,"Voce escolheu o filme " + numEscolheFilme);
                    if(resposta == JOptionPane.YES_OPTION)
                        getNumEscolheFilme();

                }

            });

        }


public void mostrarJanela(){
    setVisible(true);
}

    public int getNumEscolheFilme(){


        return numEscolheFilme;
    }
}
*/

}
