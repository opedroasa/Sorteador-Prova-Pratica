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
				"ROMBOIDES/TRAPEZIO MEDIO", "BRAQUIAL","QUADRICEPS","TRICEPS SURAL","ISQUIOTIBIAIS","GLUTEOS (G.Max/G.Med)"},
				new String[] {"ISOMETRICO", "ISOTONICO - Concentrico", "ISOTONICO - Excentrico"}, new String[] {"CADEIA CINETICA ABERTA",
				"CADEIA CINETICA FECHADA"});
		
		sensorioMotor objetoSensorioMotor = new sensorioMotor (new String[] {"BASE ESTAVEL","BASE INSTAVEL"}, new String[] {"APOIO BIPODAL/BILATERAL",
				"APOIO UNIPODAL/UNILATERAL"}, new String [] {"FOCO EXTERNO","SEM FOCO EXTERNO"});
		
		estabilizacaoCentral objetoEstabilizacaoCentral = new estabilizacaoCentral (new String[] {"FASE I","FASE II","FASE III"});
		
		Random gerador = new Random();
		
		int numeroAleatorio = gerador.nextInt(5);
		
		switch (numeroAleatorio)
		{
		case 0:
			
			System.out.println (objetoFnp.getNome() + "\n");
			System.out.println (objetoFnp.sorteio1());
			System.out.println (objetoFnp.sorteio2());
			break;
		
		case 1:
			
			System.out.println (objetoAlongamento.getNome() + "\n");
			System.out.println (objetoAlongamento.sorteio1());
			System.out.println (objetoAlongamento.sorteio2());
			break;
			
		case 2:
			
			System.out.println (objetoExercicioResistido.getNome() + "\n");
			System.out.println (objetoExercicioResistido.sorteio1());
			System.out.println (objetoExercicioResistido.sorteio2());
			System.out.println (objetoExercicioResistido.sorteio3());
			break;
			
		case 3:
			
			System.out.println (objetoSensorioMotor.getNome() + "\n");
			System.out.println (objetoSensorioMotor.sorteio1());
			System.out.println (objetoSensorioMotor.sorteio2());
			System.out.println (objetoSensorioMotor.sorteio3());
			break;
			
		case 4:
			
			System.out.println (objetoEstabilizacaoCentral.getNome() + "\n");
			System.out.println (objetoEstabilizacaoCentral.sorteio1());
			break;
		
		default:
			
			System.out.println ("Erro, tente novamente :(");
			break;
		}

		new screen();
		

	}

}
