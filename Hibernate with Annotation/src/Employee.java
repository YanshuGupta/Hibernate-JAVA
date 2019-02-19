import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Emp1")
public class Employee {
	
	@Id	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private int id;  
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	/*@Lob
	private String description;//description  varchar2(255)
	//to store 400 pages text  //description clob
	
	@Temporal(TemporalType.DATE)
	private Date joiningDate;*/
	
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	public String getFirstName() {  
	    return firstName;  
	}  
	public void setFirstName(String firstName) {  
	    this.firstName = firstName;  
	}  
	public String getLastName() {  
	    return lastName;  
	}  
	public void setLastName(String lastName) {  
	    this.lastName = lastName;  
	}  

}  