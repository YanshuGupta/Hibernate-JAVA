import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class MainApp {

	private static SessionFactory factory; 
	
	public static void main(String[] args) {
		
		 factory = HibernateUtil.getSessionFactory();
		
		if(factory!=null){
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			Employee user=new Employee();
			user.setFirstName("user 1");
			user.setLastName("last");
			session.save(user);
			
			tx.commit();
			session.close();
      
			ReadData();
		}
		else
			System.out.println("Session factory is null");

	}

	private static void ReadData() {
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Employee user=(Employee)session.get(Employee.class,5);
		System.out.println(user.getFirstName());
		tx.commit();
		session.close();
		
	}
}