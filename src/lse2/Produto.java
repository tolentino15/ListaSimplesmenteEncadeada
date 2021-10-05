
package lse2;
// CODIGO (STRING) - DESCRIÇAO (STRING)
// PREÇO (DOUBLE) - ESTOQUE (INT)

public class Produto {

    private String codigo;
    private String descricao;
    private double preco;
    private int estoque;
    
    public Produto (String codigo,String descricao,double preco,int estoque){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;      
        this.estoque = estoque;      
    }
    
    public Produto (String codigo){
        this.codigo = codigo;
    }
    
    //GET CODIGO
    public String getCodigo() {
        return this.codigo;
    }
    
    //GET E SET DESCRICAO
    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    //GET E SET PRECO
    public void setPreco (double preco) {
        this.preco = preco;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    //GET E SET ESTOQUE
    public void setEstoque (int estoque) {
        this.estoque = estoque;
    }
    
    public int getEstoque() {
        return this.estoque;
    }
    
    public String toString () {
        return this.codigo + " " + this.descricao + " " + this.preco + " " + this.estoque;
    }
    
    public int compareTo (String c) {
        int result;
        result = this.codigo.compareTo(c);
        return result;
    }
    
    public boolean equals (Produto p) {
        boolean result;
        result = this.codigo.equals(p.codigo);
        return result;
    }
    
}
