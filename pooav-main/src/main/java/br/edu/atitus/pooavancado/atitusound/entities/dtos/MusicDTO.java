package br.edu.atitus.pooavancado.atitusound.entities.dtos;

import java.time.Duration;

public class MusicDTO {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public DTOOnUuid getArtist() {
		return artist;
	}

	public void setArtist(DTOOnUuid artist) {
		this.artist = artist;
	}

	private Duration duration;
	
	private String url;
	
	private DTOOnUuid artist; 

}
