package com.educandoweb.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshopmongo.domain.Post;
import com.educandoweb.workshopmongo.repository.PostRepository;
import com.educandoweb.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	 
	
	public Post findById(String id) {
		Post user = repo.findOne(id);
		if(user == null) {
			throw new ObjectNotFoundException("objeto nao encontrado");
		}
		return user;
	}
	
	 
}
