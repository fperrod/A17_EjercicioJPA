package es.cursogetafe.ejerciciojpa.modelo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "personas")
public class Persona implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersona;
	
	private String apellidos;
	
	@OneToMany(mappedBy = "persona")	
	private List<Rol> roles;

	public int getIdPersona() {
		return idPersona;
	}

	public String getApellidos() {
		return apellidos;
	}
	
	public List<Rol> getRoles() {
		return roles;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
