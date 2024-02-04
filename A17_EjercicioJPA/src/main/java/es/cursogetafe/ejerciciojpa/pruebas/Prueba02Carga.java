package es.cursogetafe.ejerciciojpa.pruebas;

/*
 * dudas de como se tiene que gestionar 
 * src/main/java
 * src/main/resources que en un principio no estaba
 * src/main/pruebas se puede poner
 */



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.cursogetafe.ejerciciojpa.modelo.Categoria;
import es.cursogetafe.ejerciciojpa.modelo.Cliente;
import es.cursogetafe.ejerciciojpa.modelo.Colaborador;
import es.cursogetafe.ejerciciojpa.modelo.Empleado;
import es.cursogetafe.ejerciciojpa.modelo.Persona;
import es.cursogetafe.ejerciciojpa.modelo.Producto;

public class Prueba02Carga {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejercicioJPA");
		EntityManager em = emf.createEntityManager();
		
		Persona p1 = new Persona();
		p1.setApellidos("Marcos");
		
		Colaborador c1 = new Colaborador();
		c1.setNroProveedor(123456);
		c1.setServicio("Servicio Medico");
		c1.setPersona(p1);
		
//---------------------------------------------
//		
//		Persona p2 = new Persona();
//		p2.setApellidos("Lopez");
//		
//		Colaborador c2 = new Colaborador();
//		c2.setNroProveedor(123456);
//		c2.setServicio("Informatica");
//		c2.setPersona(p2);
////---------------------------------------------
//				
//		
////---------------------------------------------
//		Persona p4 = new Persona();
//		p4.setApellidos("Ramirez");
//		Cliente cli2 = new Cliente();
//		cli2.setCategoria("ESPORADICO");
//		cli2.setNroCliente(135);
//		cli2.setPersona(p4);

		em.getTransaction().begin();
		em.persist(p1);
		em.persist(c1);
//		em.persist(p2);
//		em.persist(p4);
//		em.persist(cli2);
//		em.persist(c2);
		em.getTransaction().commit();
		
//		Persona p3 = em.find(Persona.class, 2);
//		
//		Cliente cli1 = new Cliente();
//		cli1.setCategoria("VIP");
//		cli1.setNroCliente(12);
//		cli1.setPersona(p3);
//		
//		Producto pro1 = new Producto();
//		pro1.setPrecio(155.8);
//		pro1.setProducto("disco externo usb");
//		List<Cliente> clis = new ArrayList<Cliente>();
//		clis.add(cli1);
//		clis.add(cli2);
//		pro1.setClientes(clis);
//
//		Producto pro2 = new Producto();
//		pro2.setPrecio(12);
//		pro2.setProducto("cable hdmi 1.5m.");
//		clis = new ArrayList<Cliente>();
//		clis.add(cli2);
//		pro2.setClientes(clis);
//		
//		List<Producto> prods = new ArrayList<>();
//		prods.add(pro1);
//		cli1.setProductos(prods);
//		
//		prods = new ArrayList<>();
//		prods.add(pro1);
//		prods.add(pro2);
//		cli2.setProductos(prods);
//		
//
//		em.getTransaction().begin();
//		em.persist(pro1);
//		em.persist(pro2);
//		em.persist(cli1);
//		em.persist(cli2);
//		em.getTransaction().commit();
//		
//		
//		em.getTransaction().begin();
//		em.persist(cli1);
//		em.getTransaction().commit();

		
		//---------------------------------------------
		
//		Persona p5 = new Persona();
//		p5.setApellidos("Bustamante");
//
//		Empleado e1 = new Empleado();
//		e1.setNroEmpleado(12345);
//		e1.setPersona(p5);
//		
//		Categoria cat = new Categoria();
//		cat.setCategoria("ADMINISTRATIVO");
//		cat.setSalarioConvenio(1035.5);
//		e1.setCategoria(cat);
//		
//		
//		em.getTransaction().begin();
//		em.persist(p5);
//		em.persist(cat);
//		em.persist(e1);
//		em.getTransaction().commit();
//		
//		Colaborador cc = new Colaborador();
//		cc.setNroProveedor(123321);
//		cc.setServicio("Mantenimiento");
//		cc.setPersona(p5);
//
//		em.getTransaction().begin();
//		em.persist(cc);
//		em.getTransaction().commit();
		

		em.close();
		emf.close();
	}
}
