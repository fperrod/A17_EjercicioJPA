package es.cursogetafe.ejerciciojpa.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente extends Rol {

	@Basic(optional = false)
	private int nroCliente;
	
	private String categoria;
	
	@ManyToMany(mappedBy = "clientes") //mapeado en clase producto, atributo clientes
	private List<Producto> productos;
	
	public Cliente(){
		setRol("CLIENTE");
	}

	public int getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
}
