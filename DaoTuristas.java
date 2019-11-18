package net.ug.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoTuristas {
	protected SessionFactory sessionFactory;
	
	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()  //lee los settings del archivo hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
	
	protected void crear(Turistas turistas) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(turistas);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Turistas read(int idTurista) {
		Session s =  sessionFactory.openSession();
		Turistas turistas = s.get(Turistas.class, idTurista);
		s.close();
		return turistas;
	}
	
	protected void update(Turistas turistas) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(turistas);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int idTurista) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Turistas turistas = new Turistas();
		turistas.setidTurista(idTurista);
		s.delete(turistas);
		s.getTransaction().commit();
		s.close();
	}

}
