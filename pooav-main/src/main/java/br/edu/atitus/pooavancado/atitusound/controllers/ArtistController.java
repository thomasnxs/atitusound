package br.edu.atitus.pooavancado.atitusound.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.pooavancado.atitusound.entities.ArtistEntity;
import br.edu.atitus.pooavancado.atitusound.entities.dtos.ArtistDTO;
import br.edu.atitus.pooavancado.atitusound.services.ArtistService;
import br.edu.atitus.pooavancado.atitusound.services.GenericService;

@RestController
@RequestMapping("/artists")
public class ArtistController extends GenericController<ArtistEntity, ArtistDTO>{
	
	private final ArtistService artistService;
	
	public ArtistController(ArtistService artistService) {
		super();
		this.artistService = artistService;
	}
	
	protected ArtistEntity convertDTO2Entity(ArtistDTO dto) {
		ArtistEntity entidade = new ArtistEntity();
		entidade.setName(dto.getName());
		entidade.setImage(dto.getImage());
		return entidade;
	}
	
	@Override
	protected GenericService<ArtistEntity>getService(){
		return artistService;
	}

}
