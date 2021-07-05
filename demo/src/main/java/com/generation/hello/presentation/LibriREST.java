package com.generation.hello.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.hello.model.Libro;

@RestController
@RequestMapping("/api")
public class LibriREST {

	
	@GetMapping("/saluta")
	public String hello() {
		return "ciao";	
	}
	
	@GetMapping("/libri")
	public Libro pippo() {
		
		return new Libro("Io, robot", 12);	
	}
	
}
