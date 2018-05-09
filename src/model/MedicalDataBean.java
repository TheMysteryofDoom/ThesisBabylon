package model;

import java.io.File;



public class MedicalDataBean {

	private File fileUpload;
    private String fileUploadFileName;
    private String fileUploadContentType;
    private String filePathToSaveInDB;
    
	public File getFileUpload() {
		return fileUpload;
	}
	public void setFileUpload(File fileUpload) {
		this.fileUpload = fileUpload;
	}
	public String getFileUploadFileName() {
		return fileUploadFileName;
	}
	public void setFileUploadFileName(String fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}
	public String getFileUploadContentType() {
		return fileUploadContentType;
	}
	public void setFileUploadContentType(String fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}
	public String getFilePathToSaveInDB() {
		return filePathToSaveInDB;
	}
	public void setFilePathToSaveInDB(String filePathToSaveInDB) {
		this.filePathToSaveInDB = filePathToSaveInDB;
	}
	
	
	
}
