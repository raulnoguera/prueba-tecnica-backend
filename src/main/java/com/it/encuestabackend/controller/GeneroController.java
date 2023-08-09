package com.it.encuestabackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.it.encuestabackend.dto.GeneroCountDTO;

import com.it.encuestabackend.model.Genero;
import com.it.encuestabackend.service.GeneroService;  
@RestController  
@CrossOrigin(origins = "http://localhost:4200/")
public class GeneroController {

	@Autowired  
	GeneroService generoService;  
	
	@GetMapping("/contar")
	public Long contarUsuarios() {
	    return generoService.count();
	}

	@GetMapping("/contar-por-genero")
	public Long contarUsuariosPorName(@RequestParam String genero) {
	    return generoService.countByGenero(genero);
	}
	
	@GetMapping("/verificaremail")
	public ResponseEntity<Boolean> getGeneroByEmail(@RequestParam String email) {
		boolean emailExistente = generoService.verificarEmailExistente(email);
        return ResponseEntity.ok(emailExistente);
	}
	
	@PostMapping("/genero")  
	private int saveGenero(@RequestBody Genero genero)   
	{  
		generoService.saveOrUpdate(genero);  
	return genero.getId();  
	}  
	
	@GetMapping("/conteo")
    public List<GeneroCountDTO> obtenerConteoGeneros() {
        return generoService.obtenerConteoGeneros();
    }
}
