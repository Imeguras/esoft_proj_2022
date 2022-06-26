package org.ipleiria.com;

import javax.swing.*;

import org.ipleiria.com.aux.*;

public class JanelaPrincipal extends Janela{
    private JButton VeiculosButton;
    private JPanel panel1;
	//on click VeiculosButton go to JanelaVeiculos
	public JanelaPrincipal() {
		super(); 
	 	frame = new JFrame("Veículos");
		frame.setContentPane(panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		VeiculosButton.addActionListener(e -> {
			JanelaVeiculos janelaVeiculos = new JanelaVeiculos(this);
			janelaVeiculos.getFrame().setVisible(true);
			this.frame.setVisible(false);
		});
	}


	@Override
	public void updateFrame() {

	}
}
