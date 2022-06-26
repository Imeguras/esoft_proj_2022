package org.ipleiria.com;

import javax.swing.*;

import org.ipleiria.com.aux.*;
public class JanelaVeiculos extends Janela{
    private JPanel panel1;
    private JButton adicionarVeiculosButton;
    private JList veiculosList;
	
	public JanelaVeiculos() {
		frame = new JFrame("Veículos");
		frame.setContentPane(panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		adicionarVeiculosButton.addActionListener(e -> {
			JanelaAdicionarVeiculos janelaAdicionarVeiculos = new JanelaAdicionarVeiculos();
			janelaAdicionarVeiculos.getFrame().setVisible(true);
		});
	}
}
