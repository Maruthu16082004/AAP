package com.admission.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.admission.university.service.service;

import io.swagger.v3.oas.annotations.tags.Tag;

import com.admission.university.entity.entity;
import java.util.List;
@Controller
@CrossOrigin

public class controller {
	@Autowired
	service ser;
	
	@PostMapping("/post") 
	public entity addinfo(@RequestBody entity st)
	{
		return ser.saveDetails(st);
	}
	@Tag(name="Get User",description = "endpoint")
	@GetMapping("/get")
@ResponseBody // Add this annotation to indicate that the return value should be serialized directly to the response body
public List<entity> fetchDetails() {
    return ser.getDetails();
}

	// @PutMapping("/put")
	// 	public entity updateInfo(@RequestBody entity st)
	// 	{
	// 		return ser.updateDetails(st);
	// 	}
	// @DeleteMapping("/delete/{username}")
	//  String deleteInfo(@PathVariable("username") String username) {
	// 	ser.deleteDetails(username);
		// return "Deleted the data";
	}