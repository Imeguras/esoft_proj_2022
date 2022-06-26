package org.ipleiria.com;

import javax.swing.*;
import org.ipleiria.com.aux.*;
import org.ipleiria.com.models.*;
public class JanelaAdicionarVeiculos extends Janela {
    private JPanel panel1;
	//
	private JTextField matriculaTextField;
	private JTextField marcaTextField;
	private JTextField modeloTextField;
	//comboList for previous owner
	private JComboBox<Cliente> anteriorDonoComboBox;
	
	private JTextField numDonosPreviosTextField;
	private JTextField caracteristicasTextField;
	private JTextField avaliacaoMonetariaTextField;
	private JComboBox<Local> localComboBox;
	private JButton submitButton;
	private JButton cancelButton;
	//adicionar
    public JanelaAdicionarVeiculos(Janela anterior) {
		super(); 
		frame = new JFrame("Adicionar Veículo");
		frame.setContentPane(panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//populate ComboBox with previous owners, filter Main.clientes so that only of type CLientes are added
		anteriorDonoComboBox.setModel(new DefaultComboBoxModel<Cliente>(Main.clientes.stream().filter(c -> c instanceof Cliente).toArray(Cliente[]::new)));
		//anteriorDonoComboBox.setModel(new DefaultComboBoxModel<Cliente>(Main.clientes.toArray(new Cliente[Main.clientes.size()])));
		//populate ComboBox with locations
		localComboBox.setModel(new DefaultComboBoxModel<Local>(Main.locais.toArray(new Local[Main.locais.size()])));

		submitButton.setText("Adicionar Veiculo");
		cancelButton.addActionListener(e -> {
			anterior.getFrame().setVisible(true);
			this.frame.dispose();
			
		});
		//on submitButton go to JanelaVeiculos
		submitButton.addActionListener(e -> {
			Main.veiculos.add(new Veiculo(matriculaTextField.getText(), marcaTextField.getText(), modeloTextField.getText(), (Cliente)anteriorDonoComboBox.getSelectedItem(),null, Integer.parseInt(numDonosPreviosTextField.getText()), caracteristicasTextField.getText(), Double.parseDouble(avaliacaoMonetariaTextField.getText()), (Local)localComboBox.getSelectedItem()));
			anterior.getFrame().setVisible(true);
			this.frame.dispose();

		});
		frame.pack();
		frame.setVisible(true);
	}
	public JanelaAdicionarVeiculos(Janela anterior, int id) {
		frame = new JFrame("Editar Veículo");
		frame.setContentPane(panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//populate ComboBox with previous owners
		anteriorDonoComboBox.setModel(new DefaultComboBoxModel<Cliente>(Main.clientes.toArray(new Cliente[Main.clientes.size()])));
		//populate ComboBox with locations
		localComboBox.setModel(new DefaultComboBoxModel<Local>(Main.locais.toArray(new Local[Main.locais.size()])));
		cancelButton.addActionListener(e -> {
			anterior.getFrame().setVisible(true);
			this.frame.dispose();
			
		});
		submitButton.setText("Alterar Veiculo");
		submitButton.addActionListener(e -> {
			Veiculo a = Main.veiculos.get(Main.veiculos.indexOf(id));
			a.setMatricula(matriculaTextField.getText());
			a.setMarca(marcaTextField.getText());
			a.setModelo(modeloTextField.getText());
			a.setAnterior_dono((Cliente)anteriorDonoComboBox.getSelectedItem());
			a.setNum_donos_previos(Integer.parseInt(numDonosPreviosTextField.getText()));
			a.setCaracteristicas(caracteristicasTextField.getText());
			a.setAvaliacao_monetaria(Double.parseDouble(avaliacaoMonetariaTextField.getText()));
			a.setLocal((Local)localComboBox.getSelectedItem());
			//go back to JanelaVeiculos
			anterior.getFrame().setVisible(true);
			this.frame.dispose();

		}); 
	frame.pack();
	frame.setVisible(true);
	}


	@Override
	public void updateFrame() {
		
	}
}
