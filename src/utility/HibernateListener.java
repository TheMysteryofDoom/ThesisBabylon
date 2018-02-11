package utility;
import java.net.URL;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HibernateListener implements ServletContextListener  {
//	private Configuration config;
//	private SessionFactory factory;
	private static Class<HibernateListener> cls = HibernateListener.class;
	public static final String KEY_NAME = cls.getName();

	@Override
	public void contextDestroyed(ServletContextEvent arg) {
		// TODO Auto-generated method stub
	}

	@Override
	public void contextInitialized(ServletContextEvent arg) {
		try {
			URL url = HibernateListener.class.getResource("/hibernate.cfg.xml");
			
			SessionFactory sessionFactory = 
					new Configuration().configure(url).buildSessionFactory();
			
			arg.getServletContext().setAttribute(KEY_NAME, sessionFactory);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
