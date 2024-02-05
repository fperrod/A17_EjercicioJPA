package es.cursogetafe.ejerciciojpa.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "colaboradores")
public class Colaborador extends Rol{

	private int nroProveedor;
	private String servicio;
	
	public Colaborador(){
		setRol("COLABORADOR");
	}

	public int getNroProveedor() {
		return nroProveedor;
	}

	public void setNroProveedor(int nroProveedor) {
		this.nroProveedor = nroProveedor;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	@Override
	public String toString() {
		return "Colaborador [nroProveedor=" + nroProveedor + ", servicio=" + servicio + "]";
	}
	
	
}
