package com.example.root.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="userFiles")
public class User {

	@Id
	private String id;
	private String email;
	private List<UserFile> files = new ArrayList<>();
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<UserFile> getFiles() {
		return files;
	}
	public void setFiles(List<UserFile> files) {
		this.files = files;
	}
	
	
	
	
}
