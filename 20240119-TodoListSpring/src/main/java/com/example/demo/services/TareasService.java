package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.TareaModel;
import com.example.demo.repositories.TareaRepository;

@Service
public class TareasService {

	@Autowired
	TareaRepository tareaRepository;
	
	//obtener tareas
	public List<TareaModel> obtenerTareas(){
		return tareaRepository.findAll();
	}
	
	//obtener tarea por id
	public Optional<TareaModel> obtenerTareaPorId(int id) {
		return tareaRepository.findById(id);
	}
	
	//crear tarea
//	public TareaModel crearTarea(TareaModel tarea) {
//		tareaRepository.save(tarea);
//		return tarea;
//	}
	
	//crear tarea
	public String crearTarea(TareaModel tarea) {
		tareaRepository.save(tarea);
		return "Esto es un string";
	}
		
	//eliminar tarea
	public TareaModel eliminarTarea(int id) {
		tareaRepository.deleteById(id);
		return null;
	}
	
	//modificar tarea
	public TareaModel modificarTarea(int id, TareaModel tarea) {
		TareaModel t =  tareaRepository.findById(id).get();
		if(t != null) {
			t.setTask(tarea.getTask());
			t.setDate(tarea.getDate());
			t.setCompleted(tarea.isCompleted());
			t.setDeleted(tarea.isDeleted());
			tareaRepository.save(t);
			return tarea;
		}
		return tarea;
	}
	
}
