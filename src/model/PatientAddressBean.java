package model;

import java.io.Serializable;


public class PatientAddressBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3020316239526679608L;

	
	private Integer addressId;
	

	private String street;
	

	private String city;
	

	private String country;
	

	private String zipcode;
	
	
	
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
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	


	
}
