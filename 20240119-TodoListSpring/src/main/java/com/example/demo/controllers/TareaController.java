package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.TareaModel;
import com.example.demo.services.TareasService;

@RestController
@RequestMapping("/tareas")
public class TareaController {
	
	@Autowired
	TareasService tareasService;
	
	@GetMapping("/test")
	public ResponseEntity<String> testing() {
		return ResponseEntity.ok("algo");
	}

	@GetMapping()
	public ResponseEntity<List<TareaModel>> getTareas() {
		return ResponseEntity.ok(tareasService.obtenerTareas());	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<TareaModel>> getTareaById(@PathVariable Integer id) {
		return ResponseEntity.ok(tareasService.obtenerTareaPorId(id));	
	}
	
//	@PostMapping()
//	public ResponseEntity<TareaModel> createTarea(@RequestBody TareaModel tarea) {
//		return ResponseEntity.ok(tareasService.crearTarea(tarea));	
//	}
	
	@PostMapping()
	public ResponseEntity<String> createTarea(@RequestBody TareaModel tarea) {
		return ResponseEntity.ok(tareasService.crearTarea(tarea));	
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<TareaModel> updateTarea(@PathVariable Integer id, @RequestBody TareaModel tarea) {
		return ResponseEntity.ok(tareasService.modificarTarea(id, tarea));	
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<TareaModel> deletetarea(@PathVariable Integer id) {
		return ResponseEntity.ok(tareasService.eliminarTarea(id));	
	}
	
}
