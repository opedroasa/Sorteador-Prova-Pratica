package versao1;

import java.util.ArrayList;

public class Cnivel2 {
	
	public String nome;
	public ArrayList<Cnivel3> nivel3;
	
	public Cnivel2(String nome, ArrayList<Cnivel3> nivel3) {
		this.nome = nome;
		this.nivel3 = nivel3;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Cnivel3> getNivel3() {
		return nivel3;
	}
	
	
}
