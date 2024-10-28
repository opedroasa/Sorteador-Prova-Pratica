package versao2;
import java.util.Random;


public class estabilizacaoCentral {

	//ATRIBUTOS
	public String nome;
	public String[] opcao1 = new String[3];
	
	//CONSTRUTOR
	public estabilizacaoCentral(String[] opcao1) {
		this.nome = "ESTABILIZACAO CENTRAL";
		this.opcao1 = opcao1;
	}

	//METODOS
	public String getNome() {
		return nome;
	}

	public String[] getOpcao1() {
		return opcao1;
	}
	
	public String sorteio1 ()
	{
		Random gerador = new Random();
		int numeroAleatorio = gerador.nextInt(3);
		return opcao1[numeroAleatorio];
	}
	
}
