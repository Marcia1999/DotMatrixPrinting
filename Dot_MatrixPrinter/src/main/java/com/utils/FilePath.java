package com.utils;


public class FilePath {


	public String getFilePath()
	{
		String FilePath = "";
		String workingDir = System.getProperty("user.dir");
		if( (System.getProperty("os.name")).startsWith("Windows")) //WindowsFilePath
		{
			FilePath=workingDir+"/webapps/ExportFiles/";
		//	FilePath = C:\\Users\\admin\eclipse-workspace\skydot\webapps\ExportFiles;
		}
		else  //LinuxFilePath
		{
		  	FilePath=workingDir+"/webapps/ExportFiles/";
		}
		return FilePath; 
		
	/*	
		String str1 = "";
	    String workingDir = System.getProperty("user.dir");
	    if (System.getProperty("os.name").startsWith("Windows")) {
//	      str1 = workingDir+"/webapps/ExportFiles";
	    	str1=workingDir+"/webapps/ExportFiles/";
	      //str1 = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\ExportFiles/";
	    } else { 
	     str1 = String.valueOf(workingDir) + "/webapps/ExportFiles/";
	      //str1=workingDir+"/webapps/ExportFiles/";
	    }  
	    return str1;   */
	}

	public String getFilePathImage()
	{
		
		String FilePathImage = "";
		String workingDir = System.getProperty("user.dir");
		if( (System.getProperty("os.name")).startsWith("Windows")) //WindowsFilePath
		{
			
			FilePathImage =workingDir+"/webapps/Asset/";
		}
		else  //LinuxFilePath
		{
			FilePathImage =workingDir+"/webapps/Asset/";
		}
		return FilePathImage; 
		
	/*	 String str1 = "";
		    String workingDir = System.getProperty("user.dir");
		    if (System.getProperty("os.name").startsWith("Windows")) {
		     // str1 = workingDir+"/webapps/";
		    	str1 =workingDir+"/webapps/Asset/";
//		      str1 = "E:/Femtosoft_prjct_file/Spring-workspace/";
		    } else { 
		      //str1 = String.valueOf(workingDir) + "/webapps/Explus_delivery_app_image/";
		    	str1 =String.valueOf(workingDir)+"/webapps/Asset/";
		    } 
		    return str1; */
	}



}
