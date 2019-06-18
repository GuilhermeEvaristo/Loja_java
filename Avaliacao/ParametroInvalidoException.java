package Avaliacao;

public class ParametroInvalidoException extends Exception{
	public ParametroInvalidoException(){
	}

	public void mensagem(){
		System.out.println("Parametro especificado não é aceito." );
	}
}