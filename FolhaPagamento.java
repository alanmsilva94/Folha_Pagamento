package folhapagamento;

import java.util.Scanner;

public class FolhaPagamento {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Funcionarios[] funcionarios = new Funcionarios[10];
        int contador = 0;
        String continuar = "S";
        int pesquisar;
        int opcoes;

        while (continuar.equals("S")) {

            System.out.print("Escolha uma das opções a seguir. (1 - Cadastrar funcionário, 2 - Exibir funcionário, 3 - Reajustar Salário): ");
            opcoes = input.nextInt();
            System.out.print("\n");

            switch (opcoes) {
                case 1:

                    System.out.print("Informe a categoria do funcionário ([A] - Assalariado, [H] - Horista): ");
                    String tipo = input.next().toUpperCase();
                    System.out.print("\n");

                    System.out.print("Informe o nome do funcionário: ");
                    String nome = input.next();
                    System.out.print("Informe o CPF: ");
                    String cpf = input.next();
                    System.out.print("Informe o endereço: ");
                    String end = input.next();
                    System.out.print("Informe o número de telefone: ");
                    String tel = input.next();
                    System.out.print("Informe o setor: ");
                    String setor = input.next();

                    if (tipo.equals("A")) {
                        System.out.print("Informe o valor do salário mensal: R$ ");
                        float sal = input.nextFloat();
                        funcionarios[contador] = new Assalariados(sal, nome, cpf, end, tel, setor);
                    } else if (tipo.equals("H")) {
                        System.out.print("Horas Trabalhadas: ");
                        float horasTrabalhadas = input.nextFloat();
                        System.out.print("Valor da Hora: ");
                        float valorHora = input.nextFloat();
                        funcionarios[contador] = new Horistas(horasTrabalhadas, valorHora, nome, cpf, end, tel, setor);
                    }

                    contador++;

                    break;

                case 2:
                    for (int i = 0; i < contador; i++) {
                        funcionarios[i].mostrarDetalhes();
                    }
                    break;

                case 3:
                    System.out.println("Informe o percentual (%) de aumento: ");
                    double percentualAumento = input.nextDouble();

                    for (int i = 0; i < contador; i++) {
                        funcionarios[i].salarioAumento(percentualAumento);
                        funcionarios[i].mostrarDetalhes();
                    }
                    break;
            }
            System.out.print("\n");
            System.out.print("Deseja realizar outra operação [S] para sim ou [N] para não: ");
            continuar = input.next().toUpperCase();
            System.out.print("\n");
        }
        System.out.println("\n Fim do Programa!");
    }
}
