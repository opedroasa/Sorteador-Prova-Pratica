package versao1;

import java.util.ArrayList;

public class Cnivel1 {
	
	public String nome;
	public ArrayList<Cnivel2> nivel2;
	
	public Cnivel1(String nome, ArrayList<Cnivel2> nivel2) {
		this.nome = nome;
		this.nivel2 = nivel2;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Cnivel2> getNivel2() {
		return nivel2;
	}
	
	
}
