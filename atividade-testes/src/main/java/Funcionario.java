import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Funcionario {
    private String nomeCompleto;
    private double salario;
    private int vendas;
    private double percAumento = 0.1;
    private String admissao;
    private boolean eleitoFerias;
    public Funcionario(String nomeCompleto, double salario, int vendas, String admissao) {
        this.nomeCompleto = nomeCompleto;
        this.salario = salario;
        this.vendas = vendas;
        this.admissao = admissao;
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

    public String getAdmissao(){return this.admissao;}

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
        this.salario = salarioNovo;
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

    public double venderFerias(double salario,int diasVendidos) {
        double diaTrabalhado = (salario/30);
        double totalBonus = diaTrabalhado * diasVendidos;
        return totalBonus;
    }

    public double calcularSalarioAnual(double salario) {
        double salarioAnual = salario * 12;
        return salarioAnual;
    }

    public double calcularSalarioLiquido(double salarioBruto) {
        double inss = 0.0;
        if(salarioBruto < 2000){
            inss = 0.0;
        }else if(salarioBruto > 2000.0 && salarioBruto < 3000.0 ){
            inss = 0.05;
        }else if(salarioBruto > 3000.0 && salarioBruto < 4000.0 ){
            inss = 0.10;
        }else if(salarioBruto > 4000.0 && salarioBruto < 4500.0 ){
            inss = 0.15;
        }else{
            inss = 0.20;
        }
        double desconto = salarioBruto * inss;
        return salarioBruto - desconto;
    }

    @Override
    public String toString() {
        return "Funcionário: " + this.getNomeCompleto() + "\nSalário: R$ " + this.getSalario() + "\nQuantidade de Vendas: " + this.getVendas();
    }
}
