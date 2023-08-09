package com.it.encuestabackend.dto;

public class GeneroCountDTO {
	private String genero;
    private Long votos;
    
    public GeneroCountDTO(String genero, Long votos) {
        this.genero = genero;
        this.votos = votos;
    }
    public String getGenero()   
	{  
	return genero;  
	}  
	public void setGenero(String genero)   
	{  
	this.genero = genero;  
	}
	
	public Long getvotos()   
	{  
	return votos;  
	}  
	public void setvotos(Long votos)   
	{  
	this.votos = votos;  
	}  
}
