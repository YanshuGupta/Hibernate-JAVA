import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

// change option from create to update
public class DeleteRecord {
	
	private static SessionFactory factory; 
	
	public static void main(String[] args) {
		
		 factory=HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Employee user=(Employee)session.get(Employee.class,5);
		
		session.delete(user);
		
		tx.commit();
		session.close();
	}

}