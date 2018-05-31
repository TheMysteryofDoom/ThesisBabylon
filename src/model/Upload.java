package model;

import java.io.File;



public class Upload {
	private int fileID;
	private File fileUpload;
    private String fileUploadFileName;
    private String fileUploadContentType;
    private File filePathToSaveInDB;
    
    
    
	public int getFileID() {
		return fileID;
	}
	public void setFileID(int fileID) {
		this.fileID = fileID;
	}
	
    
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
	public File getFilePathToSaveInDB() {
		return filePathToSaveInDB;
	}
	public void setFilePathToSaveInDB(File filePathToSaveInDB) {
		this.filePathToSaveInDB = filePathToSaveInDB;
	}

	
	
}
