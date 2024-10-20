package versao1;

import java.util.ArrayList;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cnivel3 objetoNivel3_1 = new Cnivel3 ("Susanoo Roxo");
		Cnivel3 objetoNivel3_2 = new Cnivel3 ("Chidori");
		Cnivel3 objetoNivel3_3 = new Cnivel3 ("Katana");
		
		Cnivel3 objetoNivel3_4 = new Cnivel3 ("Susanoo Laranja");
		Cnivel3 objetoNivel3_5 = new Cnivel3 ("Amateratsu");
		Cnivel3 objetoNivel3_6 = new Cnivel3 ("Corvo");
		
		Cnivel3 objetoNivel3_7 = new Cnivel3 ("Susanoo Azul");
		Cnivel3 objetoNivel3_8 = new Cnivel3 ("Meteoro");
		Cnivel3 objetoNivel3_9 = new Cnivel3 ("Rinnegan");
		
		ArrayList <Cnivel3> listaSasuke = new ArrayList <Cnivel3> ();
		listaSasuke.add(objetoNivel3_1);
		listaSasuke.add(objetoNivel3_2);
		listaSasuke.add(objetoNivel3_3);
		
		ArrayList <Cnivel3> listaItachi = new ArrayList <Cnivel3> ();
		listaItachi.add(objetoNivel3_4);
		listaItachi.add(objetoNivel3_5);
		listaItachi.add(objetoNivel3_6);
		
		ArrayList <Cnivel3> listaMadara = new ArrayList <Cnivel3> ();
		listaMadara.add(objetoNivel3_7);
		listaMadara.add(objetoNivel3_8);
		listaMadara.add(objetoNivel3_9);
		
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		
		Cnivel2 objetoNivel2_1 = new Cnivel2 ("Sasuke", listaSasuke);
		Cnivel2 objetoNivel2_2 = new Cnivel2 ("Itachi", listaItachi);
		Cnivel2 objetoNivel2_3 = new Cnivel2 ("Madara", listaMadara);
		
		ArrayList <Cnivel2> listaUchiha = new ArrayList <Cnivel2> ();
		listaUchiha.add(objetoNivel2_1);
		listaUchiha.add(objetoNivel2_2);
		listaUchiha.add(objetoNivel2_3);
		
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		
		Cnivel1 objetoNivel1_1 = new Cnivel1 ("Uchiha", listaUchiha);
		
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		/*for(Cnivel2 auxiliar : objetoNivel1_1.getNivel2()) {
			
			System.out.println ("Personagem : " + auxiliar.getNome());
			
			for(Cnivel3 auxiliar2 : auxiliar.getNivel3()) {
				
				System.out.println ("Jutsu : " + auxiliar2.getNome());
			}
		}
		
		
		Random gerador2 = new Random();
		ArrayList<Cnivel2> sorteio2 = objetoNivel1_1.getNivel2();
		int indiceAleatorio2 = gerador2.nextInt(objetoNivel1_1.getNivel2().size());
		Cnivel2 objetoAleatorio2 = objetoNivel1_1.getNivel2().get(indiceAleatorio2);
		System.out.println(objetoAleatorio2.getNome());
		
		Random gerador3 = new Random();
		ArrayList<Cnivel3> sorteio3 = objetoAleatorio2.getNivel3();
		int indiceAleatorio3 = gerador3.nextInt(objetoAleatorio2.getNivel3().size());
		Cnivel3 objetoAleatorio3 = objetoAleatorio2.getNivel3().get(indiceAleatorio3);
		System.out.println(objetoAleatorio3.getNome());*/
		
		Random gerador = new Random();

        int tamanhoLista = listaUchiha.size();

        int numeroAleatorio = gerador.nextInt(tamanhoLista);

        System.out.println(numeroAleatorio);

        for (int i = 0; i < tamanhoLista; i++) {
            if(numeroAleatorio == i) {
                System.out.println(listaUchiha.get(numeroAleatorio).getNome());

                Cnivel2 objetoSorteado = listaUchiha.get(numeroAleatorio);

                Random gerador2 = new Random();

                int tamanhoLista2 = objetoSorteado.getNivel3().size();

                int numeroAleatorio2 = gerador.nextInt(tamanhoLista2);

                System.out.println(numeroAleatorio2);

                for (int j = 0; j < tamanhoLista2; j++) {
                    if(numeroAleatorio2 == j) {
                        System.out.println(objetoSorteado.getNivel3().get(numeroAleatorio2).getNome());
                    }
                }
            }
        }

	}

}