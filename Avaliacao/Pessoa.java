package Avaliacao;	

public abstract class Pessoa {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String endereco;

    public Pessoa(String nome, String sobrenome, String cpf, String email, String endereco) throws DadoInvalidoException {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setEndereco(endereco);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) throws DadoInvalidoException {
        
        if (nome == null) {
            throw new DadoInvalidoException();
        }

        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) throws DadoInvalidoException {
        
        if (sobrenome == null || sobrenome.length() == 0	) {
            throw new DadoInvalidoException();
        }
        
        this.sobrenome = sobrenome;
    }

    public String getCpf(){
    	return this.cpf;
    }

    public void setCpf(String cpf) throws DadoInvalidoException{
    	if (cpf == null){
    		throw new DadoInvalidoException();
    	}
    	this.cpf = cpf;
    }
		
		public String getEmail(){
    	return this.email;
    }

    public void setEmail(String email) throws DadoInvalidoException{
    	if (email == null){
    		throw new DadoInvalidoException();
    	}
    	this.email = email;
    }
    public String getEndereco(){
    	return this.endereco;
    }

    public void setEndereco(String endereco) throws DadoInvalidoException{
    	if (endereco == null){
    		throw new DadoInvalidoException();
    	}
    	this.endereco = endereco;
    }

}