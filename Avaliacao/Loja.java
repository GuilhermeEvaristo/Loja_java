package Avaliacao;

public class Loja{
	public static void main(String[] args) {

			switch (args[0] ){

				case "1":
        try {
            Funcionario f = null;
            f = new Funcionario("Guilherme", "Evaristo", "111.222.333-44", "guilherme.evaristo.paz@gmail.com", "Rua campo alegre", "Progrmador java" );

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
        break;

				case "2":
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
        break;

        case "3":

        try {
            Produto p = null;
            p = new Produto("Camisa", "GG", 29.99, 50, "Preto");

            System.out.println("Nome do produto: " + p.getTipo());
            System.out.println("Tamanho do produto: " + p.getTamanho());
            System.out.println("Preço do produto: " + p.getValor());
            System.out.println("Quantidade do produto: " + p.getQuantidade());
            System.out.println("Cor do produto: " + p.getCor());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
			break;
	
			}
			
	}
}
