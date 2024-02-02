package es.cursogetafe.ejerciciojpa.modelo;
import java.io.Serializable;
import java.util.List;

public class Rol implements Serializable {
	
	private int idRol;
	
	private String rol;
	private Persona persona;

	private int getIdRol() {
		return idRol;
	}

	private void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getRol() {
		return rol;
	}

	protected void setRol(String rol) {
		this.rol = rol;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public int getIdPersona() {
		return persona.getIdPersona();
	}

	public String getApellidos() {
		return persona.getApellidos();
	}

	public List<Rol> getRoles() {
		return persona.getRoles();
	}
}
