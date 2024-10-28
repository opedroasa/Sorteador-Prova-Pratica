package versao2;
import java.util.Random;

public class fnp {

	//ATRIBUTOS
	public String nome;
	public String[] opcao1 = new String[5];
	public String[] opcao2 = new String[3];
	
	//CONSTRUTOR
	public fnp(String[] opcao1, String[] opcao2) {
		nome = "FNP";
		this.opcao1 = opcao1;
		this.opcao2 = opcao2;
	}

	//METODOS
	public String getNome ()
	{
		return nome;
	}
	
	public String[] getOpcao1() {
		return opcao1;
	}

	public String[] getOpcao2() {
		return opcao2;
	}
	
	public String sorteio1 ()
	{
		Random gerador = new Random();
		int numeroAleatorio = gerador.nextInt(5);
		return opcao1[numeroAleatorio];
	}
	
	public String sorteio2 ()
	{
		Random gerador = new Random();
		int numeroAleatorio = gerador.nextInt(3);
		return opcao2[numeroAleatorio];
	}
	
}
