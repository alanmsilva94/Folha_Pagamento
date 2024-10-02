package folhapagamento;

public class Assalariados extends Funcionarios {

    private float salario_mensal;

    public Assalariados(float salario_mensal, String nome, String cpf, String endereco, String telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.salario_mensal = salario_mensal;
    }

    public float getSalario_mensal() {
        return salario_mensal;
    }

    @Override
    public double salarioFunc() {
        return getSalario_mensal();
    }

    @Override
    public void salarioAumento(double percentual) {
        salario_mensal += (salario_mensal * percentual / 100);

    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("\n------------------- Dados do funcionário Assalariado -------------------\n");
        System.out.println("Nome do funcionário: " + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Endereço: " + super.getEndereco());
        System.out.println("Telefone: " + super.getTelefone());
        System.out.println("Setor: " + super.getSetor());
        System.out.println("Salário: R$ " + salarioFunc());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("\n");
    }

}
