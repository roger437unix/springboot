package br.com.roger437unix.miiproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.roger437unix.miiproject.dto.GameDTO;
import br.com.roger437unix.miiproject.dto.GameMinDTO;
import br.com.roger437unix.miiproject.entities.Game;
import br.com.roger437unix.miiproject.repositories.GameRepository;


@Service						// Registrando um componente [Service] no Spring
public class GameService {
	
	@Autowired					// Injetando a camada Repository dentro da camada Service
	private GameRepository gameRepository;
		
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;		
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto =result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
