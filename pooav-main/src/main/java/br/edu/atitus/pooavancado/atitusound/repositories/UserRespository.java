package br.edu.atitus.pooavancado.atitusound.repositories;

import java.util.Optional;
import java.util.UUID;

import br.edu.atitus.pooavancado.atitusound.entities.UserEntity;

public interface UserRespository extends GenericRepository<UserEntity>{

	boolean existsByUsername(String username);
	
	boolean existsByUsernameAndUuidNot(String username, UUID uuid);
	
	Optional<UserEntity> findByUsername(String username);
	
}
