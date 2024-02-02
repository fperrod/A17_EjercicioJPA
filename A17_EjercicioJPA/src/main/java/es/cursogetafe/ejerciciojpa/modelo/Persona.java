package es.cursogetafe.ejerciciojpa.modelo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Persona implements Serializable {

	private int idPersona;

	private String apellidos;
	private List<Rol> roles;

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
	public void addRol(Rol rol){
		if (roles == null) {
			roles = new ArrayList<Rol>();
		}
		roles.add(rol);
	}
}
