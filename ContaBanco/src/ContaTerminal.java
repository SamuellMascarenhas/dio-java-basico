import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitar e ler o número da Agência
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        // Solicitar e ler o número da Conta
        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        // Solicitar e ler o nome Cliente
        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.next();

        // Solicitar e ler o saldo da Conta
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
  

        // Exibir a mensagem final
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");

        // Fechar o scanner
        scanner.close();
    }
}
