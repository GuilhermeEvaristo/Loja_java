package Avaliacao;

import java.util.ArrayList;

public class Funcionario extends Pessoa{
    public String cargo;

    //contrutor da classe

    public Funcionario(String nome, String cpf, Endereco endereco, String cargo){
        super(nome, cpf , endereco);
        this.setCargo(cargo);
    }

    // 
    //@@@@@@@ GETS E SETS 
    // 

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String getCargo(){
        return this.cargo;
    }

    /*##############################################*/

    //adiciona o produto ao estoque da loja
    public void adicionarProduto(Produto produto) throws ProdutoException,ParametroInvalidoException{
        if (produto == null) {
            throw new ParametroInvalidoException();
        }
        //verifica se o item ja esta ou não no estoque;
        if (this.verificar(produto)) {
            throw new ProdutoException("Contem unidades desse produto no estoque, tente adicionarUnidade();");
        }
        //adiciona o item ao estoque
        Loja.estoque.add(produto.getCodigo(),produto);
    }

    //remove o produto ao estoque da loja
    public void removerProduto(Produto produto) throws ParametroInvalidoException{
        if (produto == null) {
            throw new ParametroInvalidoException();
        }
        Loja.estoque.remove(produto.getCodigo());
    }

    //retira unidades do produto 
    public void vender(Cliente cliente, Produto produto , int quantidade) throws EstoqueInsuficienteException , ParametroInvalidoException{
        
        //verifica se o parametro nao é negativo/null  e lança a exceção; 
        if (quantidade <= 0 || produto == null || cliente == null) {
            throw new ParametroInvalidoException();
        }
        //verifica se tem unidades suficientes para a venda se não lança a exceção;
        if (quantidade > Loja.estoque.get(produto.getCodigo()).quantEstoque ){
            throw new EstoqueInsuficienteException();
        }
        //verifica se o item ja esta ou não no estoque;
        if (this.verificar(produto)) {
        //completa a venda do item;
        Loja.estoque.get(produto.getCodigo()).retirarUnidade(quantidade);
        }


        //remove o produto do estoque caso as unidades tenha se esgotado
        if (Loja.estoque.get(produto.getCodigo()).quantEstoque == 0) {
            this.removerProduto(produto);
        }

    }

    //adiciona unidades do produto 
    public void reabastecer(Produto produto, int quantidade) throws ParametroInvalidoException,ProdutoException{
        //verifica se o parametro nao é negativo/null  e lança a exceção; 
        if (quantidade < 0 || produto == null) {
            throw new ParametroInvalidoException();
        }
        if (this.verificar(produto)) {
            Loja.estoque.get(produto.getCodigo()).adicionarUnidade(quantidade);
        }else{
            throw new ProdutoException("Produto não se encontra no estoque tente adicionarProduto();");
        }
        
        //completa a adição do item;
    }
    
    public boolean verificar(Produto produto){
        //verifica se o item ja esta ou não no estoque;
        for (int i = 0; i < Loja.estoque.size() ; i++ ) {
            if (Loja.estoque.get(i).getNome() == produto.getNome() || Loja.estoque.get(i).getCodigo() == produto.getCodigo()) {
                return true;
            }
        }
        return false;
    }
}

// public class Funcionario extends Pessoa { 

//     private String funcao;

//     public Funcionario(String nome, String sobrenome, String cpf, String email, Endereco endereco, String funcao) throws DadoInvalidoException {
//         super(nome, sobrenome, cpf, email, endereco); 
//         this.setFuncao(funcao);	
//     }

//     public String getFuncao() {
//         return this.funcao;
//     }

//     public void setFuncao(String funcao) throws DadoInvalidoException {
//         if (funcao == null) {	
//             throw new DadoInvalidoException();
//         }

//         this.funcao = funcao;
//     }

    
// }
