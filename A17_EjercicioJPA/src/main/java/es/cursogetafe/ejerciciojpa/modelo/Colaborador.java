package es.cursogetafe.ejerciciojpa.modelo;

import java.io.Serializable;

public class Colaborador extends Rol implements Serializable {

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
}
