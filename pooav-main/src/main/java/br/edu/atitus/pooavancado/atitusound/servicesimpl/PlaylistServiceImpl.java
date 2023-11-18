package br.edu.atitus.pooavancado.atitusound.servicesimpl;

import org.springframework.stereotype.Service;


import br.edu.atitus.pooavancado.atitusound.entities.PlaylistEntity;
import br.edu.atitus.pooavancado.atitusound.repositories.GenericRepository;
import br.edu.atitus.pooavancado.atitusound.repositories.PlaylistRepository;
import br.edu.atitus.pooavancado.atitusound.services.PlaylistService;

@Service
public class PlaylistServiceImpl implements PlaylistService{
	
	private final PlaylistRepository playlistRepository;
	
	public PlaylistServiceImpl(PlaylistRepository playlistRespository) {
		super();
		this.playlistRepository = playlistRespository;
	}

	@Override
	public GenericRepository<PlaylistEntity> getRepository(){
		return playlistRepository;
	}
}
