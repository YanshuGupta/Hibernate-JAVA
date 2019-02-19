import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class UpdateTable {

	
		private static SessionFactory factory; 
		public static void main(String[] args) {
			
			 factory=HibernateUtil.getSessionFactory();
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			Employee user=(Employee)session.get(Employee.class,5);
			
			user.setFirstName("updated name1");
			user.setLastName("Up last");
			session.update(user);
			session.update(user);
			tx.commit();
			session.close();

	}

}