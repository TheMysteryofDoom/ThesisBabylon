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
@Table (name = "patientaddressregistry", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ID")
})
public class PatientAddressBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3020316239526679608L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer addressId;
	
	@Column(name = "STREET", unique = false, nullable = false, length = 50)
	private String street;
	
	@Column(name = "CITY", unique = false, nullable = false, length = 50)
	private String city;
	
	@Column(name = "COUNTRY", unique = false, nullable = false, length = 50)
	private String country;
	
	@Column(name = "ZIPCODE", unique = false, nullable = false)
	private int zipcode;
	
	@ManyToOne
	private PatientBean pb;
	
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public PatientBean getPb() {
		return pb;
	}
	public void setPb(PatientBean pb) {
		this.pb = pb;
	}
	

	
}
