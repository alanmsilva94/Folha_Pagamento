package folhapagamento;

public class Horistas extends Funcionarios {

    private float horas;
    private float valor;

    public Horistas(float horas, float valor, String nome, String cpf, String endereco, String telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.horas = horas;
        this.valor = valor;
    }

    public float getHoras() {
        return horas;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public double salarioFunc() {
        return horas * valor;
    }

    @Override
    public void salarioAumento(double percentual) {
        valor += valor * (percentual / 100);

    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("------------------- Dados do funcionário Horistas -------------------");
        System.out.println("Nome do funcionário: " + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Endereço: " + super.getEndereco());
        System.out.println("Telefone: " + super.getTelefone());
        System.out.println("Setor: " + super.getSetor());
        System.out.println("Salário: R$ " + salarioFunc());
        System.out.println("------------------------------------------------------------------------");
    }

}
