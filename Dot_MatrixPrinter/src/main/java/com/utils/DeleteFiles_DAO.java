package com.utils;

import java.io.File;
import java.io.IOException;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class DeleteFiles_DAO {
//	private static final Logger log=LogManager.getLogger(DeleteFiles_DAO.class);
	public void deleteAllFiles() throws IOException 
	{
//		log.info("befor deleteAllFile");
			delete(1, ".xml");
			delete(1, ".xls");
			delete(1, ".pdf"); //Delete Before two minitues on current date
			delete(1, ".jpg"); 
			delete(1, ".zip");
			delete(1, ".txt");
//			log.info("After deleteAllFile");
 //Delete Before two minitues on current date
		
	}
	private void delete(long days, String fileExtension) throws IOException 
	{
//		log.info("befor fileDEletPath");
		FilePath fp = new FilePath();
		File folder = new File(fp.getFilePath()); 
		if (folder.exists()) 
		{
			File[] listFiles = folder.listFiles(); 
			//long eligibleForDeletion = System.currentTimeMillis() - (days * 24 * 60 * 60 * 1000L);
			long eligibleForDeletion = System.currentTimeMillis() - (2* 60 * 1000L);
			for (File listFile : listFiles) 
			{
				if (listFile.getName().endsWith(fileExtension) && listFile.lastModified() < eligibleForDeletion) 
				{
					if (!listFile.delete())
					{
						System.out.println("Sorry Unable to Delete Files..");
					} 
					}
				}
			}
//		log.info("After fileDEletPath");
	}
}
