
package lse2;

public class LSENode {
    private Produto info;
    private LSENode prox;
   
    public LSENode (Produto value) {
        this.info = value;
    }
    
    public void setInfo (Produto value) {
        this.info = value;
    }
    
    public Produto getInfo() {
        return this.info;
    }
    
    public void setProx (LSENode novoProx) {
        this.prox = novoProx;
    }
    
    public LSENode getProx () {
        return this.prox;
    }
}
