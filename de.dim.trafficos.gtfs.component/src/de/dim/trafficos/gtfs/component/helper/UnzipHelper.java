/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.trafficos.gtfs.component.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * 
 * @author ilenia
 * @since Jul 17, 2023
 */
public class UnzipHelper {
	
	private static final Logger LOGGER = Logger.getLogger(UnzipHelper.class.getName());
	
	public static void unzipFile(String fileToUnzip, String targetFolder) {
		LOGGER.info("unzipping: " + fileToUnzip + " to " + targetFolder);
		String fileZip = fileToUnzip;
        File destDir = new File(targetFolder);
        deleteDirectory(destDir);

        byte[] buffer = new byte[1024];
        try(ZipInputStream zis = new ZipInputStream(new FileInputStream(fileZip));) {
        	   ZipEntry zipEntry = zis.getNextEntry();
               while (zipEntry != null) {
            	   File newFile = newFile(destDir, zipEntry);
            	    if (zipEntry.isDirectory()) {
            	        if (!newFile.isDirectory() && !newFile.mkdirs()) {
            	            throw new IOException("Failed to create directory " + newFile);
            	        }
            	    } else {
            	        // fix for Windows-created archives
            	        File parent = newFile.getParentFile();
            	        if (!parent.isDirectory() && !parent.mkdirs()) {
            	            throw new IOException("Failed to create directory " + parent);
            	        }

            	        // write file content
            	        FileOutputStream fos = new FileOutputStream(newFile);
            	        int len;
            	        while ((len = zis.read(buffer)) > 0) {
            	            fos.write(buffer, 0, len);
            	        }
            	        fos.close();
            	    }
            	    zipEntry = zis.getNextEntry();
               }

               zis.closeEntry();
        } catch(IOException e) {
        	LOGGER.log(Level.SEVERE, "Could not unzip " + fileToUnzip + " to " + targetFolder, e);
        }
     
       
	}
	
	public static File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
	    File destFile = new File(destinationDir, zipEntry.getName());

	    String destDirPath = destinationDir.getCanonicalPath();
	    String destFilePath = destFile.getCanonicalPath();

	    if (!destFilePath.startsWith(destDirPath + File.separator)) {
	        throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
	    }

	    return destFile;
	}
	
	private static boolean deleteDirectory(File directoryToBeDeleted) {
	    File[] allContents = directoryToBeDeleted.listFiles();
	    if (allContents != null) {
	        for (File file : allContents) {
	            deleteDirectory(file);
	        }
	    }
	    return directoryToBeDeleted.delete();
	}

}
