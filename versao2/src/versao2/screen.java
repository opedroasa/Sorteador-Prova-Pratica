package versao2;
import javax.swing.*;
import java.awt.Color;
import java.awt.color.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Font;


public class screen extends JFrame {
	
	public screen()
	{
		setTitle("Soteador");
		setVisible(true);
		setSize(300,150);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		setLayout (null);
		
		JButton botao = new JButton ("Sortear");
		botao.setBounds(75,30,150,50);
		botao.setFont(new Font ("Arial", Font.BOLD, 32));
		botao.setForeground(new Color (255,255,255));
		botao.setBackground(new Color (255,0,0));
			
		add(botao);
		
		
		
		
		
	}

}
