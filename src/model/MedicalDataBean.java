package model;


public class MedicalDataBean {
	//Will upload the DB (LEFT at NEXUS LAB).
	//Vital Signs
	private int patientId;
	private int medicalStatusid;
	private float bloodPressure;
	private float prcr;
	private float repiratoryRate;
	private float temperature;
	private float weight;
	private float height;
	
	//AnthropometricMeasurementsBean
	private float headCircumference;
	private float chestCircumference;
	private float Abdominal;
	
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getMedicalStatusid() {
		return medicalStatusid;
	}
	public void setMedicalStatusid(int medicalStatusid) {
		this.medicalStatusid = medicalStatusid;
	}
	public float getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(float bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	
	public float getPrcr() {
		return prcr;
	}
	public void setPrcr(float prcr) {
		this.prcr = prcr;
	}
	public float getRepiratoryRate() {
		return repiratoryRate;
	}
	public void setRepiratoryRate(float repiratoryRate) {
		this.repiratoryRate = repiratoryRate;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getHeadCircumference() {
		return headCircumference;
	}
	public void setHeadCircumference(float headCircumference) {
		this.headCircumference = headCircumference;
	}
	public float getChestCircumference() {
		return chestCircumference;
	}
	public void setChestCircumference(float chestCircumference) {
		this.chestCircumference = chestCircumference;
	}
	public float getAbdominal() {
		return Abdominal;
	}
	public void setAbdominal(float abdominal) {
		Abdominal = abdominal;
	}
	
	
	
}

