package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity(name = "ForeignKeyAssoAccountEntity")
@Table (name ="patientemergencycontact", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ID")
})
public class EmergencyContactBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8396694675075444441L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer emergencyId;
	
	@Column(name = "FIRST_NAME", unique = false, nullable = false, length = 100)
	private String firstName;
	
	@Column(name = "LAST_NAME", unique = false, nullable = false, length = 100)
	private String lastName;
	
	@Column(name = "MIDDLE_NAME", unique = false, nullable = false, length = 100)
	private String middleName;
	
	@Column(name = "TYPE", unique = false, nullable = false, length = 100)
	private String type;
	
	@ManyToOne
	private PatientBean pb;
	
	public int getEmergencyId() {
		return emergencyId;
	}
	public void setEmergencyId(int emergencyId) {
		this.emergencyId = emergencyId;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
	
}
