package com.example.root.service;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.root.entities.User;
import com.example.root.entities.UserFile;
import com.example.root.repo.UserFileRepository;

@Service
public class MyFileStorageService {

	Logger log = LoggerFactory.getLogger(this.getClass().getName());

	@Autowired
	UserFileRepository fileRepo;

	public void saveFile(MultipartFile multipart, String email) throws IOException {

		User user = new User();
		user.setEmail(email);
		UserFile userFile = new UserFile();
		userFile.setFileName(multipart.getOriginalFilename());
		userFile.setFileSize(multipart.getSize());
		userFile.setFileBits(new Binary(BsonBinarySubType.BINARY, multipart.getBytes()));
		user.getFiles().add(userFile);
		fileRepo.save(user);

	}

	public List<User> getUsers() {

		return fileRepo.findAll();
	}

	public User getUser(String id) {
		// TODO Auto-generated method stub
		return fileRepo.findById(id);
	}

}
