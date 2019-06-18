package Avaliacao;

public class Produto{
	public int codigo;
	public String nome;
	public double valor;
	public int quantEstoque;


	//contrutor da classe
	public Produto(int codigo ,String nome,double valor, int quantEstoque){
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setValor(valor);
		this.setQuantEstoque(quantEstoque);
	}

	// 
	//@@@@@@@ GETS E SETS 
	// 
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}


	public int getCodigo(){
		return this.codigo;
	}

	public void setNome(String nome){
		this.nome = nome;
	}


	public String getNome(){
		return this.nome;
	}

	public void setValor(double valor){
		this.valor = valor;
	}


	public double getvalor(){
		return this.valor;
	}

	public void setQuantEstoque(int quantEstoque){
		this.quantEstoque = quantEstoque;
	}

	public int getQuantEstoque(){
		return this.quantEstoque;
	}

	/*##############################################*/

	//retira da quantidade em estoque o valor passado
	public void retirarUnidade(int comprado){
		this.quantEstoque -= comprado;
	}

	//adiciona a quantidade em estoque o valor passado
	public void adicionarUnidade(int adicionar){
		this.quantEstoque += adicionar;
	}

}