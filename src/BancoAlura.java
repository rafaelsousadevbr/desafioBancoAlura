import java.util.Scanner;

public class BancoAlura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeDoCliente = "Veridiana dos Reis Lima";
        String tipoDeConta = "Corrente";
        double saldoDaConta = 2349.00;


        System.out.println("****************************************************************");
        System.out.println("                       BANCO ALURA");
        System.out.println("Nome do Cliente:      " + nomeDoCliente);
        System.out.println("Tipo da Conta:        " + tipoDeConta);
        System.out.println("Saldo Atual da Conta: R$ " + saldoDaConta);
        System.out.println("****************************************************************");

    }
}
