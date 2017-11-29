package Visao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;

import Controle.Filme;
import Controle.Ingresso;

public class SerealizadorCartao {
	
	private ObjectOutputStream output; 
	

	   
	   public void openFile()
	   {
	      try
	      {
	         output = new ObjectOutputStream(new FileOutputStream( "comprasCartao.ser" ) );
	      } 
	      catch ( IOException ioException )
	      {
	         System.err.println( "Error opening file." );
	      } 
	   } 
	   
	   public void addRecords(Frame4 frame, Filme filme, Frame3 frame3, Ingresso ingresso){
	   
	      CompraCartaoSerializavel record; 
	      String nome; 
	      int numeroCartao; 
	      int dataVencimento;
	      int cpf;
	      String nomeDoFilme;
	      String poltrona;
	      String horario;
	      float valor;
	      
	    
	         try {
	         
	            nome = frame.getNome();
	            numeroCartao = frame.getNumCartao();
	            dataVencimento = frame.getVencimento(); 
	            cpf = frame.getCpf(); 
	            nomeDoFilme = filme.getTitulo();
	            poltrona = frame3.getNomePoltrona();
	            horario = filme.getHorario();
	            valor = ingresso.getValor();

	            record = new CompraCartaoSerializavel(nome, numeroCartao,dataVencimento,cpf,nomeDoFilme,
	            		poltrona, horario, valor);
	               output.writeObject( record );
	         }
	         catch ( IOException ioException )
	         {
	            System.err.println( "Erro ao escrever dados seriaveis" );
	            return;
	         }
	         catch ( NoSuchElementException elementException )
	         {
	            System.err.println( "Erro nos elementos" );
	            
	         } 
	   
	   }
	   
	   public void closeFile() 
	   {
	      try 
	      {
	         if ( output != null )
	            output.close();
	      } 
	      catch ( IOException ioException )
	      {
	         System.err.println( "Error closing file." );
	         System.exit( 1 );
	      } 
	   } 

}
