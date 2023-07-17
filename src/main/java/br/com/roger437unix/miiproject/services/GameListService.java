package br.com.roger437unix.miiproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.roger437unix.miiproject.dto.GameListDTO;
import br.com.roger437unix.miiproject.entities.GameList;
import br.com.roger437unix.miiproject.repositories.GameListRepository;


@Service											// Registrando um componente [Service] no Spring
public class GameListService {
	
	@Autowired										// Injetando a camada Repository dentro da camada Service
	private GameListRepository gameListRepository;
		
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();		
	}
}