package br.com.roger437unix.miiproject.dto;

import br.com.roger437unix.miiproject.entities.Game;

public class GameMinDTO {	
	private Long id;
	private String title;	
	private Integer year;	
	private String imgUrl;	
	private String shortDescription;
	
	public GameMinDTO() {		
	}

	public GameMinDTO(Game entity) {		
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getshortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
	
	
	
}
