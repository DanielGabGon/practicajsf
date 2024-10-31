package com.devpredator.practicajsf.entity;

import java.io.Serializable;

public class Restaurante implements Serializable {
	
	private String nombre;
	private String direccion;
	private String pais;
	private Gerente gerente;
	
    public void Restaurante() {
    	
    }
    
	public Restaurante() {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.pais = pais;
		this.gerente = gerente;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public Gerente getGerente() {
		return gerente;
	}


	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	

}
