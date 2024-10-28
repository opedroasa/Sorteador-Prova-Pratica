package versao3;

import java.util.Random;

public class sensorioMotor {
    public String nome;
    public String[] opcao1 = new String[2];
    public String[] opcao2 = new String[2];
    public String[] opcao3 = new String[2];

    public sensorioMotor(String[] opcao1, String[] opcao2, String[] opcao3) {
        this.nome = "SENSORIO MOTOR";
        this.opcao1 = opcao1;
        this.opcao2 = opcao2;
        this.opcao3 = opcao3;
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

    public String sorteio3() {
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(opcao3.length);
        return opcao3[numeroAleatorio];
    }
}
