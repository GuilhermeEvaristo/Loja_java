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

    public static void main(String[] args) {
        try {
            Funcionario f = null;
            f = new Funcionario("Guilherme", "Evaristo", "142.525.674-08", "guilherme.evaristo.paz@gmail.com", "Rua campo alegre", "Progrmador java" );

            System.out.println("Nome do funcionário: " + f.getNome());
            System.out.println("Sobrenome do funcionário: " + f.getSobrenome());
            System.out.println("Cpf do funcionário: " + f.getCpf());
            System.out.println("E-mail do funcionário: " + f.getEmail());
            System.out.println("Endereço do funcionário: " + f.getEndereco());
            System.out.println("Função do funcionário: " + f.getFuncao());


            Pessoa p = f;

        } catch (DadoInvalidoException ex) {
            ex.printStackTrace();
        }
    }
}