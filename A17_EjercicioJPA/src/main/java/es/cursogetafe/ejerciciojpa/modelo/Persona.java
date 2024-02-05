package es.cursogetafe.ejerciciojpa.modelo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(idPersona);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return idPersona == other.idPersona;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", apellidos=" + apellidos + "]";
	}
	
	
}
