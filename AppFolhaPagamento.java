import java.util.Scanner;

public class AppFolhaPagamento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Salário bruto: ");
        double salario = sc.nextDouble();

        System.out.println("Tipo do contribuinte:");
        System.out.println("1 - Funcionário CLT");
        System.out.println("2 - Estagiário");
        System.out.println("3 - Prestador de Serviço");
        System.out.print("Escolha: ");
        int tipo = sc.nextInt();

        Contribuinte contribuinte;

        switch (tipo) {
            case 1:
                contribuinte = new FuncionarioCLT(nome, cpf, salario);
                break;

            case 2:
                contribuinte = new Estagiario(nome, cpf, salario);
                break;

            case 3:
                contribuinte = new PrestadorServico(nome, cpf, salario);
                break;

            default:
                System.out.println("Tipo inválido!");
                sc.close();
                return;
        }

        // POLIMORFISMO: chamada genérica
        contribuinte.exibirResumo();

        sc.close();
    }
}

