package Avaliacao;

public class ProdutoException extends Exception{

	public String mensagem;
	public ProdutoException(String mensagem){
		this.mensagem = mensagem;
	}

	public void mensagem(){
		System.out.println(this.mensagem);
	}
}