package org.ipleiria.com.models;

public class Veiculo {
    public String matricula;
    public String marca;
    public String modelo;
    public Pessoa anterior_dono;
    public Pessoa dono_cur;
    public Integer num_donos_previos;
    public String caracteristicas;
    public Double avaliacao_monetaria;
    public Local local;
	//field for time of last update
	public Long last_monetary_update;
	public int id;
	public static int global_id=0;
    // constructor for veiculo
	public Veiculo(String matricula, String marca, String modelo, Pessoa anterior_dono, Pessoa dono_cur, Integer num_donos_previos, String caracteristicas, Double avaliacao_monetaria, Local local, Long last_monetary_update) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anterior_dono = anterior_dono;
		this.dono_cur = dono_cur;
		this.num_donos_previos = num_donos_previos;
		this.caracteristicas = caracteristicas;
		this.avaliacao_monetaria = avaliacao_monetaria;
		this.local = local;
		this.last_monetary_update = last_monetary_update;
		global_id+=1;
		this.id=global_id;
	}
	
	//override to string in order to display all the strings of this object
	@Override
	public String toString() {
		//if any field is null then it will be displayed as "null"
		return this.id+"@Veiculo [matricula=" + (matricula == null ? "null" : matricula) + ", marca=" + (marca == null ? "null" : marca) + ", modelo=" + (modelo == null ? "null" : modelo) + ", anterior_dono=" + (anterior_dono == null ? "null" : anterior_dono) + ", dono_cur=" + (dono_cur == null ? "null" : dono_cur) + ", num_donos_previos=" + (num_donos_previos == null ? "null" : num_donos_previos) + ", caracteristicas=" + (caracteristicas == null ? "null" : caracteristicas) + ", avaliacao_monetaria=" + (avaliacao_monetaria == null ? "null" : avaliacao_monetaria) + ", local=" + (local == null ? "null" : local) + ", ultima avaliação="+ 
		//display the last monetary update in a readable format
		(last_monetary_update == null ? "null" : new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date(last_monetary_update))) + "]";
		
		
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setAnterior_dono(Pessoa anterior_dono) {
		this.anterior_dono = anterior_dono;
	}
	public void setDono_cur(Pessoa dono_cur) {
		this.dono_cur = dono_cur;
	}
	public void setNum_donos_previos(Integer num_donos_previos) {
		this.num_donos_previos = num_donos_previos;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public void setAvaliacao_monetaria(Double avaliacao_monetaria) {
		this.avaliacao_monetaria = avaliacao_monetaria;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public void setLast_monetary_update(Long last_monetary_update) {
		this.last_monetary_update = last_monetary_update;
	}
	public int getId(){
		return this.id;
	}
}
