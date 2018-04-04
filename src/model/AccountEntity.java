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

@Entity
@Table(name = "ACCOUNT", uniqueConstraints  = {
		@UniqueConstraint(columnNames = "ID")
})
public class AccountEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer accountID;
	
	@Column(name = "ACC_NUMBER", unique = true, nullable = false, length = 100)
	private String accountNumber;
	
	@ManyToOne
	private PatientBean pb;

	public Integer getAccountID() {
		return accountID;
	}

	public void setAccountID(Integer accountID) {
		this.accountID = accountID;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public PatientBean getPb() {
		return pb;
	}

	public void setPb(PatientBean pb) {
		this.pb = pb;
	}
	
	

}
