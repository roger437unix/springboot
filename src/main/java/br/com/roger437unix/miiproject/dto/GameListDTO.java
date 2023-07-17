package br.com.roger437unix.miiproject.dto;

import br.com.roger437unix.miiproject.entities.GameList;

public class GameListDTO {
	
	private Long id;	
	private String name;
	
	public GameListDTO() {		
	}

	public GameListDTO(GameList entity) {		
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}