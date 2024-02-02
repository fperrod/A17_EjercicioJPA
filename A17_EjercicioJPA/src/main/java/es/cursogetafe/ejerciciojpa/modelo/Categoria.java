package es.cursogetafe.ejerciciojpa.modelo;
import java.io.Serializable;

public class Categoria implements Serializable{

	private int idCategoria;
	
	private String categoria;
	private double salarioConvenio;
	
	
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getSalarioConvenio() {
		return salarioConvenio;
	}
	public void setSalarioConvenio(double salarioConvenio) {
		this.salarioConvenio = salarioConvenio;
	}
}
