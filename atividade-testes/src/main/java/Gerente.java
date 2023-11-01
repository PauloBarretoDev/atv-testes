import java.util.ArrayList;
import java.util.List;

public class Gerente {
    private String nome;
    private String formacao;
    private List<Departamento> departamentosSupervisionados;

    public Gerente(String nome, String formacao) {
        this.nome = nome;
        this.formacao = formacao;
        this.departamentosSupervisionados = new ArrayList<>();
    }

    public Gerente(String nome, String formacao, Departamento departamento) {
        this.nome = nome;
        this.formacao = formacao;
        this.departamentosSupervisionados = new ArrayList<>();
        this.departamentosSupervisionados.add(departamento);
    }

    public String getNome() {
        return this.nome;
    }

    public String getFormacao() {
        return this.formacao;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setFormacao(String novaFormacao) {
        this.formacao = novaFormacao;
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentosSupervisionados.add(departamento);
    }

    public void removerDepartamento(Departamento departamento) {
        departamentosSupervisionados.remove(departamento);
    }

    public void listarDepartamentos() {
        System.out.println("Departamentos supervisionados pelo Gerente " + nome + ":");
        for (Departamento departamento : departamentosSupervisionados) {
            System.out.println("Nome: " + departamento.getNome());
            System.out.println("Descrição: " + departamento.getDescricao());
            departamento.listarFuncionarios();
        }
    }

    @Override
    public String toString() {
        return "Gerente: " + this.getNome() + "\nFormação: " + this.getFormacao();
    }
}
