package lv.lgs.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure(); 
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings( 
		configuration.getProperties()).build(); 
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory( 
		serviceRegistry);
		Session ses = sessionFactory.openSession(); 
		Book book = new Book(); 
		ses.beginTransaction(); 
		ses.save(book); 
		ses.getTransaction().commit(); 
		ses.close();
	
	}

}
