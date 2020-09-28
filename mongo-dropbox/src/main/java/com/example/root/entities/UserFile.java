package com.example.root.entities;

import org.bson.types.Binary;

public class UserFile {

	
	private String fileName;
	private double fileSize;
    private Binary fileBits;
    
    public UserFile() {
		
	}
    
	public UserFile(String fileName, double fileSize, Binary fileBits) {
		
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.fileBits = fileBits;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public double getFileSize() {
		return fileSize;
	}
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}
	public Binary getFileBits() {
		return fileBits;
	}
	public void setFileBits(Binary fileBits) {
		this.fileBits = fileBits;
	}
	
    
}
