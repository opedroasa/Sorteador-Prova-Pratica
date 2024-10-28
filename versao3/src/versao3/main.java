package versao3;

import java.awt.EventQueue;

public class main {

    public static void main(String[] args) {

        fnp objetoFnp = new fnp(new String[] { "CABECA", "OMBRO", "MEMBROS SUPERIORES", "QUADRIL", "MEMBROS INFERIORES" },
                new String[] { "PASSIVO", "ATIVO ASSISTIDO", "ATIVO RESISTIDO" });

        alongamento objetoAlongamento = new alongamento(new String[] { "TRAPEZIO SUPERIOR", "ESCALENOS", "TRICEPS BRAQUIAL", "ILIOPSOAS", 
                "QUADRICEPS (R.F.)", "ADUTORES DE QUADRIL", "GASTROCNEMIO", "SOLEO" }, new String[] { "PASSIVO", "INIBICAO RECIPROCA", 
                "CONTRACAO RELAXAMENTO" });

        exercicioResistido objetoExercicioResistido = new exercicioResistido(
                new String[] { "DELTOIDE (A/M/P)", "MANGUITO ROTADOR (RM/RL)", "ROMBOIDES/TRAPEZIO MEDIO", "BRAQUIAL", "QUADRICEPS", 
                        "TRICEPS SURAL", "ISQUIOTIBIAIS", "GLUTEOS (G.MAX/G.MED)" },
                new String[] { "ISOMETRICO", "ISOTONICO - CONCENTRICO", "ISOTONICO - EXCENTRICO" },
                new String[] { "CADEIA CINETICA ABERTA", "CADEIA CINETICA FECHADA" });

        sensorioMotor objetoSensorioMotor = new sensorioMotor(new String[] { "BASE ESTAVEL", "BASE INSTAVEL" },
                new String[] { "APOIO BIPODAL/BILATERAL", "APOIO UNIPODAL/UNILATERAL" }, new String[] { "FOCO EXTERNO", "SEM FOCO EXTERNO" });

        estabilizacaoCentral objetoEstabilizacaoCentral = new estabilizacaoCentral(new String[] { "FASE I", "FASE II", "FASE III" });

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    tela frame = new tela(objetoFnp, objetoAlongamento, objetoExercicioResistido, objetoSensorioMotor,
                            objetoEstabilizacaoCentral);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
