package Avaliacao;

public class Produto{

private String tipo;
private String tamanho;
private double valor;
private int	quantidade;
private String cor;

public Produto(String tipo, String tamanho, double valor, int quantidade, String cor){
	this.setTipo(tipo);
	this.setTamanho(tamanho);
	this.setValor(valor);
	this.setQuantidade(quantidade);
	this.setCor(cor);
}

public String getTipo(){
	return this.tipo;
}

public void setTipo(String tipo){ 
	if(tipo == null){
		System.out.println("Erro");
	}

	this.tipo = tipo;
}

public String getTamanho(){
	return this.tamanho;
}

public void setTamanho(String tamanho){
	if(tamanho == null){
		System.out.println("Erro");
	}
	
	this.tamanho = tamanho;
}

public double getValor(){
	return this.valor;
}

public void setValor(double valor){
	if(valor == 0){
		System.out.println("Erro");
	}

	this.valor = valor;
}

public int getQuantidade(){
	return this.quantidade;
}

public void setQuantidade(int quantidade){
	if(quantidade == 0){
		System.out.println("Erro");
	}

	this.quantidade = quantidade;
}

public String getCor(){
	return this.cor;
}

public void setCor(String cor){
	if (cor == null) {
		System.out.println("Erro");
	}

	this.cor = cor;
}

public static void main(String[] args) {
	
}

}