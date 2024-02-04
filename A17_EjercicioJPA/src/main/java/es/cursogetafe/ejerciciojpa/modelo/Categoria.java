package es.cursogetafe.ejerciciojpa.modelo;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategoria;
	
	private String categoria;

	@Basic(optional = false)
	private double salarioConvenio;
	
	public int getIdCategoria() {
		return idCategoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public double getSalarioConvenio() {
		return salarioConvenio;
	}
	
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public void setSalarioConvenio(double salarioConvenio) {
		this.salarioConvenio = salarioConvenio;
	}
}
