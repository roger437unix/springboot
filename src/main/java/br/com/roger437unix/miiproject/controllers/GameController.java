package br.com.roger437unix.miiproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.roger437unix.miiproject.dto.GameMinDTO;
import br.com.roger437unix.miiproject.services.GameService;


@RestController								// Configurar a classe para ser um Controller
@RequestMapping(value = "/games")  			// Criando recurso [rota]
public class GameController {
	
	@Autowired			// Injetando a camada Service dentro da camada Controller
	private GameService gameService;
	
	@GetMapping			// Mapeando com método Get do HTTP
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;		
	}
}
