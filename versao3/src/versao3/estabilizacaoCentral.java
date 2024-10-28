package versao3;

import java.util.Random;

public class estabilizacaoCentral {
    public String nome;
    public String[] opcao1 = new String[3];

    public estabilizacaoCentral(String[] opcao1) {
        this.nome = "ESTABILIZACAO CENTRAL";
        this.opcao1 = opcao1;
    }

    public String getNome() {
        return nome;
    }

    public String sorteio1() {
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(opcao1.length);
        return opcao1[numeroAleatorio];
    }
}
