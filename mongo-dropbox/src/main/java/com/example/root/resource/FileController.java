package com.example.root.resource;

import java.io.IOException;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.root.entities.User;
import com.example.root.entities.UserFile;
import com.example.root.service.MyFileStorageService;



@RestController
public class FileController<UserFile> {

	private MyFileStorageService service;
	
	
	
	public FileController(MyFileStorageService service) {
	
		this.service = service;
	}

    @GetMapping("/")
    public String getRoot(Model model){
    	
    	return "uploadForm";
    }
    
    @GetMapping("/listusers")
    public List<User> getAllUsers(){
    	    return (List<User>) service.getUsers();
    	
    }
    @GetMapping("/listuser/{id}")
    public User getUser(@PathVariable("id") String id){
    	    return  service.getUser(id);
    	
    }
    
	@PostMapping("/")
	public String handleFileUpload(@RequestParam("file") MultipartFile file,@RequestParam("email") String email, Model model){
		
		try {
			
			service.saveFile(file, email);
			model.addAttribute("message", "Your file is uploaded successfully ::"+ file.getOriginalFilename());
		} catch (IOException e) {
			
			model.addAttribute("message", "failed to upload file with name: " + file.getOriginalFilename());
		}
		return "uploadForm";
	}
	
	
	
}
