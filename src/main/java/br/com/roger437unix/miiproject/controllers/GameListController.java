package br.com.roger437unix.miiproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.roger437unix.miiproject.dto.GameListDTO;
import br.com.roger437unix.miiproject.dto.GameMinDTO;
import br.com.roger437unix.miiproject.services.GameListService;
import br.com.roger437unix.miiproject.services.GameService;


@RestController																// Configurar a classe para ser um Controller
@RequestMapping(value = "/lists")  											// Criando recurso [rota]
public class GameListController {
	
	@Autowired																// Injetando a camada Service dentro da camada Controller
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping																// Mapeando com método Get do HTTP
	public List<GameListDTO> findAll() {	
		List<GameListDTO> result = gameListService.findAll();
		return result;		
	}
	
	@GetMapping(value = "/{listId}/games")										// Mapeando com método Get do HTTP
	public List<GameMinDTO> findByList(@PathVariable Long listId) {	
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;		
	}
	
}