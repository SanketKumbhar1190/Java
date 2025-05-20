package com.cdac.acts.Day16;

import java.io.File;

public class FileCheck {
	
	public static void main(String[] args) {
		String path = "D:\\Javaa\\Practice\\src\\com\\cdac\\acts\\day4";
		File file = new File(path);
	
		 if (file.isDirectory()) {
	            System.out.println(path + " is a directory. Listing all files and directories:");
	            // List all files and directories in the specified directory
	            String[] filesList = file.list();
	            if (filesList != null) {
	                for (String item : filesList) {
	                    System.out.println(item);
	                }
	            }
	        } else if (file.isFile()) {
	            System.out.println(path + " is a file.");
	        } else {
	            System.out.println(path + " does not exist.");
	        }
	}
}
