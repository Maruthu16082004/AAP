package com.admission.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admission.university.repo.repo;
import com.admission.university.entity.entity;

import java.util.List;
@Service
public class service {
    @Autowired(required=true)
	private repo Re;
	public entity saveDetails(entity e)
	{
		return Re.save(e);
	}
	public List<entity> getDetails(){
		return Re.findAll();
	} 
	// public entity updateDetails(entity e) {
	// 	return Re.saveAndFlush(e);
	// }
	// public void deleteDetails(String username) {
	// 	Re.deleteById(username);
		
	// }
}
