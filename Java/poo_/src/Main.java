class ReprodutorMusical {
    void tocar() {
        System.out.println("Tocando música...");
    }

    void pausar() {
        System.out.println("Música pausada.");
    }

    void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
}

class AparelhoTelefonico {
    void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    void atender() {
        System.out.println("Atendendo a chamada...");
    }

    void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}

class NavegadorInternet {
    void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}

// Classe principal para testar as funcionalidades
public class Main {
    public static void main(String[] args) {
        // Testando ReprodutorMusical
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.selecionarMusica("Imagine - John Lennon");
        reprodutor.tocar();
        reprodutor.pausar();

        // Testando AparelhoTelefonico
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("123-456-7890");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("https://www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
