package org.ipleiria.com;

import javax.swing.*;

import org.ipleiria.com.aux.*;
public class JanelaVeiculos extends Janela{
    private JPanel panel1;
    private JButton adicionarVeiculosButton;
    private JList veiculosList;
    private JButton voltarButton;
	private JTextField filtroText;
	private JButton filtrarButton;

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
		voltarButton.addActionListener((e) -> {
			anterior.getFrame().setVisible(true);
			this.frame.setVisible(false);
		});
		//on filtrarButton, filter the list with the text in filtroText
		filtrarButton.addActionListener((e) -> {
			updateFrame();
		});
		
		frame.setVisible(true);
	}

	@Override
	public void updateFrame() {
		String filtro = filtroText.getText();
		if(filtro.isEmpty()){
			veiculosList.setListData(Main.veiculos.toArray());
		}else{
			veiculosList.setListData(Main.veiculos.stream().filter(v -> (v.toString().contains(filtro))).toArray());
		}
		
		frame.pack();
	}
}
