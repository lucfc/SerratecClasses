package com.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvdrental.entities.Language;
import com.dvdrental.repositories.LanguageRepository;

@Service
public class LanguageService {
	@Autowired
	public LanguageRepository languageRepository;

	public Language findById(Integer id) {
		Language language = languageRepository.findById(id).get();
		return language;
	}

	public List<Language> findAll() {
		List<Language> listaLanguage = languageRepository.findAll();
		return listaLanguage;
	}

	public Long count() {
		Long totalLanguage = languageRepository.count();
		return totalLanguage;
	}

	public Language save(Language language) {
		Language novaLanguage = languageRepository.save(language);

		if (novaLanguage.getLanguageId() != null) {
			return novaLanguage;
		} else {
			return null;
		}
	}

	public Language update(Language language, Integer id) {
		language.setLanguageId(id);
		// o this se refere ao languageRepository
		return this.save(language);

//		Language language = languageRepository.findById(id).get();
//		atualizarDados(language, novaLanguage);
//		return languageRepository.save(language);
	}
}
