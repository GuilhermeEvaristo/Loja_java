package Avaliacao;

public class Produto{

private String tipo;
private char tamanho;
private double valor;
private int	quantidade;
private String cor;

public Produto(String tipo, char tamanho, double valor, int quantidade, String cor){
	this.setTipo(tipo);
	this.setTamanho(tamanho);
	this.setValor(valor);
	this.setQuantidade(quantidade);
	tihs.setCor(cor);
}

public String getTipo(){
	return this.tipo;
}

public void setTipo(String tipo) throws DadoInvalidoException{
	if(tipo == null){
		throw DadoInvalidoException;
	}

	this.tipo = tipo;
}

public char getTamanho(){
	return this.tamanho;
}

public void setTamanho(char tamanho){
	if(tamanho == null){
		throw DadoInvalidoException;
	}
	
	this.tamanho = tamanho;
}

public double getValor(){
	return this.valor;
}

public void setValor(double valor){
	if(valor == null){
		throw DadoInvalidoException;
	}

	this.valor = valor;
}

public int getQuantidade(){
	return this.quantidade;
}

public void setQuantidade(int quantidade){
	if(quantidade == null){
		throw DadoInvalidoException;
	}

	this.quantidade = quantidade;
}

public String getCor(){
	return this.cor
}

public void setCor(String cor){
	if (cor == null) {
		throw DadoInvalidoException;
	}

	this.cor = cor;
}

}