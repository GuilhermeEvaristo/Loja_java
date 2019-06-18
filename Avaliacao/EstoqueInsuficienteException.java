package Avaliacao;

public class EstoqueInsuficienteException extends Exception{
	public EstoqueInsuficienteException(){
	}

	public void mensagem(){
		System.out.println("Unidades insuficientes no estoque." );
	}
}