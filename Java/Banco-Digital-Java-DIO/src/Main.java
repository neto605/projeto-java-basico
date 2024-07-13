public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "Rua A, 123");
        Conta cc = new Corrente();
        Conta poupanca = new Poupanca();

        cc.depositar(1000);
        cc.transferir((double) 200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}


