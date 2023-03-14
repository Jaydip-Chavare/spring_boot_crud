package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Students;
import com.example.repository.StudentsRepository;

@RestController
public class StudentsController {
	@Autowired
	StudentsRepository sr;
	
	@PostMapping("/savestd")
	public void saveStd(@RequestBody Students s) {
		sr.save(s);
	}
	
	@GetMapping("/getstd")
	public List<Students> getStd() {
		return sr.findAll();	
	}
	
	@PutMapping("updatestd")
	public void updatestd(@RequestBody Students s) {
		sr.save(s);
	}
	
	@DeleteMapping("/deletestd")
	public void deletestd(@RequestParam int id) {
		sr.deleteById(id);
		
	}

}
