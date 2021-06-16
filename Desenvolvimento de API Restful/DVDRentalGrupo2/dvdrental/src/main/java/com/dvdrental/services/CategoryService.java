package com.dvdrental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvdrental.entities.Category;
import com.dvdrental.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	public CategoryRepository categoryRepository;

	public Category findById(Integer id) {
		Category category = categoryRepository.findById(id).get();
		return category;
	}

	public List<Category> findAll() {
		List<Category> listaCategory = categoryRepository.findAll();
		return listaCategory;
	}

	public Long count() {
		Long totalCategory = categoryRepository.count();
		return totalCategory;
	}

	public Category save(Category category) {
		Category novoCategory = categoryRepository.save(category);

		if (novoCategory.getCategoryId() != null) {
			return novoCategory;
		} else {
			return null;
		}
	}

	public Category update(Category category, Integer id) {
		category.setCategoryId(id);
		// o this se refere ao categoryRepository
		return this.save(category);

//		Category category = categoryRepository.findById(id).get();
//		atualizarDados(category, novoCategory);
//		return categoryRepository.save(category);
	}
}
