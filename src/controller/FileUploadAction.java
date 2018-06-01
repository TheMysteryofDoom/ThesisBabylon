package controller;
import java.io.File;
import java.sql.Connection;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.Upload;
import model.PatientBean;
import utility.DBSQLOperation;
import utility.DBSingletonConnection;





public class FileUploadAction extends ActionSupport implements ModelDriven<Upload>,SessionAware,ServletRequestAware{	
    
	Upload md = new Upload();
	protected Map<String,Object> session;
	protected HttpServletRequest request;
	Connection connection = DBSingletonConnection.getConnection();
    public String execute(){
    	String Status = "error";
				
    	try{
    		//============
    		// use request.getParameter("patientID") for Patient ID
    		System.out.println(request.getParameter("patientID"));
    		//============
    		String filePath = "C:/Users/glenn_ailen/Desktop/My Private Property/3rd yr 1st term/entjava/thesis-ws/Upload";  // Path where uploaded file will be stored
	        System.out.println("Server path:" + filePath); // check your path in console
	        File fileToCreate = new File(filePath,md.getFileUploadFileName());// Create file name  same as original
	        FileUtils.copyFile(md.getFileUpload(), fileToCreate); // Just copy temp file content tos this file
	        System.out.println("Before: ");
	        md.setFilePathToSaveInDB(fileToCreate);
	        System.out.println(md.getFileUploadFileName());
	        if (DBSQLOperation.insertUpload(md, connection)) {
				System.out.println("Upload inserted to db successfully");
				System.out.println("After: ");
				System.out.println(md.getFileUploadFileName());
				System.out.println("-----------------------");
				System.out.println("Filepath " + fileToCreate);
			} else {
				System.out.println("After: ");
				System.out.println(md.getFileUploadFileName());
				System.err.println("Upload did not insert");
			}  
	        
		}catch(Exception e)
			 {
			 e.printStackTrace();
			            addActionError(e.getMessage());
			            return INPUT ;
			 
			 }
			 return SUCCESS;
			 }   
    
    @Override
	public void setServletRequest(HttpServletRequest req) {
		// TODO Auto-generated method stub
    	this.request = req;
	}

	@Override
	public void setSession(Map sess) {
		// TODO Auto-generated method stub
		this.session = sess;
	}

	@Override
	public Upload getModel() {
		// TODO Auto-generated method stub
		return md;
	}
	 
	}