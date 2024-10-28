package versao2;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		fnp objetoFnp = new fnp (new String[]{"CABECA","OMBRO","MEMBROS SUPERIORES","QUADRIL","MEMBROS INFERIORES"},
				new String[]{"PASSIVO", "ATIVO ASSISTIDO","ATIVO RESISTIDO"});
		
		alongamento objetoAlongamento = new alongamento (new String[] {"TRAPEZIO SUPERIOR","ESCALENOS","TRICEPS BRAQUIAL",
				"ILIOPSOAS","QUADRICEPS (R.F.)","ADUTORES DE QUADRIL","GASTROCNEMIO","SOLEO"}, new String[] {"PASSIVO",
				"INIBICAO RECIPROCA","CONTRACAO RELAXAMENTO"});

		exercicioResistido objetoExercicioResistido = new exercicioResistido (new String[] {"DELTOIDE (A/M/P)","MAGUITO ROTADOR (RM/RL)",
				"ROMBOIDES/TRAPEZIO MEDIO", "BRAQUIAL","QUADRICEPS","TRICEPS SURAL","ISQUIOTIBIAIS","GLUTEOS (G.MAX/G.MED)"},
				new String[] {"ISOMETRICO", "ISOTONICO - CONCENTRICO", "ISOTONICO - EXCENTRICO"}, new String[] {"CADEIA CINETICA ABERTA",
				"CADEIA CINETICA FECHADA"});
		
		sensorioMotor objetoSensorioMotor = new sensorioMotor (new String[] {"BASE ESTAVEL","BASE INSTAVEL"}, new String[] {"APOIO BIPODAL/BILATERAL",
				"APOIO UNIPODAL/UNILATERAL"}, new String [] {"FOCO EXTERNO","SEM FOCO EXTERNO"});
		
		estabilizacaoCentral objetoEstabilizacaoCentral = new estabilizacaoCentral (new String[] {"FASE I","FASE II","FASE III"});
		
		Random gerador = new Random();
		String sorteado = "";
		
		int numeroAleatorio = gerador.nextInt(5);
		
		switch (numeroAleatorio)
		{
		case 0:
			
			sorteado = objetoFnp.getNome() + "\n" + objetoFnp.sorteio1() + "\n" + objetoFnp.sorteio2();
	
			break;
		
		case 1:
			
			sorteado = objetoAlongamento.getNome() + "\n" + objetoAlongamento.sorteio1() + "\n" + objetoAlongamento.sorteio2();
			System.out.println (sorteado);
			break;
			
		case 2:
			
			sorteado = objetoExercicioResistido.getNome() + "\n" + objetoExercicioResistido.sorteio1() + "\n" + objetoExercicioResistido.sorteio2()
			+ "\n" + objetoExercicioResistido.sorteio3();
			break;
			
		case 3:
			
			sorteado = objetoSensorioMotor.getNome() + "\n" + objetoSensorioMotor.sorteio1() + "\n" + objetoSensorioMotor.sorteio2() + "\n" +
			objetoSensorioMotor.sorteio3();
			break;
			
		case 4:
			
			sorteado = objetoEstabilizacaoCentral.getNome() + "\n" + objetoEstabilizacaoCentral.sorteio1();
			break;
		
		default:
			
			sorteado = "Erro, tente novamente :(";
			break;
		}

		System.out.println (sorteado);
		//new screen();
		
		

	}

}
