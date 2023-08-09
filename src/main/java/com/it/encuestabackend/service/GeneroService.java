package com.it.encuestabackend.service;  


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.it.encuestabackend.dto.GeneroCountDTO;
import com.it.encuestabackend.model.Genero;  
import com.it.encuestabackend.repository.GeneroRepository; 
 
@Service  
public class GeneroService {

	@Autowired  
	GeneroRepository generoRepository;  
	
	public Genero getGeneroById(int id)   
	{  
	return generoRepository.findById(id).get();  
	}  
	public void saveOrUpdate(Genero student)   
	{  
		generoRepository.save(student);  
	}  
	
	public Long count() {
		return generoRepository.count();
	}
	public Long countByGenero(String genero) {
		// TODO Auto-generated method stub
		return generoRepository.countByGenero(genero);
	}  
	public ResponseEntity<Boolean> getGeneroByEmail(String email)   
	{  
	return generoRepository.findByEmail(email);  
	}  
	
	public boolean verificarEmailExistente(String email) {
        return generoRepository.existsByEmail(email);
    }
	
	public List<GeneroCountDTO> obtenerConteoGeneros() {
        List<Object[]> resultados = generoRepository.obtenerConteoGeneros();
        List<GeneroCountDTO> generosConteo = new ArrayList<>();

        for (Object[] resultado : resultados) {
            String nombreGenero = (String) resultado[0];
            Long conteo = (Long) resultado[1];
            generosConteo.add(new GeneroCountDTO(nombreGenero, conteo));
        }

        return generosConteo;
    }
	
}
