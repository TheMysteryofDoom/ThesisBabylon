package utility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {
	 private static SessionFactory sessionFactory;
	 private static ServiceRegistry serviceRegistry;
	 
	 public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	            // loads configuration and mappings
	            Configuration configuration = new Configuration().configure();
	       //             = new StandardServiceRegistryBuilder()
	         //           .applySettings(configuration.getProperties()).build();
	            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
	                    configuration.getProperties()).build();
	 
	            // builds a session factory from the service registry
	    //        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	          //  sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	        }
	 
	        
	 
	        return sessionFactory;
	    }
}
