import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private String descricao;
    private List<Funcionario> funcionarios;

    public Departamento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.funcionarios = new ArrayList<>();
    }

    public Departamento(String nome, String descricao, Funcionario funcionario) {
        this.nome = nome;
        this.descricao = descricao;
        this.funcionarios = new ArrayList<>();
        this.funcionarios.add(funcionario);
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários do Departamento de " + nome);
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNomeCompleto());
            System.out.println("Salário: R$ " + funcionario.getSalario());
            System.out.println("Quantidade de Vendas: " + funcionario.getVendas());
            System.out.println("-----------");
        }
    }

    @Override
    public String toString() {
        return "Departamento: " + this.getNome() + "\nDescrição: " + this.getDescricao();
    }
}
