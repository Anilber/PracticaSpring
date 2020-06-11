package com.example.demo;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Model.Persona;


@Controller
public class controlador {
	@GetMapping("/")
	
	public String Inicio(Model modelo) {
		
		Persona person = new Persona();
		person.setNombre("Anilber");
		person.setApellido("Aguilar");
		person.setTelefono("7627-0886");
		person.setEmail("ag0352032018@unab.edu.sv");
		
		Persona person2 = new Persona();
		person2.setNombre("Ernesto");
		person2.setApellido("Gomez");
		person2.setTelefono("2309-3979");
		person2.setEmail("anilber12aguilar@gmail.com");
		
		List personas = (List) Arrays.asList(person,person2);
		
		String mensaje="hola desde el controlador";
				modelo.addAttribute("saludo", mensaje);
				modelo.addAttribute("personas",personas);
		
		return "index";
	}
}
