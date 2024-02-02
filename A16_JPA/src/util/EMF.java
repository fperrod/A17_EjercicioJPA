//package util;
//
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
////singleton para crear un unico objeto de la clase EntityManagerFactory
//public class EMF {
//	private static EntityManagerFactory emf;
//	
//	private EMF () {};
//
//	public static EntityManagerFactory getInstance() {
//		if (emf == null) {
//			emf = Persistence.createEntityManagerFactory("cursoJPA");
//		}
//		return emf;
//	}
//
//}


package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {
	private static EntityManagerFactory emf;
	
	private EMF() {}
	
	public static EntityManagerFactory getInstance() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("cursoJPA");
		}
		return emf;
	}
}
