package Avaliacao;

public class Endereco{
	public String rua;
	public String bairro;
	public String cidade;
	public String estado;

	//contrutor da classe
	public Endereco(String rua,String bairro,String cidade, String estado){
		this.setRua(rua);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setEstado(estado);
	}
	// 
	//@@@@@@@ GETS E SETS 
	// 
	public void setRua(String rua){
		this.rua = rua;
	}

	public String getRua(){
		return this.rua;
	}

	public void setBairro(String bairro){
		this.bairro = bairro;
	}

	public String getBairro(){
		return this.bairro;
	}

	public void setCidade(String cidade){
		this.cidade = cidade;
	}

	public String getCidade(){
		return this.cidade;
	}

	public void setEstado(String estado){
		this.estado = estado;
	}

	public String getEstado(){
		return this.estado;
	}

	/*##############################################*/
}