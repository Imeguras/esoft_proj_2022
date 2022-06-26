package org.ipleiria.com;

import javax.swing.*;

import org.ipleiria.com.aux.*;

public class JanelaPrincipal extends Janela{
    private JButton VeiculosButton;
    private JPanel panel1;
	//on click VeiculosButton go to JanelaVeiculos
	public JanelaPrincipal() {
	 	frame = new JFrame("Veículos");
		frame.setContentPane(panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		VeiculosButton.addActionListener(e -> {
			JanelaVeiculos janelaVeiculos = new JanelaVeiculos();
			janelaVeiculos.getFrame().setVisible(true);
		});
	}

}
