package br.edu.atitus.pooavancado.atitusound.servicesimpl;

import org.springframework.stereotype.Service;

import br.edu.atitus.pooavancado.atitusound.entities.MusicEntity;
import br.edu.atitus.pooavancado.atitusound.repositories.GenericRepository;
import br.edu.atitus.pooavancado.atitusound.repositories.MusicRespository;
import br.edu.atitus.pooavancado.atitusound.services.MusicService;

@Service
public class MusicServiceImpl implements MusicService{
	
	private final MusicRespository repository;

	public MusicServiceImpl(MusicRespository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public GenericRepository<MusicEntity> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

}
