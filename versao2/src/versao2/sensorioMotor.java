package versao2;
import java.util.Random;

public class sensorioMotor {

	//ATRIBUTOS
	public String nome;
	public String[] opcao1 = new String[2];
	public String[] opcao2 = new String[2];
	public String[] opcao3 = new String[2];
	
	//CONSTRUTOR
	public sensorioMotor(String[] opcao1, String[] opcao2, String[] opcao3) {
		this.nome = "SENSORIO MOTOR";
		this.opcao1 = opcao1;
		this.opcao2 = opcao2;
		this.opcao3 = opcao3;
	}
	
	//METODOS
	public String getNome() {
		return nome;
	}
	public String[] getOpcao1() {
		return opcao1;
	}
	public String[] getOpcao2() {
		return opcao2;
	}
	public String[] getOpcao3() {
		return opcao3;
	}
	
	public String sorteio1 ()
	{
		Random gerador = new Random();
		int numeroAleatorio = gerador.nextInt(2);
		return opcao1[numeroAleatorio];
	}
	
	public String sorteio2 ()
	{
		Random gerador = new Random();
		int numeroAleatorio = gerador.nextInt(2);
		return opcao2[numeroAleatorio];
	}
	
	public String sorteio3 ()
	{
		Random gerador = new Random();
		int numeroAleatorio = gerador.nextInt(2);
		return opcao3[numeroAleatorio];
	}
}
