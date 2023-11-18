package br.edu.atitus.pooavancado.atitusound.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.pooavancado.atitusound.entities.ArtistEntity;
import br.edu.atitus.pooavancado.atitusound.entities.PlaylistEntity;
import br.edu.atitus.pooavancado.atitusound.entities.dtos.ArtistDTO;
import br.edu.atitus.pooavancado.atitusound.entities.dtos.PlaylistDTO;
import br.edu.atitus.pooavancado.atitusound.services.GenericService;

import br.edu.atitus.pooavancado.atitusound.services.PlaylistService;

@RestController
@RequestMapping("/playlists")
public class PlaylistsController extends GenericController<PlaylistEntity, PlaylistDTO>{
	
	private final PlaylistService playlistService;
	
	public PlaylistsController(PlaylistService playlistService) {
		super();
		this.playlistService = playlistService;
	}
	
	protected PlaylistEntity convertDTO2Entity(PlaylistDTO dto) {
		PlaylistEntity entidade = new PlaylistEntity();
		entidade.setName(dto.getName());
		entidade.setPublic_share(dto.getPublic_share());
		return entidade;
	}
	
	@Override
	protected GenericService<PlaylistEntity>getService(){
		return playlistService;
	}


}
