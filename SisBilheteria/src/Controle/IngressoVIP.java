package Controle;

public class IngressoVIP extends Ingresso {
	
	float valor = 31.9f;
	Filme filme;



	public IngressoVIP(Filme filme){
		this.filme = filme;
	}
	@Override
	public float getValor() {
		return valor;
	}
	
	@Override
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	@Override
	public String getTipo(){
		return "VIP";
	}
	

}
