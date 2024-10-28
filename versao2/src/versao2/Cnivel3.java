package versao2;

import java.util.ArrayList;
import java.util.Random;


public class Cnivel3 {
	
	//ATRIBUTOS
	public String nome;
	public ArrayList<Cnivel4> nivel4;
	
	//CONSTRUTOR
	public Cnivel3(String nome, ArrayList<Cnivel4> nivel4) {
		this.nome = nome;
		this.nivel4 = nivel4;
	}
	
	public Cnivel3(String nome) {
		this.nome = nome;
	}

	//METODOS
	public String getNome() {
		return nome;
	}

	public ArrayList<Cnivel4> getNivel4() {
		return nivel4;
	}
	
	public Cnivel4 sorteio4() {
	    if (nivel4 != null && !nivel4.isEmpty()) {  
	        Random gerador = new Random();
	        int tamanhoLista = nivel4.size();
	        int numeroAleatorio = gerador.nextInt(tamanhoLista);
	        return nivel4.get(numeroAleatorio);
	    } else {
	        return new Cnivel4("-");
	    }
	}
}
