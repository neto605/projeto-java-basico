

public interface IConta {
    
    void sacar(double valor);
    void depositar(double valor);
    void transferir(Double valor, Conta ContaDestino);
    void imprimirExtrato();
}
