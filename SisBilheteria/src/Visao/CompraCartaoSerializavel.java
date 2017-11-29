package Visao;

import java.io.Serializable;

public class CompraCartaoSerializavel implements Serializable{
	
	String nome; 
    int numeroCartao; 
    int dataVencimento;
	int cpf;
    String nomeDoFilme;
    String poltrona;
    String horario;
    float valor;
    
    public CompraCartaoSerializavel() {
    	this("",0,0,0, "", "","", 0.0f);
    }
    
    public CompraCartaoSerializavel(String nome, int numeroCartao, int dataVencimento, int cpf, String nomeDoFilme,
    		String poltrona, String horario, float valor){
    	this.nome = nome;
    	this.numeroCartao = numeroCartao;
    	this.dataVencimento = dataVencimento;
    	this.cpf = cpf;
    	this.nomeDoFilme = nomeDoFilme;
    	this.poltrona = poltrona;
    	this.horario = horario;
    	this.valor = valor;
    } 
    
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public int getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(int dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNomeDoFilme() {
		return nomeDoFilme;
	}

	public void setNomeDoFilme(String nomeDoFilme) {
		this.nomeDoFilme = nomeDoFilme;
	}

	public String getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(String poltrona) {
		this.poltrona = poltrona;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

    
 
   
    


}
