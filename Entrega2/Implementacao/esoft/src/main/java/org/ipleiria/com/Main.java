package org.ipleiria.com;

import java.util.LinkedList;

import org.ipleiria.com.models.*;

public class Main {
	public static LinkedList<Veiculo> veiculos = new LinkedList<Veiculo>();
	public static LinkedList<Pessoa> clientes = new LinkedList<Pessoa>();
	public static LinkedList<Local> locais = new LinkedList<Local>();
    public static void main(String[] args) {
		//open JanelaPrincipal
		seed();
		JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
		janelaPrincipal.getFrame().setVisible(true);
		
    }
	public static void seed(){
		DonoEmpresa empresa_como_proprietario = new DonoEmpresa(); 
		Cliente cliente1= new Cliente(); 
		Cliente cliente2= new Cliente();
		Cliente cliente3= new Cliente();
		Cliente cliente4= new Cliente();
		clientes.add(empresa_como_proprietario);
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);

		Veiculo veiculo1 = new Veiculo("matricula", "marca", "modelo", empresa_como_proprietario, cliente1, 1, "caracteristicas", 3.0d, new Local(), System.currentTimeMillis()); 
		Veiculo veiculo2 = new Veiculo("matricula", "marca", "modelo", cliente2, empresa_como_proprietario, 10, "caracteristicas", 3.0d, new Local(), System.currentTimeMillis());
		Veiculo veiculo3 = new Veiculo("matricula", "marca", "modelo", empresa_como_proprietario, cliente3, 30, "caracteristicas", 3.0d, new Local(), System.currentTimeMillis());
		Veiculo veiculo4 = new Veiculo("matricula", "marca", "modelo", cliente4, empresa_como_proprietario, 4, "caracteristicas", 3.0d, new Local(), System.currentTimeMillis());
		veiculos.add(veiculo1);
		veiculos.add(veiculo2);
		veiculos.add(veiculo3);
		veiculos.add(veiculo4);
		//Local local1 = new Local("morada", "codigo_postal", "localidade", "pais");
		Local local1 = new Local();
		locais.add(local1);
	}
}