package Avaliacao;
    
public class Cliente extends Pessoa { 


    public Cliente(String nome, String sobrenome, String cpf, String email, String endereco) throws DadoInvalidoException {
        super(nome, sobrenome, cpf, email, endereco); 
    }

    public static void main(String[] args) {
        try {
            Cliente c = null;
            c = new Cliente("Guilherme", "Evaristo", "111.222.333-44", "guilherme.evaristo.paz@gmail.com", "Rua campo alegre");

            System.out.println("Nome do Cliente: " + c.getNome());
            System.out.println("Sobrenome do Cliente: " + c.getSobrenome());
            System.out.println("Cpf do Cliente: " + c.getCpf());
            System.out.println("E-mail do Cliente: " + c.getEmail());
            System.out.println("Endereço do Cliente: " + c.getEndereco());

            Pessoa p = c;

        } catch (DadoInvalidoException ex) {
            ex.printStackTrace();
        }
    }
}