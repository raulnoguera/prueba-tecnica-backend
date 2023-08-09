package com.it.encuestabackend.model;
import jakarta.persistence.Column;  
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;  
import jakarta.persistence.Table;  

@Entity  
@Table  
public class Genero {
	@Id  
	@Column  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;  
	@Column  
	private String email;  
	@Column  
	private String genero;
	
	public int getId()   
	{  
	return id;  
	}  
	public void setId(int id)   
	{  
	this.id = id;  
	}  
	public String getGenero()   
	{  
	return genero;  
	}  
	public void setGenero(String genero)   
	{  
	this.genero = genero;  
	}  
	
	public String getEmail()   
	{  
	return email;  
	}  
	public void setEmail(String email)   
	{  
	this.email = email;  
	}  
}
