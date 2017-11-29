package Controle;

public class Ingresso3D extends Ingresso{

    float valor = 36.9f;
    Filme filme;
 


    public Ingresso3D(Filme filme){
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
        return "3D";
    }


}
