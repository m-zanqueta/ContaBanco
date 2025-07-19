import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        var conta = scanner.nextInt();

        System.out.println("Por favor, digite o número a agência:");
        var agencia = scanner.nextInt();

        System.out.println("Por favor, digite seu nome:");
        var nome = scanner.next();

        System.out.println("Por favor, digite o saldo:");
        var saldo = scanner.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nome, agencia, conta, saldo);
    }
}
