package br.com.roger437unix.miiproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.roger437unix.miiproject.dto.GameListDTO;
import br.com.roger437unix.miiproject.services.GameListService;


@RestController											// Configurar a classe para ser um Controller
@RequestMapping(value = "/lists")  						// Criando recurso [rota]
public class GameListController {
	
	@Autowired											// Injetando a camada Service dentro da camada Controller
	private GameListService gameListService;
	
	@GetMapping											// Mapeando com método Get do HTTP
	public List<GameListDTO> findAll() {	
		List<GameListDTO> result = gameListService.findAll();
		return result;		
	}
}
