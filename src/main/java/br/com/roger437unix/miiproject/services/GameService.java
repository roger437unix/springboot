package br.com.roger437unix.miiproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.roger437unix.miiproject.dto.GameMinDTO;
import br.com.roger437unix.miiproject.entities.Game;
import br.com.roger437unix.miiproject.repositories.GameRepository;


@Service						// Registrando um componente [Service] no Spring
public class GameService {
	
	@Autowired				// Injetando a camada Repository dentro da camada Service
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto =result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
