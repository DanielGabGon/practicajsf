package com.devpredator.practicajsf.controllers;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;

@ManagedBean
@ViewScoped
public class RestauranteController{
	
	/**
	 * 
	 */


	private RestauranteService restauranteService= new RestauranteService();
	
	private List<Restaurante> resturantes;
	
	private List<Restaurante> restaurantesFiltrados;

	public RestauranteController() {
	}
	
	@PostConstruct
	public void init() {
		listaRestaurantes();
	}


	public void listaRestaurantes(){
		this.resturantes=this.restauranteService.consultaRestaurantes();
	}

	public List<Restaurante> getResturantes() {
		return resturantes;
	}

	public void setResturantes(List<Restaurante> resturantes) {
		this.resturantes = resturantes;
	}

	/**
	 * @return the restaurantesFiltrados
	 */
	public List<Restaurante> getRestaurantesFiltrados() {
		return restaurantesFiltrados;
	}

	/**
	 * @param restaurantesFiltrados the restaurantesFiltrados to set
	 */
	public void setRestaurantesFiltrados(List<Restaurante> restaurantesFiltrados) {
		this.restaurantesFiltrados = restaurantesFiltrados;
	}





	

}
