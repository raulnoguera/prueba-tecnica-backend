package com.it.encuestabackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import com.it.encuestabackend.model.Genero;

public interface GeneroRepository extends CrudRepository<Genero, Integer>  
{
	Long countByGenero(String genero);

	ResponseEntity<Boolean> findByEmail(String email);

	boolean existsByEmail(String email);
	
	@Query("SELECT g.genero as genero, COUNT(g.genero) as votos FROM Genero g GROUP BY g.genero")
	List<Object[]> obtenerConteoGeneros();
}