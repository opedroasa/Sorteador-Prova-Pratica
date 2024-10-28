package versao3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.util.Random;

public class tela extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblTexto1, lblTexto2, lblTexto3, lblTexto4;
    
    private fnp objetoFnp;
    private alongamento objetoAlongamento;
    private exercicioResistido objetoExercicioResistido;
    private sensorioMotor objetoSensorioMotor;
    private estabilizacaoCentral objetoEstabilizacaoCentral;

    public tela(fnp objetoFnp, alongamento objetoAlongamento, exercicioResistido objetoExercicioResistido,
                sensorioMotor objetoSensorioMotor, estabilizacaoCentral objetoEstabilizacaoCentral) {

        this.objetoFnp = objetoFnp;
        this.objetoAlongamento = objetoAlongamento;
        this.objetoExercicioResistido = objetoExercicioResistido;
        this.objetoSensorioMotor = objetoSensorioMotor;
        this.objetoEstabilizacaoCentral = objetoEstabilizacaoCentral;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 400);
        setResizable(false); 
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);

        contentPane.setBackground(Color.GRAY);
        setContentPane(contentPane);

        lblTexto1 = new JLabel("");
        lblTexto1.setBounds(50, 50, 350, 30);
        lblTexto1.setFont(new Font("Arial", Font.BOLD, 16));
        lblTexto1.setForeground(Color.WHITE);
        lblTexto1.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTexto1);

        lblTexto2 = new JLabel("");
        lblTexto2.setBounds(50, 90, 350, 30);
        lblTexto2.setFont(new Font("Arial", Font.BOLD, 16));
        lblTexto2.setForeground(Color.WHITE);
        lblTexto2.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTexto2);

        lblTexto3 = new JLabel("");
        lblTexto3.setBounds(50, 130, 350, 30);
        lblTexto3.setFont(new Font("Arial", Font.BOLD, 16));
        lblTexto3.setForeground(Color.WHITE);
        lblTexto3.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTexto3);

        lblTexto4 = new JLabel("");
        lblTexto4.setBounds(50, 170, 350, 30);
        lblTexto4.setFont(new Font("Arial", Font.BOLD, 16));
        lblTexto4.setForeground(Color.WHITE);
        lblTexto4.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTexto4);

        JButton btnSortear = new JButton("Sortear");
        btnSortear.setFont(new Font("Arial", Font.BOLD, 18));
        btnSortear.setForeground(Color.WHITE);
        btnSortear.setBackground(Color.RED);
        btnSortear.setBounds(150, 250, 150, 50);
        contentPane.add(btnSortear);
        
        JLabel lblNewLabel = new JLabel("Professor: Hugo Eduardo da S. Alexandre");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(110, 311, 256, 14);
        contentPane.add(lblNewLabel);

        btnSortear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sortearNovamente();
            }
        });

        sortearNovamente();
    }

    private void sortearNovamente() {
        Random gerador = new Random();
        String sorteado1 = "", sorteado2 = "", sorteado3 = "", sorteado4 = "";

        int numeroAleatorio = gerador.nextInt(5);

        switch (numeroAleatorio) {
        case 0:
            sorteado1 = objetoFnp.getNome();
            sorteado2 = objetoFnp.sorteio1();
            sorteado3 = objetoFnp.sorteio2();
            sorteado4 = "";
            break;
        case 1:
            sorteado1 = objetoAlongamento.getNome();
            sorteado2 = objetoAlongamento.sorteio1();
            sorteado3 = objetoAlongamento.sorteio2();
            sorteado4 = "";
            break;
        case 2:
            sorteado1 = objetoExercicioResistido.getNome();
            sorteado2 = objetoExercicioResistido.sorteio1();
            sorteado3 = objetoExercicioResistido.sorteio2();
            sorteado4 = objetoExercicioResistido.sorteio3();
            break;
        case 3:
            sorteado1 = objetoSensorioMotor.getNome();
            sorteado2 = objetoSensorioMotor.sorteio1();
            sorteado3 = objetoSensorioMotor.sorteio2();
            sorteado4 = objetoSensorioMotor.sorteio3();
            break;
        case 4:
            sorteado1 = objetoEstabilizacaoCentral.getNome();
            sorteado2 = objetoEstabilizacaoCentral.sorteio1();
            sorteado3 = "";
            sorteado4 = "";
            break;
        }

        lblTexto1.setText(sorteado1);
        lblTexto2.setText(sorteado2);
        lblTexto3.setText(sorteado3);
        lblTexto4.setText(sorteado4);
    }
}
