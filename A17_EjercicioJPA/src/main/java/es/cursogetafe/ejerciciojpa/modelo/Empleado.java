package es.cursogetafe.ejerciciojpa.modelo;


public class Empleado extends Rol {

	private int nroEmpleado;
	private Categoria categoria;

	public Empleado(){
		setRol("EMPLEADO");
	}
	
	public int getNroEmpleado() {
		return nroEmpleado;
	}

	public void setNroEmpleado(int nroEmpleado) {
		this.nroEmpleado = nroEmpleado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
