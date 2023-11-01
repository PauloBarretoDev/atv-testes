import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Funcionario {
    private String nomeCompleto;
    private double salario;
    private int vendas;
    private double percAumento = 0.1;
    private String admissao = "2021-11-01";
    private boolean eleitoFerias;
    public Funcionario(String nomeCompleto, double salario, int vendas) {
        this.nomeCompleto = nomeCompleto;
        this.salario = salario;
        this.vendas = vendas;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getVendas() {
        return this.vendas;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public void mudarSalario(double novoSalario){
        this.salario = novoSalario;
    }

    public double aumentarSalarioComBaseVendas(double salario, int vendas, double percentual) {
        double salarioNovo =  salario + (vendas * percentual);
        this.salario = salario;
        return salarioNovo;
    }

    public boolean eleitoTirarFerias(String admissao){
        LocalDate data = LocalDate.parse(admissao);
        LocalDate dataAtual = LocalDate.now();
        if(ChronoUnit.MONTHS.between(data, dataAtual) > 12){
            this.eleitoFerias = true;
            return true;
        }
        else {
            this.eleitoFerias = false;
            return false;
        }
    }

    public void cadastrarVenda(int quantidadeVendas) {
        this.vendas = this.getVendas() + quantidadeVendas;
    }

    @Override
    public String toString() {
        return "Funcionário: " + this.getNomeCompleto() + "\nSalário: R$ " + this.getSalario() + "\nQuantidade de Vendas: " + this.getVendas();
    }
}
