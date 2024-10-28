package versao3;

import java.util.Random;

public class fnp {
    public String nome;
    public String[] opcao1 = new String[5];
    public String[] opcao2 = new String[3];

    public fnp(String[] opcao1, String[] opcao2) {
        this.nome = "FNP";
        this.opcao1 = opcao1;
        this.opcao2 = opcao2;
    }

    public String getNome() {
        return nome;
    }

    public String sorteio1() {
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(opcao1.length);
        return opcao1[numeroAleatorio];
    }

    public String sorteio2() {
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(opcao2.length);
        return opcao2[numeroAleatorio];
    }
}
