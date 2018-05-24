package controller;

import java.sql.ResultSet;
import java.util.List;

import model.FetchDataBean;
import utility.FetchDataUtil;

import com.opensymphony.xwork2.ActionSupport;

public class FetchDataAction extends ActionSupport{
	List<FetchDataBean> dataList = null;
	ResultSet rs = null;
	String fetchData = null;
	FetchDataUtil util = null;
	
	
	
	
}
