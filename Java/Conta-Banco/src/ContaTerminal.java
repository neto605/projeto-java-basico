import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println(" CRIAÇÃO DE CONTA NO BANCO DIO - SEJA BEM VINDO");
    
        double saldo = 1.412;


        
        System.out.println("Por favor, digite o número da conta:");
        int numConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Por gentileza, informe o seu nome completo:");
        String nomeCliente = scanner.next();

        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", Conta: " + numConta);
        System.out.println("Seu saldo já está disponível. Confira: " + saldo);

    }
}
