
package lse2;
// INSERIRINICIO (x) - INSERIRFINAL (x)
//EXIBETODOS (x)
//REMOVE INICIO (x) - REMOVEFINAL (x)
//PROCURARCODIGO (x)
//EXIBEDADOS (x) - ALTERARDADOS ( )

public class LSEDeProdutos {
    
    private LSENode primeiro;
    private LSENode ultimo; //DESCRITOR
    
    public boolean isEmpty() {                  // VERIFICA LISTA VAZIA
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirInicio(Produto novoproduto) {  //INSERIR PRODUTO NO INICIO DA LISTA
        
         LSENode novo;
        novo = new LSENode (novoproduto);

        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            
        } else {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
        }
        System.out.println("Inserção efetuada");
    }
    
    public void inserirFinal (Produto novoproduto) {  //INSERIR PRODUTO NO FINAL DA LISTA
        LSENode novo;
        novo = new LSENode (novoproduto);
        
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
        }
        else { 
           this.ultimo.setProx (novo);
            this.ultimo = novo;
        }
        System.out.println("Inserção efetuada!");
    }

    public void exibirLista() {                             //EXIBE LISTA DE PRODUTOS
         LSENode aux;
                
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia");
        }
        else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo().toString());
                aux = aux.getProx();
            }
        }
        
    }
    
    public void removerInicio (Produto novoproduto) {     //REMOVE NO INICIO
        LSENode aux, auxAnterior;
        boolean achou = false;
        
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        }
        else {  // lista não está vazia
            aux = this.primeiro;
            if (aux.getInfo().equals(novoproduto)) { // comparando com o primeiro
                this.primeiro = aux.getProx();
                System.out.println("Remoção efetuada!");
            }
            else {
                auxAnterior = aux;
                aux = aux.getProx();
                while (aux != null) {
                    if (aux.getInfo().equals(novoproduto)) { // achou!
                        auxAnterior.setProx(aux.getProx());
                        System.out.println("Remoção efetuada!");
                        achou = true;
                        break;
                    }
                    else {
                        auxAnterior = aux;
                        aux = aux.getProx();
                    }
                }
                if (achou == false) {
                    System.out.println("Valor não encontrado!");
                }
            }
        }
    }
    
    public void removerNoFinal () {                         //REMOVE NO FINAL
        LSENode aux, auxAnterior;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        }
        else if (this.primeiro.getProx() == null) {
            this.primeiro = null;
            System.out.println("Remoção efetuada!");
        }
        else {
            auxAnterior = this.primeiro;
            aux = this.primeiro;
            while (aux.getProx() != null) {
                auxAnterior = aux;
                aux = aux.getProx();
            }
            auxAnterior.setProx(null);
            System.out.println("Remoção efetuada!");
        }
    }
    
    private LSENode procurarCodigo (String codigo){
        LSENode aux;
        
        if (this.isEmpty() == true) {
           return null;
            
        } else {
            aux = this.primeiro;
            int encontrar = 0;
            while (aux != null) {
                
               encontrar = aux.getInfo().compareTo(codigo);
               
               if(encontrar == 1){
                   return aux;
               }
               aux = aux.getProx();
            }
            return null;
        }
            
    }
    
    
    public void exibeDados(String codigoNovo){
        LSENode achou;
        LSEDeProdutos listadeprodutos;
        listadeprodutos = new LSEDeProdutos();
        
        achou = listadeprodutos.procurarCodigo(codigoNovo);
        
        if(achou == null){
            System.out.println("Produto não cadastrado");
        } else {
            System.out.println(achou.getInfo().toString());
        }
    
    }
    
    public void alterarDados(){
        
    }
    
    
    
    
    
}    
    
    
    
    
    
    

    

