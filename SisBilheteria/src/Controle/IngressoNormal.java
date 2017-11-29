package Controle;

public class IngressoNormal extends Ingresso {
	
	Filme filme;
	
	float valor = 26.90f;

	public IngressoNormal(Filme filme){
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
		return "Normal";
	}
	
	

}
