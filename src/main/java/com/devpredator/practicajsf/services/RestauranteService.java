package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

public class RestauranteService {
	
	
	public List<Restaurante> consultaRestaurantes(){
		
		List<Restaurante> listaRestaurantes= new ArrayList<>();
		
		Restaurante restaurante1 = new Restaurante();
		restaurante1.setNombre("Juan guisos");
		restaurante1.setDireccion("Napoles 1");
		restaurante1.setPais("Italia");
		Gerente gerente1 = new Gerente("Juan","Perez","Alonso");
		restaurante1.setGerente(gerente1);
		listaRestaurantes.add(restaurante1);
		
		Restaurante restaurante2 = new Restaurante();
		restaurante2.setNombre("Mariscos y Mar");
		restaurante2.setDireccion("Acapulco colonia La costa ");
		restaurante2.setPais("México");
		Gerente gerente2 = new Gerente("Antonio","Cartagena","Armendariz");
		restaurante2.setGerente(gerente2);
		listaRestaurantes.add(restaurante2);
		
		Restaurante restaurante3 = new Restaurante();
		restaurante3.setNombre("La quesadilla rica");
		restaurante3.setDireccion("La lagunilla constitución");
		restaurante3.setPais("México");
		Gerente gerente3 = new Gerente("Pedro","Pancho","López");
		restaurante3.setGerente(gerente3);
		listaRestaurantes.add(restaurante3);
		
		Restaurante restaurante4 = new Restaurante();
		restaurante4.setNombre("El plato veloz");
		restaurante4.setDireccion("Calle la velocidad esquina aceleraión");
		restaurante4.setPais("EE UU");
		Gerente gerente4 = new Gerente("Bruno","Marts","Guillot");
		restaurante4.setGerente(gerente4);
		listaRestaurantes.add(restaurante4);
		
		Restaurante restaurante5 = new Restaurante();
		restaurante5.setNombre("El cal do gran caldo");
		restaurante5.setDireccion("Calle de la laguna esquina del Mar");
		restaurante5.setPais("Puerto Rico");
		Gerente gerente5 = new Gerente("Maria","Mendoza","Gutierrez");
		restaurante5.setGerente(gerente5);
		listaRestaurantes.add(restaurante5);
	
		return listaRestaurantes;
	}

}
