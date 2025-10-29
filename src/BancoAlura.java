import java.util.Scanner;

public class BancoAlura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nomeDoCliente = "Veridiana dos Reis Lima";
        String tipoDeConta = "Corrente";
        double saldoDaConta = 2349.00;
        int opcaoMenu = 0;

        System.out.println("****************************************************************");
        System.out.println("                       BANCO ALURA");
        System.out.println("Nome do Cliente:      " + nomeDoCliente);
        System.out.println("Tipo da Conta:        " + tipoDeConta);
        System.out.println("Saldo Atual da Conta: R$ " + saldoDaConta);
        System.out.println("****************************************************************");

        String menuDaConta = """
                ****** Digite Operação Desejada ******
                1 - Consultar Saldo da Conta
                2 - Sacar valor
                3 - Depositar valor
                4 - Sair da Conta
                **************************************
                """;

        while(opcaoMenu != 4){
            System.out.println(menuDaConta);
            opcaoMenu = scanner.nextInt();

            if(opcaoMenu == 1) {
                System.out.println("Saldo Atual da Conta: R$" + saldoDaConta);
            } else if (opcaoMenu == 2){
                System.out.println("Qual o valor desejado que pretende sacar:");
                double valorDoSaque = scanner.nextDouble();
                if(valorDoSaque > saldoDaConta){
                    System.out.println("Não há saldo suficiente para saque!");
                } else {
                    saldoDaConta -=  valorDoSaque;
                    System.out.println("Novo saldo da conta: R$" + saldoDaConta);
                }
            } else if (opcaoMenu == 3) {
                System.out.println("Qual o valor que deseja depositar :");
                double valorDoDeposito = scanner.nextDouble();
                saldoDaConta += valorDoDeposito;
                System.out.println("Novo saldo da conta: R$" + saldoDaConta);
            } else if (opcaoMenu != 4) {
                System.err.println("Opção inválida, digite novamente: ");
            }
        }

        System.out.println("Saída da Conta Realizada com Sucesso!!!");
    }
}
