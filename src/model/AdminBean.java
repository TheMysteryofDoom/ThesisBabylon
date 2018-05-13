package model;


public class AdminBean {

	
private int adminId;
	
	private String userName;
	private String password;
	private String emaill;
	private int contactNo;
	private String role;
	private String gender;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmaill() {
		return emaill;
	}
	public void setEmaill(String emaill) {
		this.emaill = emaill;
	}
	public int getContactNumber() {
		return contactNo;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNo = contactNumber;
	}
	public String getAdminRole() {
		return role;
	}
	public void setAdminRole(String role) {
		this.role = role;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}