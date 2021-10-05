
package lse2;
import java.util.Scanner;
public class Lse2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resp;
        
        LSEDeProdutos listadeprodutos;
        listadeprodutos = new LSEDeProdutos();
        
        Produto novoproduto = null;
        
        String codigo,descricao,codigonovo;
        double preco;
        int estoque;
        
        do{
        System.out.println("Seja Bem-vindo ao sistema de Lista de Produto! ");
        System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 – Inserir novo produto no início da lista");
            System.out.println("2 – Inserir novo produto no final da lista");
            System.out.println("3 – Remover o primeiro produto da lista");
            System.out.println("4 – Remover o último produto da lista");
            System.out.println("5 – Exibir todos os produtos da lista");
            System.out.println("6 – Exibir os dados de um produto da lista");
            System.out.println("7 – Alterar os dados de um produto da lista");
            System.out.println("8 - Remover produto através do código");
            System.out.println("0 – Sair do programa");
            resp = input.nextInt();
            switch(resp){
                
            case 1:
                    System.out.println("Insira as informações do Produto abaixo");
                    
                    System.out.println("Insira o Código do Produto:");
                    codigo = input.next();
                    System.out.println("Insira a Descrição do Produto:");
                    descricao = input.next();
                    System.out.println("Insira o Preço do Produto:");
                    preco = input.nextDouble();
                    System.out.println("Insira o Estoque do Produto:");
                    estoque = input.nextInt();
                    
                    novoproduto = new Produto(codigo,descricao,preco,estoque);
                                    
                    listadeprodutos.inserirInicio(novoproduto);
                    
                    break;     
            case 2:
                    System.out.println("Insira as informações do Produto abaixo");
                    
                    System.out.println("Insira o Código do Produto:");
                    codigo = input.next();
                    System.out.println("Insira a Descrição do Produto:");
                    descricao = input.next();
                    System.out.println("Insira o Preço do Produto:");
                    preco = input.nextDouble();
                    System.out.println("Insira o Estoque do Produto:");
                    estoque = input.nextInt();
                    
                    novoproduto = new Produto(codigo,descricao,preco,estoque);
                    
                    listadeprodutos.inserirFinal(novoproduto);
                    break;                  
            case 3:
                        if(novoproduto == null){
                            System.out.println("Produto não encontrado");
                        }else{
                            listadeprodutos.removerInicio(novoproduto);
                        }
                        break;
                        
            case 4:
                    listadeprodutos.removerNoFinal();
                    break;
            case 5:
                    listadeprodutos.exibirLista();
                    break;
            case 6:
                    System.out.println("Informe o Codigo do Produto que deseja vizualizar os dados:");
                    codigonovo = input.next();
                    
                    listadeprodutos.exibeDados(codigonovo);
                    break;
            case 7:
                    break;
            case 8:        
                   System.out.println("Informe o Código do Produto que deseja remover");
                   codigonovo = input.next();
                   listadeprodutos.removerProdutoCod(codigonovo);
            }
            
            
        } while (resp != 0);
        
    }
    
    
}
