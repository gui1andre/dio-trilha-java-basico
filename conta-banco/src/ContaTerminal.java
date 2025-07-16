import java.text.NumberFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Seja bem vindo!");
        System.out.println("Para prosseguir, por favor digite seu nome:");
        var nomeCliente = scanner.nextLine();
        System.out.printf("%s, digite o número da sua conta: \n", nomeCliente);
        var numeroConta = scanner.nextInt();
        System.out.printf("Agora, digite o número da agência: \n");
        var numeroAgencia = scanner.next();
        System.out.print("Por último, digite o saldo da conta: \n");
        var saldo = scanner.nextBigDecimal();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.",
                nomeCliente, numeroAgencia, numeroConta, NumberFormat.getCurrencyInstance().format(saldo));

        scanner.close();

    }
}
