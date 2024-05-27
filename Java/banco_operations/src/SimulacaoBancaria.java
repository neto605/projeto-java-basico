import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

    //System.out.println("Selecione a opção desejada: 1 - DEPÓSITO | 2 - SAQUE | 3 - SALDO | 0 - SAIR");

        while (continuar) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double depositado = scanner.nextDouble();
                    saldo = depositado + saldo;
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;
                case 2:
                    double sacado = scanner.nextDouble();

                    if (saldo >= sacado) {
                        saldo = saldo - sacado;
                        System.out.printf("Saldo atual: R$ %.2f\n", saldo);

                    } else {
                        System.out.println("Saldo insuficente");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);

                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
