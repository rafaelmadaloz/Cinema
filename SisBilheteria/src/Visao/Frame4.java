package Visao;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Controle.Filme;
import Controle.Ingresso;
import Controle.Ingresso3D;
import Controle.IngressoNormal;
import Controle.IngressoVIP;


public class Frame4 extends JFrame{
	
	private JTextField textoEscolha, textCvc, campoCvc, textCPF, campoCPF, textVencimento, campoVencimento;
	private JTextField textEscrevaONome, textCampoNome, textCampoNumCartao, textDigiteNumCartao ,textoNaoEditavel1, textoNaoEditavel2;
	private static final String[] metodosPag = {"Dinheiro", "Cartao de credito/debito"};
	private static final String[] tipoEntradas = {"Meia entrada", "Normal"};
	private JRadioButton meiaEntrada, entradaNormal;
	private ButtonGroup buttonGroup;
	private JComboBox comboBox;
	private JButton finalizarCompra;
	private String nome;
	private int cpf, cvc, numCartao, vencimento;
	Ingresso ingresso;
	
	public Frame4(Filme filme) {
		super();
		
		
		setLayout(null);
		
		textoEscolha = new JTextField("Escolha a forma de pagamento:", 40);
		textoEscolha.setBounds(350, 50, 210, 20);
		textoEscolha.setEditable(false);
		add(textoEscolha);
		
		
		
		comboBox = new JComboBox(metodosPag);
		comboBox.setBounds(350, 100, 200, 40);
		comboBox.setMaximumRowCount(2);
		add(comboBox);
		
		meiaEntrada = new JRadioButton("Meia entrada");
		entradaNormal = new JRadioButton("Normal");
		meiaEntrada.setBounds(340, 150, 150, 30);
		entradaNormal.setBounds(490, 150, 150, 30);
		add(meiaEntrada);
		add(entradaNormal);
		
		
		buttonGroup= new ButtonGroup();
		buttonGroup.add(meiaEntrada);
		buttonGroup.add(entradaNormal);
		
		//Forma de pagamento cartão de crédito.
		
		
		
		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String resposta = (String) comboBox.getSelectedItem(); 
				 if(resposta.equalsIgnoreCase("cartao de credito/debito")) {
					opcaoCartaoDeCreditoDebito(filme);	
				 }
			}

		});
		
		finalizarCompra = new JButton("Finalizar Compra");
		finalizarCompra.setBounds(270, 600, 500, 80);
		add(finalizarCompra);
		
		
		
		
	
		
	}
	
	private void opcaoCartaoDeCreditoDebito(Filme filme) {
		textEscrevaONome = new JTextField("Digite seu nome (como está no cartão):", 30);
		textEscrevaONome.setEditable(false);
		textEscrevaONome.setBounds(100, 200, 270, 20);
		add(textEscrevaONome);
		
		textCampoNome= new JTextField(20);
		textCampoNome.setBounds(370, 200, 250, 20);
		add(textCampoNome);
		
		textDigiteNumCartao = new JTextField("Numero do cartão:", 30);
		textDigiteNumCartao.setEditable(false);
		textDigiteNumCartao.setBounds(100, 250, 130, 20);
		add(textDigiteNumCartao);
		
		try{
			 javax.swing.text.MaskFormatter numCartao = new javax.swing.text.MaskFormatter("#### #### #### ####");
			 textCampoNumCartao= new javax.swing.JFormattedTextField(numCartao);
			 textCampoNumCartao.setBounds(230, 250, 150, 20);
			 add(textCampoNumCartao);
			 }catch(Exception e){
			}
		
		
		textVencimento = new JTextField("Vencimento:", 30);
		textVencimento.setEditable(false);
		textVencimento.setBounds(450, 250, 130, 20);
		add(textVencimento);
		
		try{
			 javax.swing.text.MaskFormatter vencimento = new javax.swing.text.MaskFormatter("##/##");

			 campoVencimento = new javax.swing.JFormattedTextField(vencimento);
			 campoVencimento.setBounds(580, 250, 80, 20);
			 add(campoVencimento);
			 }catch(Exception e){
			}
		
		textCvc = new JTextField("Código CVC:", 30);
		textCvc.setEditable(false);
		textCvc.setBounds(100, 300,130 , 20);
		add(textCvc);
		
		try{
			 javax.swing.text.MaskFormatter codCvc = new javax.swing.text.MaskFormatter("###");

			 campoCvc = new javax.swing.JFormattedTextField(codCvc);
			 campoCvc.setBounds(230, 300, 80, 20);
			 add(campoCvc);
			 }catch(Exception e){
			}
		
		textCPF = new JTextField("CPF:", 30);
		textCPF.setEditable(false);
		textCPF.setBounds(100, 350,50 , 20);
		add(textCPF);
		
		try{
			 javax.swing.text.MaskFormatter codCPF = new javax.swing.text.MaskFormatter("###.###.###-##");

			 campoCPF = new javax.swing.JFormattedTextField(codCPF);
			 campoCPF.setBounds(150, 350, 120, 20);
			 add(campoCPF);
			 }catch(Exception e){
			}
		
		nome = (String)textCampoNome.getText();
		cpf = Integer.parseInt((String)campoCPF.getText());
		numCartao = Integer.parseInt((String)textCampoNumCartao.getText());
		vencimento = Integer.parseInt((String)campoVencimento.getText());
		
		
		finalizarCompra.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso!");
				if(filme.getTipo().equalsIgnoreCase("normal")){
					IngressoNormal ingresso = new IngressoNormal(filme);
					if(meiaEntrada.isSelected()) {
						ingresso.setValor(ingresso.getValor()/2);
					}
				}
				else if(filme.getTipo().equalsIgnoreCase("3d")) {
					Ingresso3D ingresso = new Ingresso3D(filme);
					if(meiaEntrada.isSelected()) {
						ingresso.setValor(ingresso.getValor()/2);
					}
				}
				else {
					IngressoVIP ingresso = new IngressoVIP(filme);
					if(meiaEntrada.isSelected()) {
						ingresso.setValor(ingresso.getValor()/2);
					}
				}
				JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso!\nValor da compra: ");
		
			}
			
		});

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public int getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}

	public int getVencimento() {
		return vencimento;
	}

	public void setVencimento(int vencimento) {
		this.vencimento = vencimento;
	}
	


}
