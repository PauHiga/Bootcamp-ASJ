package com.example.project.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.models.Persona;

@RestController
public class AlumnoController {

	List<Persona> personas = new ArrayList<Persona>(
		List.of(new Persona(1, "Bob", "Patiño", 9.5),
				new Persona(2, "Moe", "Scyslak", 4),
				new Persona(3, "Troy", "McLure", 2.6),
				new Persona(4, "Edna", "Krabaples", 8.7)
				)			
	);
			
	
	@GetMapping("/alumnos")
	public List<Persona> listPersonas() {
		return this.personas;
	}

	
	@GetMapping("/alumnos/{id}")
	public Persona getPersonaById(@PathVariable int id) {
		for(Persona persona : personas) {
			if(persona.getId() == id) {
				return persona;
			}
		}
		return null;
	}
	
	@DeleteMapping("/alumnos/{id}")
	public String deletePersonaById(@PathVariable int id) {
		for(Persona persona : this.personas) {
			if(persona.getId() == id) {
				this.personas.remove(persona);
				break;
			}
		}
		return "Eliminado el alumno " + id;
	}
	

	@PostMapping("/alumnos")
	public Persona postPersona(@RequestBody Persona persona) {
		this.personas.add(persona);
		return persona;
	}
	
	@PutMapping("/alumnos/{id}")
	public Persona postPersona(@PathVariable int id, @RequestBody Persona personaEditada) {
		for(Persona persona : this.personas) {
			if(persona.getId() == id) {
				personas.set(personas.indexOf(persona), personaEditada);
				break;
			}
		}
		return personaEditada;
	}
		
}
