package com.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvdrental.entities.Film;
import com.dvdrental.repositories.FilmRepository;
@Service
public class FilmService {

		@Autowired
		public FilmRepository filmRepository;

		public Film findById(Integer id) {
			Film film = filmRepository.findById(id).get();
			return film;
		}

		public List<Film> findAll() {
			List<Film> listaFilm = filmRepository.findAll();
			return listaFilm;
		}

		public Long count() {
			Long totalFilm = filmRepository.count();
			return totalFilm;
		}

		public Film save(Film film) {
			Film novoFilm = filmRepository.save(film);

			if (novoFilm.getFilmId() != null) {
				return novoFilm;
			} else {
				return null;
			}
		}

		public Film update(Film film, Integer id) {
			film.setFilmId(id);
			// o this se refere ao filmRepository
			return this.save(film);

//			Film film = filmRepository.findById(id).get();
//			atualizarDados(film, novoFilm);
//			return filmRepository.save(film);
		}

}
