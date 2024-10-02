package folhapagamento;

public abstract class Funcionarios {

    protected String nome;
    protected String cpf;
    protected String endereco;
    protected String telefone;
    protected String setor;

    public Funcionarios(String nome, String cpf, String endereco, String telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSetor() {
        return setor;
    }

    public abstract double salarioFunc();

    public abstract void salarioAumento(double percentual);

    public abstract void mostrarDetalhes();

}
