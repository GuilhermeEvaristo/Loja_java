package Avaliacao;

public class Funcionario extends Pessoa { 

    private String funcao;

    public Funcionario(String nome, String sobrenome, String cpf, String email, String endereco, String funcao) throws DadoInvalidoException {
        super(nome, sobrenome, cpf, email, endereco); 
        this.setFuncao(funcao);	
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) throws DadoInvalidoException {
        if (funcao == null) {	
            throw new DadoInvalidoException();
        }

        this.funcao = funcao;
    }

    
}
