package Avaliacao;

import java.util.ArrayList;

public class Loja{
    //array contendo os produtos da loja;
    public static ArrayList<Produto> estoque = new ArrayList<Produto>();

    public static void main(String[] args) {
        Produto jogo = new Produto(0,"YGO", 5.6, 555 );
        Produto jogo2 = new Produto(5,"YaGO", 5.6, 6 );

        Endereco endereco = new Endereco("campo alegre","alto do céu","igarassu","PE");

        Funcionario joao = new Funcionario("João","111.111.111-11",endereco,"vendedor");

        Cliente jose = new Cliente("josé","222.222.222-22",endereco);
        try{
            joao.adicionarProduto(jogo);
            // joao.adicionarProduto(jogo2);

            joao.vender(jose,jogo,22);
            // joao.vender(jose,jogo2,6);

            // joao.removerProduto(jogo);
            // joao.reabastecer(jogo,3);


        }catch(ProdutoException w){
            w.mensagem();
        }catch(EstoqueInsuficienteException w){
            w.mensagem();
        }catch(ParametroInvalidoException w){
            w.mensagem();
        }catch(IndexOutOfBoundsException w){
            System.out.println("Produto não se encontra no estoque.");
        }
        
        Loja.estoque.forEach((n) -> estoque(n));


    }
    public static void estoque(Produto p){
        System.out.println("---------------------------------------------------------------");
        System.out.println(p.getNome()+ " == "+ p.getQuantEstoque());
        System.out.println("---------------------------------------------------------------");
    }
}


// public class Loja{

//     public static ArrayList<Produto> estoque = new ArrayList<Produto>();
// 	public static void main(String[] args) {
//         Produto jogo = new Produto(0,"YGO", 5.6, 6 );
//         Produto jogo2 = new Produto(1,"YaGO", 5.6, 6 );
//         Endereco endereco = new Endereco("campo alegre","alto do céu","igarassu","PE");

// 			switch (args[0] ){

// 				case "1":
//         try {
//             Funcionario f = null;
//             f = new Funcionario("Guilherme", "Evaristo", "111.222.333-44", "guilherme.evaristo.paz@gmail.com", endereco, "Progrmador java" );

//             System.out.println("Nome do funcionário: " + f.getNome());
//             System.out.println("Sobrenome do funcionário: " + f.getSobrenome());
//             System.out.println("Cpf do funcionário: " + f.getCpf());
//             System.out.println("E-mail do funcionário: " + f.getEmail());
//             System.out.println("Função do funcionário: " + f.getFuncao());


//             Pessoa p = f;


//         } catch (DadoInvalidoException ex) {
//             ex.printStackTrace();
//         }
//         break;

// 				case "2":
//         try {
//             Cliente c = null;
//             c = new Cliente("Guilherme", "Evaristo", "111.222.333-44", "guilherme.evaristo.paz@gmail.com", endereco);

//             System.out.println("Nome do Cliente: " + c.getNome());
//             System.out.println("Sobrenome do Cliente: " + c.getSobrenome());
//             System.out.println("Cpf do Cliente: " + c.getCpf());
//             System.out.println("E-mail do Cliente: " + c.getEmail());

//             Pessoa p = c;

//         } catch (DadoInvalidoException ex) {
//             ex.printStackTrace();
//         }
//         break;

//         case "3":

//         try {
//             Produto p = null;
//             p = new Produto("Camisa", "GG", 29.99, 50, "Preto");

//             System.out.println("Nome do produto: " + p.getTipo());
//             System.out.println("Tamanho do produto: " + p.getTamanho());
//             System.out.println("Preço do produto: " + p.getValor());
//             System.out.println("Quantidade do produto: " + p.getQuantidade());
//             System.out.println("Cor do produto: " + p.getCor());

//         } catch (Exception ex) {
//             ex.printStackTrace();
//         }
// 			break;
	
// 			}
			
// 	}
// }
