package utility;
import model.AccessBean;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

//Session for DB
public class User {
	public boolean find(String username, String password){
		  Session session = HibernateUtil.getSessionFactory().openSession();
		  //session.beginTransaction();
		  String sql = " from login u where u.uname=:username and u.pwd=:password";
	        Query query = session.createQuery(sql);
	        query.setParameter("username", username);
	        query.setParameter("password", password);
	        List<AccessBean> list = query.list();
	        if (list.size() > 0) {
	            session.close();
	            return true;
	        }
	        session.close();
	        return false;
	    }
	}


