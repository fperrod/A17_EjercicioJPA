package es.cursogetafe.ejerciciojpa.modelo;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "roles")
@Inheritance(strategy = InheritanceType.JOINED)
public class Rol implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRol;
	
	private String rol;
	
	@ManyToOne
	@JoinColumn(name ="idpersona")
	private Persona persona;

	private int getIdRol() {  // metodo publico o privado
		return idRol;
	}
	
	public String getRol() {
		return rol;
	}
	public int getIdPersona() {
		return persona.getIdPersona();
	}
	
	public String getApellidos() {
		return persona.getApellidos();
	}
	
	public Persona getPersona() {
		return persona;
	}
	
	public List<Rol> getRoles() {
		return persona.getRoles();
	}

	private void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	
	protected void setRol(String rol) {
		this.rol = rol;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
