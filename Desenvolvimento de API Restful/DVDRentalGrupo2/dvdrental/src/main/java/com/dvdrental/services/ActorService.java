package com.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvdrental.entities.Actor;
import com.dvdrental.repositories.ActorRepository;

@Service
public class ActorService {

	@Autowired
	public ActorRepository actorRepository;

	public Actor findById(Integer id) {
		Actor actor = actorRepository.findById(id).get();
		return actor;
	}

	public List<Actor> findAll() {
		List<Actor> listaActor = actorRepository.findAll();
		return listaActor;
	}

	public Long count() {
		Long totalActor = actorRepository.count();
		return totalActor;
	}

	public Actor save(Actor actor) {
		Actor novoActor = actorRepository.save(actor);

		if (novoActor.getActorId() != null) {
			return novoActor;
		} else {
			return null;
		}
	}

	public Actor update(Actor actor, Integer id) {
		actor.setActorId(id);
		// o this se refere ao actorRepository
		return this.save(actor);

//		Actor actor = actorRepository.findById(id).get();
//		atualizarDados(actor, novoActor);
//		return actorRepository.save(actor);
	}

}
