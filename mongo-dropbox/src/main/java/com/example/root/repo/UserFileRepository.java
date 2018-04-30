package com.example.root.repo;



import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.root.entities.User;
import com.example.root.entities.UserFile;

@Repository
public interface UserFileRepository extends MongoRepository<User, String> {

	public User findById(String id);
	
}
