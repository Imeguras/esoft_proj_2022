package org.ipleiria.com;

import javax.swing.*;

import org.ipleiria.com.aux.*;
public class JanelaVeiculos extends Janela{
    private JPanel panel1;
    private JButton adicionarVeiculosButton;
    private JList veiculosList;
    private JButton voltarButton;

    public JanelaVeiculos(Janela anterior) {
		super(); 
		frame = new JFrame("Veículos");
		frame.setContentPane(panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		adicionarVeiculosButton.addActionListener(e -> {
			JanelaAdicionarVeiculos janelaAdicionarVeiculos = new JanelaAdicionarVeiculos(this);
			janelaAdicionarVeiculos.getFrame().setVisible(true);
			this.frame.setVisible(false);
			//frame.dispose();
		});

		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void updateFrame() {
		veiculosList.setListData(Main.veiculos.toArray());

	}
}
