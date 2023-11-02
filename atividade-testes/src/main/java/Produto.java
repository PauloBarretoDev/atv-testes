public class Produto {
    private String nome;
    private int estoque;
    private double valor;
    private String descricao;

    public Produto(String nome, int estoque, String descricao, double valor){
        this.nome = nome;
        this.estoque = estoque;
        this.descricao = descricao;
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
        return valor;
    }
    public int getEstoque() {
        return estoque;
    }
    public String getNome() {
        return nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double parcelarProduto(double valorAtual, int parcelas){
        double valorFinal = 0;
        double juros = 0.0;
        if(parcelas <=2){
            valorFinal = valorAtual;
        }
        else if(parcelas > 3 && parcelas <=4 ){
            juros = 0.1;
            valorFinal = valorAtual + (valorAtual * juros);
        }else{
            juros = 0.20;
            valorFinal = valorAtual + (valorAtual * juros);
        }
        return valorFinal;
        
    }
}
