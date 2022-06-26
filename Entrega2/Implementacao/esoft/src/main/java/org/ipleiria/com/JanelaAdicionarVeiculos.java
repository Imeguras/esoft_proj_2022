package org.ipleiria.com;

import javax.swing.*;
import org.ipleiria.com.aux.*;

public class JanelaAdicionarVeiculos extends Janela {
    private JPanel panel1;
	
    public JanelaAdicionarVeiculos() {
		frame = new JFrame("Adicionar/Alterar Veiculo");
		frame.setContentPane(panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
	
}
